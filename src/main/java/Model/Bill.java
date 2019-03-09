package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	private int billId;
	private double total;
	private BusinessTrip busineestrip;
	private Employee employee;
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

	public BusinessTrip getBusineestrip() {
		return this.busineestrip;
	}

	public void setBusineestrip(BusinessTrip busineestrip) {
		this.busineestrip = busineestrip;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<BillItem> getBillItems() {
		return this.BillItems;
	}

	public void setBillItems(List<BillItem> BillItems) {
		this.BillItems = BillItems;
	}

	public BillItem addBillItem(BillItem BillItem) {
		getBillItems().add(BillItem);
		BillItem.setBill(this);

		return BillItem;
	}

	public BillItem removeBillItem(BillItem BillItem) {
		getBillItems().remove(BillItem);
		BillItem.setBill(null);

		return BillItem;
	}

}