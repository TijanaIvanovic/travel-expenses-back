package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the BILL database table.
 * 
 */
@Entity
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BILL_ID")
	private long billId;

	private BigDecimal total;

	//bi-directional many-to-one association to Busineestrip
	@ManyToOne
	private Busineestrip busineestrip;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	private Employee employee;

	//bi-directional many-to-one association to Billitem
	@OneToMany(mappedBy="bill")
	private List<Billitem> billitems;

	public Bill() {
	}

	public long getBillId() {
		return this.billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}


	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Busineestrip getBusineestrip() {
		return this.busineestrip;
	}

	public void setBusineestrip(Busineestrip busineestrip) {
		this.busineestrip = busineestrip;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Billitem> getBillitems() {
		return this.billitems;
	}

	public void setBillitems(List<Billitem> billitems) {
		this.billitems = billitems;
	}

	public Billitem addBillitem(Billitem billitem) {
		getBillitems().add(billitem);
		billitem.setBill(this);

		return billitem;
	}

	public Billitem removeBillitem(Billitem billitem) {
		getBillitems().remove(billitem);
		billitem.setBill(null);

		return billitem;
	}

}