package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the USER$ database table.
 * 
 */
@Entity
@NamedQuery(name="User$.findAll", query="SELECT u FROM User$ u")
public class User$ implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal astatus;

	private String audit$;

	@Temporal(TemporalType.DATE)
	private Date ctime;

	@Column(name="DATATS#")
	private BigDecimal datats_;

	@Column(name="DEFGRP_SEQ#")
	private BigDecimal defgrpSeq_;

	@Column(name="DEFGRP#")
	private BigDecimal defgrp_;

	private BigDecimal defrole;

	private String defschclass;

	@Temporal(TemporalType.DATE)
	private Date exptime;

	@Column(name="EXT_USERNAME")
	private String extUsername;

	private BigDecimal lcount;

	@Temporal(TemporalType.DATE)
	private Date ltime;

	private String name;

	private String password;

	@Temporal(TemporalType.DATE)
	private Date ptime;

	private BigDecimal resource$;

	private BigDecimal spare1;

	private BigDecimal spare10;

	private Timestamp spare11;

	private BigDecimal spare2;

	private BigDecimal spare3;

	private String spare4;

	private String spare5;

	@Temporal(TemporalType.DATE)
	private Date spare6;

	private String spare7;

	private String spare8;

	private BigDecimal spare9;

	@Column(name="TEMPTS#")
	private BigDecimal tempts_;

	@Column(name="TYPE#")
	private BigDecimal type_;

	@Column(name="USER#")
	private BigDecimal user_;

	public User$() {
	}

	public BigDecimal getAstatus() {
		return this.astatus;
	}

	public void setAstatus(BigDecimal astatus) {
		this.astatus = astatus;
	}

	public String getAudit$() {
		return this.audit$;
	}

	public void setAudit$(String audit$) {
		this.audit$ = audit$;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public BigDecimal getDatats_() {
		return this.datats_;
	}

	public void setDatats_(BigDecimal datats_) {
		this.datats_ = datats_;
	}

	public BigDecimal getDefgrpSeq_() {
		return this.defgrpSeq_;
	}

	public void setDefgrpSeq_(BigDecimal defgrpSeq_) {
		this.defgrpSeq_ = defgrpSeq_;
	}

	public BigDecimal getDefgrp_() {
		return this.defgrp_;
	}

	public void setDefgrp_(BigDecimal defgrp_) {
		this.defgrp_ = defgrp_;
	}

	public BigDecimal getDefrole() {
		return this.defrole;
	}

	public void setDefrole(BigDecimal defrole) {
		this.defrole = defrole;
	}

	public String getDefschclass() {
		return this.defschclass;
	}

	public void setDefschclass(String defschclass) {
		this.defschclass = defschclass;
	}

	public Date getExptime() {
		return this.exptime;
	}

	public void setExptime(Date exptime) {
		this.exptime = exptime;
	}

	public String getExtUsername() {
		return this.extUsername;
	}

	public void setExtUsername(String extUsername) {
		this.extUsername = extUsername;
	}

	public BigDecimal getLcount() {
		return this.lcount;
	}

	public void setLcount(BigDecimal lcount) {
		this.lcount = lcount;
	}

	public Date getLtime() {
		return this.ltime;
	}

	public void setLtime(Date ltime) {
		this.ltime = ltime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPtime() {
		return this.ptime;
	}

	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}

	public BigDecimal getResource$() {
		return this.resource$;
	}

	public void setResource$(BigDecimal resource$) {
		this.resource$ = resource$;
	}

	public BigDecimal getSpare1() {
		return this.spare1;
	}

	public void setSpare1(BigDecimal spare1) {
		this.spare1 = spare1;
	}

	public BigDecimal getSpare10() {
		return this.spare10;
	}

	public void setSpare10(BigDecimal spare10) {
		this.spare10 = spare10;
	}

	public Timestamp getSpare11() {
		return this.spare11;
	}

	public void setSpare11(Timestamp spare11) {
		this.spare11 = spare11;
	}

	public BigDecimal getSpare2() {
		return this.spare2;
	}

	public void setSpare2(BigDecimal spare2) {
		this.spare2 = spare2;
	}

	public BigDecimal getSpare3() {
		return this.spare3;
	}

	public void setSpare3(BigDecimal spare3) {
		this.spare3 = spare3;
	}

	public String getSpare4() {
		return this.spare4;
	}

	public void setSpare4(String spare4) {
		this.spare4 = spare4;
	}

	public String getSpare5() {
		return this.spare5;
	}

	public void setSpare5(String spare5) {
		this.spare5 = spare5;
	}

	public Date getSpare6() {
		return this.spare6;
	}

	public void setSpare6(Date spare6) {
		this.spare6 = spare6;
	}

	public String getSpare7() {
		return this.spare7;
	}

	public void setSpare7(String spare7) {
		this.spare7 = spare7;
	}

	public String getSpare8() {
		return this.spare8;
	}

	public void setSpare8(String spare8) {
		this.spare8 = spare8;
	}

	public BigDecimal getSpare9() {
		return this.spare9;
	}

	public void setSpare9(BigDecimal spare9) {
		this.spare9 = spare9;
	}

	public BigDecimal getTempts_() {
		return this.tempts_;
	}

	public void setTempts_(BigDecimal tempts_) {
		this.tempts_ = tempts_;
	}

	public BigDecimal getType_() {
		return this.type_;
	}

	public void setType_(BigDecimal type_) {
		this.type_ = type_;
	}

	public BigDecimal getUser_() {
		return this.user_;
	}

	public void setUser_(BigDecimal user_) {
		this.user_ = user_;
	}

}