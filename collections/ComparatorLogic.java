package oca.samples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
		
		
		long millisInDay = 60 * 60 * 24 * 1000;
		long currentTime = new Date().getTime();
		long dateOnly = (currentTime / millisInDay) * millisInDay;
		Date clearDate = new Date(dateOnly);
		
		long millisInDay2 = 60 * 60 * 24 * 10020;
		long currentTime2 = new Date().getTime();
		long dateOnly2 = (currentTime2 / millisInDay2) * millisInDay2;
		Date clearDate2 = new Date(dateOnly2);
		
		long millisInDay3 = 60 * 60 * 24 * 11080;
		long currentTime3 = new Date().getTime();
		long dateOnly3 = (currentTime3 / millisInDay3) * millisInDay3;
		Date clearDate3 = new Date(dateOnly3);

		objEmp.setLastName("Sosa");
		objEmp.setBeginDate(clearDate);
		objEmp.setEndDate(new Date());
		objEmp2.setLastName("Chavez");
		objEmp2.setBeginDate(clearDate2);
		objEmp2.setEndDate(clearDate3);
		objEmp3.setLastName("Martinez");
		objEmp3.setBeginDate(clearDate3);
		objEmp3.setEndDate(clearDate2);
		objEmp4.setLastName("Lopez");
		objEmp4.setBeginDate(new Date());
		objEmp4.setEndDate(clearDate);
		
		

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(objEmp);
		empList.add(objEmp2);
		empList.add(objEmp3);
		empList.add(objEmp4);

		Collections.sort(empList);

		Iterator<Employee> it = empList.iterator();

		Date test = objEmp.getEndDate();
		
		
		while (it.hasNext()) {
			Employee obj =  it.next();
			System.out.println(obj.getBeginDate() );
		
			if(test.before(obj.getEndDate())){
				test=obj.getEndDate();
			}
		}
System.out.println("Last end date: " + test);
	}

}
