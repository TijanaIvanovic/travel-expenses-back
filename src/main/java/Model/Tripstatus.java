package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TRIPSTATUS database table.
 * 
 */
@Entity
@NamedQuery(name="Tripstatus.findAll", query="SELECT t FROM Tripstatus t")
public class Tripstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idts;

	private String name;

	//bi-directional many-to-one association to Busineestrip
	@OneToMany(mappedBy="tripstatus")
	private List<Busineestrip> busineestrips;

	public Tripstatus() {
	}

	public long getIdts() {
		return this.idts;
	}

	public void setIdts(long idts) {
		this.idts = idts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Busineestrip> getBusineestrips() {
		return this.busineestrips;
	}

	public void setBusineestrips(List<Busineestrip> busineestrips) {
		this.busineestrips = busineestrips;
	}

	public Busineestrip addBusineestrip(Busineestrip busineestrip) {
		getBusineestrips().add(busineestrip);
		busineestrip.setTripstatus(this);

		return busineestrip;
	}

	public Busineestrip removeBusineestrip(Busineestrip busineestrip) {
		getBusineestrips().remove(busineestrip);
		busineestrip.setTripstatus(null);

		return busineestrip;
	}

}