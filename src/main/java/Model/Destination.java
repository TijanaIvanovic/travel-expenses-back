package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the DESTINATION database table.
 * 
 */
@Entity
@NamedQuery(name="Destination.findAll", query="SELECT d FROM Destination d")
public class Destination implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idd;

	private String city;

	private BigDecimal price;

	private BigDecimal zipcode;

	//bi-directional many-to-one association to Busineestrip
	@OneToMany(mappedBy="destination")
	private List<Busineestrip> busineestrips;

	//bi-directional many-to-one association to Price
	@ManyToOne
	@JoinColumn(name="PRICE_IDP")
	private Price priceBean;

	public Destination() {
	}

	public long getIdd() {
		return this.idd;
	}

	public void setIdd(long idd) {
		this.idd = idd;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(BigDecimal zipcode) {
		this.zipcode = zipcode;
	}

	public List<Busineestrip> getBusineestrips() {
		return this.busineestrips;
	}

	public void setBusineestrips(List<Busineestrip> busineestrips) {
		this.busineestrips = busineestrips;
	}

	public Busineestrip addBusineestrip(Busineestrip busineestrip) {
		getBusineestrips().add(busineestrip);
		busineestrip.setDestination(this);

		return busineestrip;
	}

	public Busineestrip removeBusineestrip(Busineestrip busineestrip) {
		getBusineestrips().remove(busineestrip);
		busineestrip.setDestination(null);

		return busineestrip;
	}

	public Price getPriceBean() {
		return this.priceBean;
	}

	public void setPriceBean(Price priceBean) {
		this.priceBean = priceBean;
	}

}