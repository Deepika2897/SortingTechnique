package com.SetAndListSorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
class StudentSort1
{
	int stu_id;
	String stu_name;

	//constructor
public StudentSort1(int stu_id, String stu_name)
{
			super();
			this.stu_id = stu_id;
			this.stu_name = stu_name;
}
	@Override
	public String toString()
	{
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + "]";
	}
}
//sorting for student id
class StudentSortCompareId implements Comparator<StudentSort1>
	{

		@Override
		public int compare(StudentSort1 o1, StudentSort1 o2) {
			if(o1.stu_id>o2.stu_id)
			   return 1;
			else if(o1.stu_id<o2.stu_id)
				return -1;
			else
				return 0;
		}
		
	}

//sorting for student name
class StudentSortCompareName implements Comparator<StudentSort1>
	{

		@Override
		public int compare(StudentSort1 o1, StudentSort1 o2) {
			
				return o1.stu_name.compareTo(o2.stu_name);
		}
		
	}


public class TreeSetSorting {

	public static void main(String[] args) {
		//add which part we need to sort
		TreeSet<StudentSort1> tsob=new TreeSet<StudentSort1>(new StudentSortCompareId());
		StudentSort1 sob1=new StudentSort1(1, "DEEPI");
		StudentSort1 sob2=new StudentSort1(2, "KAVI");
		StudentSort1 sob3=new StudentSort1(3, "BISMI");
		StudentSort1 sob4=new StudentSort1(4, "VIJAY");
		//adding objects
		tsob.add(sob4);
		tsob.add(sob1);
		tsob.add(sob3);
		tsob.add(sob2);
		//before sorting
		System.out.println(tsob);
		//after sorting
		Iterator<StudentSort1> itob=tsob.iterator();
		while(itob.hasNext())
		{
			StudentSort1 stob=itob.next();
			System.out.println(stob.stu_id+" "+stob.stu_name);
		}
	System.out.println("after sorting id");
	Iterator<StudentSort1> itob1=tsob.iterator();
	while(itob1.hasNext())
	{
		StudentSort1 stob1=itob1.next();
		System.out.println(stob1.stu_id+" "+stob1.stu_name);
	}
	System.out.println("----------------------------------");
	
	//sorting based on  names 
	TreeSet<StudentSort1> tsob1=new TreeSet<StudentSort1>(new StudentSortCompareName());
	StudentSort1 sob11=new StudentSort1(2, "DEEPI");
	StudentSort1 sob21=new StudentSort1(3, "KAVI");
	StudentSort1 sob31=new StudentSort1(1, "BISMI");
	StudentSort1 sob41=new StudentSort1(4, "VIJAY");
	//adding objects
	tsob1.add(sob41);
	tsob1.add(sob11);
	tsob1.add(sob31);
	tsob1.add(sob21);
	System.out.println(tsob1);
	//after sorting
	Iterator<StudentSort1> itob3=tsob1.iterator();
	while(itob3.hasNext())
	{
		StudentSort1 stob2=itob3.next();
		System.out.println(stob2.stu_id+" "+stob2.stu_name);
	}
	System.out.println("after sorting name");
	//iteration
	Iterator<StudentSort1> itob4=tsob1.iterator();
	while(itob4.hasNext())
	{
		StudentSort1 stob3=itob4.next();
		System.out.println(stob3.stu_id+" "+stob3.stu_name);
	}
}
}


