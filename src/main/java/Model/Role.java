package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int idr;

	private String name;

	public Role() {
	}

	public int getIdr() {
		return this.idr;
	}

	public void setIdr(int idr) {
		this.idr = idr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}