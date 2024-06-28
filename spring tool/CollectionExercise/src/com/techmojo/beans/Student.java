package com.techmojo.beans;

//import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	int id;
	String name;
	
	//now use of lambok
////	@Override
////	public int hashCode() {
////		int code = 5;
////		code = (7*code) + id;
////		code = (7*code) + name.hashCode();
//////		code = (7*code) + email
////		return code;
////	}
////	@Override
////	public boolean equals(Object object) {
////		Student other = (Student) object;
////		if(this.id == other.id && this.name.equals(other.getName()))
////				return true;
////		return false;
////	}
//	
//	public Student(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
//	
}
