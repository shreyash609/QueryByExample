package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {

	@Id 
	private Integer eid;
	private String ename;
	private String eemail;
	private String egender;
	private String eloc;
	
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public void setEgender(String egender) {
		this.egender = egender;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", egender=" + egender + ", eloc=" + eloc
				+ "]";
	}
}
