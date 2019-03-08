package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the EMPLOYEE database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long ide;

	private String email;

	@Column(name="EMPLOYEESTATUS_IDES")
	private BigDecimal employeestatusIdes;

	private String firstname;

	private String lastname;

	@Column(name="USER_IDU")
	private BigDecimal userIdu;

	@Column(name="USER_ROLE_IDR")
	private BigDecimal userRoleIdr;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="employee")
	private List<Bill> bills;

	//bi-directional many-to-one association to Tripofemployee
	@OneToMany(mappedBy="employee")
	private List<Tripofemployee> tripofemployees;

	public Employee() {
	}

	public long getIde() {
		return this.ide;
	}

	public void setIde(long ide) {
		this.ide = ide;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEmployeestatusIdes() {
		return this.employeestatusIdes;
	}

	public void setEmployeestatusIdes(BigDecimal employeestatusIdes) {
		this.employeestatusIdes = employeestatusIdes;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigDecimal getUserIdu() {
		return this.userIdu;
	}

	public void setUserIdu(BigDecimal userIdu) {
		this.userIdu = userIdu;
	}

	public BigDecimal getUserRoleIdr() {
		return this.userRoleIdr;
	}

	public void setUserRoleIdr(BigDecimal userRoleIdr) {
		this.userRoleIdr = userRoleIdr;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setEmployee(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setEmployee(null);

		return bill;
	}

	public List<Tripofemployee> getTripofemployees() {
		return this.tripofemployees;
	}

	public void setTripofemployees(List<Tripofemployee> tripofemployees) {
		this.tripofemployees = tripofemployees;
	}

	public Tripofemployee addTripofemployee(Tripofemployee tripofemployee) {
		getTripofemployees().add(tripofemployee);
		tripofemployee.setEmployee(this);

		return tripofemployee;
	}

	public Tripofemployee removeTripofemployee(Tripofemployee tripofemployee) {
		getTripofemployees().remove(tripofemployee);
		tripofemployee.setEmployee(null);

		return tripofemployee;
	}

}