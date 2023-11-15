package studentdetabseapp;

import java.util.Scanner;

public class student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses=null;
	private int tuitionbalance;
	private static int costofcourses=600;
	private static int id=1000;
	
	// constructor for students name and year
	public student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstname=sc.nextLine();
		
		System.out.println("Enter student last name:");
		this.lastname=sc.nextLine();
		
		System.out.println("1-fresher\n2-junior\n3-senior\nEnter student class level:");
		this.gradeyear=sc.nextInt();
		
		setstudentID();
		
	
		
		
	}

	//generate id
	private void setstudentID() {
		//grade level+ ID
		id++;
		this.studentID=gradeyear+""+id;
		
	}
	//enroll in courses
	public void enroll() {
		//get inside a loop
		do {
			System.out.print("Enter course to enroll(Q to quit):");
			Scanner sc= new Scanner(System.in);
			String course= sc.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n"+course;
				tuitionbalance=tuitionbalance+costofcourses;
			}
			else {
				System.out.println("BREAK!");
				break;
			}
		} while (1!=0);
		System.out.println("Enrolled IN:"+courses);
		
	}
	//view balance
	public void viewbalance() {
		System.out.println("your balance is: Rs"+tuitionbalance);
		
	}
	//pay tuition
	public void paytuition() {
		viewbalance();
		System.out.print("Enter your payment: Rs");
		Scanner sc= new Scanner(System.in);
		int payment=sc.nextInt();
		tuitionbalance=tuitionbalance - payment;
		System.out.println("Thank you for your payment of Rs"+payment);
		viewbalance();
		
		
	}
	//show ststus
	public String ShowInfo() {
		return"name"+" "+firstname+" "+lastname+
				"\nGrade Level:"+gradeyear+
				"\nStudentID:"+studentID+
				"\nCourses Enrolled:"+courses+
				"\nBlance:"+tuitionbalance;
		
	}
}
