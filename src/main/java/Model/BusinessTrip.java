package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class BusinessTrip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idbt;

	@Temporal(TemporalType.DATE)
	private Date enddate;
	
	@Temporal(TemporalType.DATE)
	private Date startdate;

	@OneToMany(mappedBy="businesstrip")
	private List<Bill> bills;

	@ManyToOne
	@JoinColumn(name="destination_idd")
	private Destination destination;

	@ManyToOne
	@JoinColumn(name="tripstatus_idts")
	private TripStatus tripstatus;

	@OneToMany(mappedBy="businesstrip")
	private List<TripOfEmployee> tripofemployees;

	public BusinessTrip() {
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

	public TripStatus getTripstatus() {
		return this.tripstatus;
	}

	public void setTripstatus(TripStatus tripstatus) {
		this.tripstatus = tripstatus;
	}

	public List<TripOfEmployee> getTripOfEmployees() {
		return this.tripofemployees;
	}

	public void setTripofEmployees(List<TripOfEmployee> tripofemployees) {
		this.tripofemployees = tripofemployees;
	}



}