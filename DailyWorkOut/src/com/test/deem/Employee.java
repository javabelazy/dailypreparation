/**
 * 
 */
package com.test.deem;

/**
 * @author apple
 *
 */
public class Employee {
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//	
//		Employee e = (Employee) obj;
//		
//		if(e.id == this.id && e.name.equals(this.name))
//			return true;
//		else 
//			return false;
//		
//	}

}
