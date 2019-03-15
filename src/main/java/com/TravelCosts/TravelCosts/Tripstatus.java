package com.TravelCosts.TravelCosts;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Tripstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@SequenceGenerator(name="tripst_seq_gen", sequenceName="tripst_seq", initialValue =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="tripst_seq_gen")
	@Column(name="IDTS")
	private int idts;

	private String name;
	
	@OneToMany(mappedBy="tripstatus")
	private List<Businesstrip> businesstrips;

	public Tripstatus() {
	}

	public int getIdts() {
		return this.idts;
	}

	public void setIdts(int idts) {
		this.idts = idts;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Businesstrip> getBusinesstrips() {
		return this.businesstrips;
	}

	public void setBusinesstrips(List<Businesstrip> businesstrips) {
		this.businesstrips = businesstrips;
	}


}