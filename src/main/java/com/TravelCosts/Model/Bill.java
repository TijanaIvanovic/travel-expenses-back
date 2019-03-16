package com.TravelCosts.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idb")
@Entity
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@SequenceGenerator(name="bill_seq_gen", sequenceName="bill_seq", initialValue = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="bill_seq_gen")
	@Column(name="IDB")
	private int idb;	
	
	private double total;
	
	@ManyToOne
	@JoinColumn(name="businesstrip_idbt", foreignKey=@ForeignKey(name="bill_businesstrip_fk"))
	private Businesstrip businesstrip;
	
	@OneToMany(mappedBy="bill")
	private List<Billitem> Billitems;

	public Bill() {
	}
	
	public int getIdb() {
		return idb;
	}
	
	public void setIdb(int idb) {
		this.idb = idb;
	}
	
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Businesstrip getBusinesstrip() {
		return this.businesstrip;
	}

	public void setBusineestrip(Businesstrip busineestrip) {
		this.businesstrip = businesstrip;
	}


	public List<Billitem> getBillItems() {
		return this.Billitems;
	}

	public void setBillItems(List<Billitem> BillItems) {
		this.Billitems = BillItems;
	}


}