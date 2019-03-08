package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BUSINEESTRIP database table.
 * 
 */
@Entity
@NamedQuery(name="Busineestrip.findAll", query="SELECT b FROM Busineestrip b")
public class Busineestrip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idbt;

	@Column(name="EMPLOYEE_IDE")
	private BigDecimal employeeIde;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	

	@Column(name="INVOICE_IDI")
	private BigDecimal invoiceIdi;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="busineestrip")
	private List<Bill> bills;

	//bi-directional many-to-one association to Destination
	@ManyToOne
	private Destination destination;

	//bi-directional many-to-one association to Tripstatus
	@ManyToOne
	private Tripstatus tripstatus;

	//bi-directional many-to-one association to Tripofemployee
	@OneToMany(mappedBy="busineestrip")
	private List<Tripofemployee> tripofemployees;

	public Busineestrip() {
	}

	public long getIdbt() {
		return this.idbt;
	}

	public void setIdbt(long idbt) {
		this.idbt = idbt;
	}

	public BigDecimal getEmployeeIde() {
		return this.employeeIde;
	}

	public void setEmployeeIde(BigDecimal employeeIde) {
		this.employeeIde = employeeIde;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public BigDecimal getInvoiceIdi() {
		return this.invoiceIdi;
	}

	public void setInvoiceIdi(BigDecimal invoiceIdi) {
		this.invoiceIdi = invoiceIdi;
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

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setBusineestrip(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setBusineestrip(null);

		return bill;
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

	public List<Tripofemployee> getTripofemployees() {
		return this.tripofemployees;
	}

	public void setTripofemployees(List<Tripofemployee> tripofemployees) {
		this.tripofemployees = tripofemployees;
	}

	public Tripofemployee addTripofemployee(Tripofemployee tripofemployee) {
		getTripofemployees().add(tripofemployee);
		tripofemployee.setBusineestrip(this);

		return tripofemployee;
	}

	public Tripofemployee removeTripofemployee(Tripofemployee tripofemployee) {
		getTripofemployees().remove(tripofemployee);
		tripofemployee.setBusineestrip(null);

		return tripofemployee;
	}

}