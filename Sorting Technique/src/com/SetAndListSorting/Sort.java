package com.SetAndListSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	int sid;
	String sname;
	float fees;
	public Student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}

}
//for sorting user defined object in ArrayList
class MySortCompare implements Comparator<Student>
{
//sorting based on id
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.sid>o2.sid)
		return 1;
		else if(o1.sid<o2.sid)
			return -1;
		else 
			return 0;
	}
	
}
//based on fees
class MySortComparefees implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.fees>o2.fees)
			return 1;
			else if(o1.fees<o2.fees)
				return -1;
			else 
				return 0;
	}
}

//based on Name sort
class MySortCompareName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.sname.compareTo(o2.sname);
	}
	
}

public class Sort {

	public static void main(String[] args) {
		
		Student s2=new Student(2, "DEEPI", 7543.2f);
		Student s1=new Student(1, "VIJAY", 6543.2f);
		Student s3=new Student(3, "BISMI", 321.2f);
		System.out.println(s1);
		
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(s2);
		slist.add(s1);
		slist.add(s3);
		System.out.println(slist);
		
		//Iterator 
		System.out.println("Before sorting");
		Iterator<Student> sit=slist.iterator();
		while(sit.hasNext()) {
		Student sob=sit.next();
		System.out.println(sob.sid+" "+sob.sname+" "+sob.fees);
		}
		
		//to sort student data based on sid
		MySortCompare iob=new MySortCompare();
		Collections.sort(slist,iob);
		System.out.println("After sort based on id");
		
		Iterator<Student> sit1=slist.iterator();
		while(sit1.hasNext()) {
		Student sob1=sit1.next();
		System.out.println(sob1.sid+" "+sob1.sname+" "+sob1.fees);
		}
		
		
		//to sort student data based on feees
				Collections.sort(slist,new MySortComparefees());
				System.out.println("After sort based on fees");
				
				Iterator<Student> sit2=slist.iterator();
				while(sit2.hasNext()) {
				Student sob2=sit2.next();
				System.out.println(sob2.sid+" "+sob2.sname+" "+sob2.fees);
				}
				
		//Based on Name
			Collections.sort(slist,new MySortCompareName());
			System.out.println("Sort based on Names");
			Iterator<Student> sit3=slist.iterator();
			while(sit3.hasNext()) {
				Student sob3=sit3.next();
				System.out.println(sob3.sid+" "+sob3.sname+" "+sob3.fees);
			}
			
	}
	

}
	
