package techmojo.beans;

public class Person {
	int id;
	String name, email;
	Address addr;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String email, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addr = addr;
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", addr=" + addr + "]";
	}
	
	
	
	
}
