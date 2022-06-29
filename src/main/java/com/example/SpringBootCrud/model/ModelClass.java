package com.example.SpringBootCrud.model;

import javax.persistence.*;

@Entity
@Table(name="patientdetails")
public class ModelClass {
	
	
	@Id
	@GeneratedValue
	private int pid;
	private  String pname;
	private String pdesc;
	
	
	public ModelClass() {
		super();
	}
	public ModelClass(int pid, String pname, String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	@Override
	public String toString() {
		return "ModelClass [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + "]";
	}
	
	

}
