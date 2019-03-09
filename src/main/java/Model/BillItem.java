package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class BillItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idbi;
	private double cost;
	private String name;

	@ManyToOne
	@JoinColumn(name="bill_bill_id")
	private Bill bill;

	public BillItem() {
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