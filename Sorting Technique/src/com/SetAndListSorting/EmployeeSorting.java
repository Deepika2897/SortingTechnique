package com.SetAndListSorting;
//sorting for user-defined data type
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class Employee
{

	int emp_id;
	String emp_name,emp_dept;
	float emp_sal;

	public Employee(int emp_id, String emp_name, String emp_dept, float emp_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_dept = emp_dept;
		this.emp_sal = emp_sal;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_dept=" + emp_dept + ", emp_sal="
				+ emp_sal + "]";
	}
}
//class sorting is based on employee id
//To sorting we need to implements the comparator interface
class MySortCompareEmpId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.emp_id>o2.emp_id)
			return 1;
		else if(o1.emp_id<o2.emp_id)
			return -1;
		else
			return 0;
	}

}

//class sorting is based on employee salary
class MySortCompareEmpSal implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.emp_sal>o2.emp_sal)
			return 1;
		else if(o1.emp_sal<o2.emp_sal)
			return -1;
		else
			return 0;
	}

}
//class sorting is based on employee name
class MySortCompareEmpName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.emp_name.compareTo(o2.emp_name);
	}}
//class sorting is based on employee department
class MySortCompareEmpDept implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.emp_dept.compareTo(o2.emp_dept);
	}}

public class EmployeeSorting {

	public static void main(String[] args) {
		Employee emp1=new Employee(1, "surya", "electronics", 6000.3f);
		Employee emp2=new Employee(2, "vijay", "electricals", 5000.4f);
		Employee emp3=new Employee(3, "ajith", "mech", 3000.9f);
		Employee emp4=new Employee(4, "siva", "computer science", 7000.4f);
		ArrayList<Employee> eob=new ArrayList<Employee>();

		eob.add(emp4);
		eob.add(emp1);
		eob.add(emp2);
		eob.add(emp3);

		//before sorting
		Iterator<Employee> eiob=eob.iterator();
		System.out.println("before emp id sorting");
		while(eiob.hasNext())
		{
			Employee empob=eiob.next();
			System.out.println(empob.emp_id+" "+empob.emp_name+" "+empob.emp_dept+" "+empob.emp_sal);
		}
		 System.out.println("-------------------------------------------");
		
		 //after sorting based on employee id
		Collections.sort(eob,new MySortCompareEmpId());
		Iterator<Employee>  eiob1=eob.iterator();
		System.out.println("after emp id sorting");
		while(eiob1.hasNext())
		{
			Employee empob1=eiob1.next();
			System.out.println(empob1.emp_id+" "+empob1.emp_name+" "+empob1.emp_dept+" "+empob1.emp_sal);
		}


		System.out.println("-------------------------------------------");

		//after sorting based on employee salary
		Collections.sort(eob,new MySortCompareEmpSal());
		Iterator<Employee>  eiob2=eob.iterator();
		System.out.println("after emp salary sorting");
		while(eiob2.hasNext())
		{
			Employee empob2=eiob2.next();
			System.out.println(empob2.emp_id+" "+empob2.emp_name+" "+empob2.emp_dept+" "+empob2.emp_sal);
		}


		System.out.println("-------------------------------------------");
		//after sorting based on employee name
		Collections.sort(eob,new MySortCompareEmpName());
		Iterator<Employee>  eiob3=eob.iterator();
		System.out.println("after emp name sorting");
		while(eiob3.hasNext())
		{
			Employee empob3=eiob3.next();
			System.out.println(empob3.emp_id+" "+empob3.emp_name+" "+empob3.emp_dept+" "+empob3.emp_sal);
		}
		System.out.println("-------------------------------------------");
		//after sorting based on employee department
		Collections.sort(eob,new MySortCompareEmpDept());
		Iterator<Employee>  eiob4=eob.iterator();
		System.out.println("after emp department sorting");
		while(eiob4.hasNext())
		{
			Employee empob4=eiob4.next();
			System.out.println(empob4.emp_id+" "+empob4.emp_name+" "+empob4.emp_dept+" "+empob4.emp_sal);
		}  

	}

}
