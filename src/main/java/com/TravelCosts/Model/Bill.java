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
	@SequenceGenerator(name="bill_seq_gen", sequenceName="bill_seq", allocationSize =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="bill_seq_gen")
	@Column(name="IDB")
	private int idb;	
	
	
	@ManyToOne
	@JoinColumn(name="BILL_IDBT", foreignKey=@ForeignKey(name="bill_businesstrip_fk"))
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

	public Businesstrip getBusinesstrip() {
		return businesstrip;
	}

	public void setBusinesstrip(Businesstrip businesstrip) {
		this.businesstrip = businesstrip;
	}

	public List<Billitem> getBillItems() {
		return this.Billitems;
	}

	public void setBillItems(List<Billitem> BillItems) {
		this.Billitems = BillItems;
	}


}