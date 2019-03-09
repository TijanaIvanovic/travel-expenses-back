package Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class DestinationWage implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int iddw;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="destination_idd")	
	private Destination idd;
	@ManyToOne
	@JoinColumn(name="wage_idw")	
	private Wage idw;
	
	public int getIddw() {
		return iddw;
	}
	public void setIddw(int iddw) {
		this.iddw = iddw;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Destination getIdd() {
		return idd;
	}
	public void setIdd(Destination idd) {
		this.idd = idd;
	}
	public Wage getIdw() {
		return idw;
	}
	public void setIdw(Wage idw) {
		this.idw = idw;
	}
	
	

}
