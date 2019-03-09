package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PRICE database table.
 * 
 */
@Entity
@NamedQuery(name="Price.findAll", query="SELECT p FROM Price p")
public class Price implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idp;

	private BigDecimal amount;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	//bi-directional many-to-one association to Destination
	@OneToMany(mappedBy="priceBean")
	private List<Destination> destinations;

	public Price() {
	}

	public long getIdp() {
		return this.idp;
	}

	public void setIdp(long idp) {
		this.idp = idp;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public List<Destination> getDestinations() {
		return this.destinations;
	}

	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public Destination addDestination(Destination destination) {
		getDestinations().add(destination);
		destination.setPriceBean(this);

		return destination;
	}

	public Destination removeDestination(Destination destination) {
		getDestinations().remove(destination);
		destination.setPriceBean(null);

		return destination;
	}

}