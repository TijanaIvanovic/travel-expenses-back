package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Wage implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idw;

	private double amount;


	public Wage() {
	}


	public int getIdw() {
		return idw;
	}


	public void setIdw(int idw) {
		this.idw = idw;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}



}