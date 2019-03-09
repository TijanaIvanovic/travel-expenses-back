package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="BILL_ID")
	private int billId;
	@Column
	private double total;
	@ManyToOne
	@JoinColumn(name="businesstrip_idbt")
	private BusinessTrip businesstrip;
	@OneToMany(mappedBy="bill")
	private List<BillItem> BillItems;

	public Bill() {
	}

	public int getBillId() {
		return this.billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}


	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public BusinessTrip getBusinesstrip() {
		return this.businesstrip;
	}

	public void setBusineestrip(BusinessTrip busineestrip) {
		this.businesstrip = businesstrip;
	}


	public List<BillItem> getBillItems() {
		return this.BillItems;
	}

	public void setBillItems(List<BillItem> BillItems) {
		this.BillItems = BillItems;
	}


}