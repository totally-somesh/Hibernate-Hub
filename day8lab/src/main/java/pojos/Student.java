package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private Integer studentId;
	@Column(name="fname",length = 30)
private String firstname;
	@Column(name="lname",length=30)
private String lastname;
	@Column(name="dob",nullable = true)
private LocalDate dob;
	@Column(length=30,nullable = true)
	private String email;
	@Column(length=30, unique=true)
	
	private String password;
	@Enumerated(EnumType.STRING)
	private Course type;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String first_name, String last_name, LocalDate dob, String email, String password, Course type) {
		super();
		this.firstname = first_name;
		this.lastname = last_name;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.type = type;
	}
	public Integer getSid() {
		return studentId;
	}
	public void setSid(Integer sid) {
		this.studentId = sid;
	}
	public String getFirst_name() {
		return firstname;
	}
	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}
	public String getLast_name() {
		return lastname;
	}
	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Course getType() {
		return type;
	}
	public void setType(Course type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [sid=" + studentId + ", first_name=" + firstname + ", last_name=" + lastname + ", dob=" + dob
				+ ", email=" + email + ", password=" + password + ", type=" + type + "]";
	}  
	
	
	

}
