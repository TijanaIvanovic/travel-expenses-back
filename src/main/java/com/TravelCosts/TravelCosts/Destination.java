package com.TravelCosts.TravelCosts;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.math.BigDecimal;
import java.util.List;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idd")
@Entity

public class Destination implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="dest_seq_gen", sequenceName="dest_seq", initialValue =  1)	
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="dest_seq_gen")
	@Column(name="IDD")
	
	private int idd;
	
	private String city;
	
	private double zipcode;

	@OneToMany(mappedBy="destination")
	private List<Destinationwage> destinationwages;
	

	@OneToMany(mappedBy="destination")
	private List<Businesstrip> businesstrips;


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

	public List<Businesstrip> getBusinesstrips() {
		return this.businesstrips;
	}

	public void setBusinesstrips(List<Businesstrip> businesstrips) {
		this.businesstrips = businesstrips;
	}

	public List<Destinationwage> getDestinationwages() {
		return destinationwages;
	}

	public void setDestinationwages(List<Destinationwage> destinationwages) {
		this.destinationwages = destinationwages;
	}

	

	
	


}