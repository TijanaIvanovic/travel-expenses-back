package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

public class Destination implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idd;

	private String city;

	private DestinationWage iddw;

	private double zipcode;

	private List<BusinessTrip> businesstrips;


	public Destination() {
	}

	public int getIdd() {
		return this.idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(double zipcode) {
		this.zipcode = zipcode;
	}

	public List<BusinessTrip> getBusinesstrips() {
		return this.businesstrips;
	}

	public void setBusinesstrips(List<BusinessTrip> businesstrips) {
		this.businesstrips = businesstrips;
	}

	
	public DestinationWage getIddw() {
		return iddw;
	}

	public void setIddw(DestinationWage iddw) {
		this.iddw = iddw;
	}
	
	


}