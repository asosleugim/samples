package oca.samples.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContractTest {

	
	public static void main(String[] args) {

		Map<EmployeeKey, String> cache = loadEmpCache();
		
		EmployeeKey lookUpKey = new EmployeeKey("101","11101074");
		
		String empName = cache.get(lookUpKey);
		
		System.out.println(empName);
		
		// Using Sets
		
		EmployeeKey sek1 = new EmployeeKey("100","10101082");
		EmployeeKey sek2 = new EmployeeKey("101","11101074");
		EmployeeKey sek3 = new EmployeeKey("102","11101094");
		EmployeeKey sek4 = new EmployeeKey("101","11101074");
		EmployeeKey sek5 = new EmployeeKey("102","11101094");
		
		Set<EmployeeKey> set = new HashSet<>();
		set.add(sek1);
		set.add(sek2);
		set.add(sek3);
		set.add(sek4);
		set.add(sek5);
		
		System.out.println(set);


	}

static Map<EmployeeKey, String> loadEmpCache(){
	EmployeeKey ek1 = new EmployeeKey("100","10101082");
	EmployeeKey ek2 = new EmployeeKey("101","11101074");
	EmployeeKey ek3 = new EmployeeKey("102","11101094");

	Map<EmployeeKey, String> cache = new HashMap<>();
	cache.put(ek1, "Bob");
	cache.put(ek2, "Steve");
	cache.put(ek3, "Robert");

	return cache;
}

}

class EmployeeKey{
	String empId;
	String dob;
	
	public EmployeeKey(String empId, String dob) {
		super();
		this.empId = empId;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeKey [empId=" + empId + ", dob=" + dob + "]";
	}

}
