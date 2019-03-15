package com.TravelCosts.TravelCosts;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idbt")
@Entity
public class Businesstrip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="btrip_seq_gen", sequenceName="btrip_seq", initialValue =  1)	
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="btrip_seq_gen")
	@Column(name="IDBT")
	private int idbt;

	@Temporal(TemporalType.DATE)
	private Date enddate;
	
	@Temporal(TemporalType.DATE)
	private Date startdate;

	@OneToMany(mappedBy="businesstrip")
	private List<Bill> bills;

	@ManyToOne
	@JoinColumn(name="destination_idd", foreignKey=@ForeignKey(name="businesstrip_destination_fk"))
	private Destination destination;

	@ManyToOne
	@JoinColumn(name="tripstatus_idts", foreignKey=@ForeignKey(name="businesstrip_tripstatus_fk"))
	private Tripstatus tripstatus;


	public Businesstrip() {
	}

	public int getIdbt() {
		return this.idbt;
	}

	public void setIdbt(int idbt) {
		this.idbt = idbt;
	}


	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}


	public Destination getDestination() {
		return this.destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Tripstatus getTripstatus() {
		return this.tripstatus;
	}

	public void setTripstatus(Tripstatus tripstatus) {
		this.tripstatus = tripstatus;
	}



}