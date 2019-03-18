package com.TravelCosts.Model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.math.BigDecimal;
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idbi")

@Entity
public class Billitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="billitem_seq_gen", sequenceName="billitem_seq", allocationSize =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="billitem_seq_gen")	
	@Column(name="IDBI")
	private int idbi;
	
	private double cost;
	
	private String name;

	@ManyToOne
	@JoinColumn(name="BILL_IDB", foreignKey=@ForeignKey(name="billitem_bill_fk"))
	private Bill bill;

	public Billitem() {
	}

	public int getIdbi() {
		return this.idbi;
	}

	public void setIdbi(int idbi) {
		this.idbi = idbi;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill billid) {
		this.bill = billid;
	}

	

	

}