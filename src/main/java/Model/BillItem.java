package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BILLITEM database table.
 * 
 */
@Entity
@NamedQuery(name="Billitem.findAll", query="SELECT b FROM Billitem b")
public class Billitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idbi;

	private BigDecimal cost;

	private String name;

	//bi-directional many-to-one association to Bill
	@ManyToOne
	private Bill bill;

	public Billitem() {
	}

	public long getIdbi() {
		return this.idbi;
	}

	public void setIdbi(long idbi) {
		this.idbi = idbi;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bill getBill() {
		return this.bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}