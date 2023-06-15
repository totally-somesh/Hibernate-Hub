package pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//Mandatory annotation
@Table(name="Student1")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid;
     @Column(name="first_name")
	private String fname;
     @Column(name="last_name")
	private String lname;
     @Column(name="admissiondate")
	private LocalDate admmision_date;
	 @Enumerated(EnumType.STRING)
     @Column(name="course")
	private Course type;
     @Column(name="fee")
	private double fees;
     
	public Student() {
		super();
		
	}
	public Student( String fname, String lname, LocalDate admmision_date, Course type, double fees) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.admmision_date = admmision_date;
		this.type = type;
		this.fees = fees;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getAdmmision_date() {
		return admmision_date;
	}
	public void setAdmmision_date(LocalDate admmision_date) {
		this.admmision_date = admmision_date;
	}
	public Course getType() {
		return type;
	}
	public void setType(Course type) {
		this.type = type;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", admmision_date=" + admmision_date
				+ ", type=" + type + ", fees=" + fees + "]";
	}
     
     
	
	
	
	
	
	
	
}
