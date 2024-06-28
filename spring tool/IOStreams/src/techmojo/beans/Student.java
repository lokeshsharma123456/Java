package techmojo.beans;

import java.io.Serializable;

public class Student implements Serializable{
	int id;
	transient String name;
	String email;
	int sub1, sub2, sub3;
	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Student(int id, String name, String email, int sub1, int sub2, int sub3) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + "]";
	}
	public int getTotal() {
		return sub1 + sub2 + sub3;
	}
//	@Override
	public String toCSV() {
		return id + ", " + name + ", " + email +  ", " + sub1 + ", " + sub2 + ", " + sub3 + ", " + getTotal() + '\n';
	}
	
}
