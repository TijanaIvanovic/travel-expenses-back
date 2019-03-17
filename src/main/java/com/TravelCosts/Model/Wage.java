package com.TravelCosts.Model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idw")
@Entity
public class Wage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="wage_seq_gen")
	@SequenceGenerator(name="wage_seq_gen", sequenceName="wage_seq", allocationSize=1)	
	@Column(name="IDW")
	private int idw;

	private double amount;


	public Wage() {
	}


	public int getIdw() {
		return idw;
	}


	public void setIdw(int idw) {
		this.idw = idw;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}



}