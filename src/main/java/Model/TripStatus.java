package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class TripStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idts;

	private String name;
	
	@OneToMany(mappedBy="tripstatus")
	private List<BusinessTrip> businesstrips;

	public TripStatus() {
	}

	public int getIdts() {
		return this.idts;
	}

	public void setIdts(int idts) {
		this.idts = idts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BusinessTrip> getBusinesstrips() {
		return this.businesstrips;
	}

	public void setBusinesstrips(List<BusinessTrip> businesstrips) {
		this.businesstrips = businesstrips;
	}


}