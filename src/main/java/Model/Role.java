package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ROLE" database table.
 * 
 */
@Entity
@Table(name="\"ROLE\"")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idr;

	private String name;

	public Role() {
	}

	public long getIdr() {
		return this.idr;
	}

	public void setIdr(long idr) {
		this.idr = idr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}