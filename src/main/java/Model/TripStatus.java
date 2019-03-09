package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

public class TripStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idts;

	private String name;

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