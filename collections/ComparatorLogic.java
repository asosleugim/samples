package oca.samples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee objEmp = new Employee();
		Employee objEmp2 = new Employee();
		Employee objEmp3 = new Employee();
		Employee objEmp4 = new Employee();

		objEmp.setLastName("Sosa");
		objEmp2.setLastName("Chavez");
		objEmp3.setLastName("Martinez");
		objEmp4.setLastName("Lopez");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(objEmp);
		empList.add(objEmp2);
		empList.add(objEmp3);
		empList.add(objEmp4);

		Collections.sort(empList);

		Iterator<Employee> it = empList.iterator();

		while (it.hasNext()) {
			Employee obj =  it.next();
			System.out.println(obj.getLastName());
		}

	}

}
