package oca.samples.collections;

import java.util.Date;

public class Employee implements Comparable<Employee>
{

	private String firstName;
	private String lastName;
	private Date beginDate;
	private Date endDate;

	Employee(){
		firstName = "";
		lastName = "";
		beginDate = new Date();
		endDate = new Date();
	}
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Employee emp) {
	
		if ( beginDate.after(emp.beginDate) )
	        return 1;
	    else if ( beginDate.before(emp.beginDate) )
	        return -1;

	    else 
	    	return 0;
	
	}
}
