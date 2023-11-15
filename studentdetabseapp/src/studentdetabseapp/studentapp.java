package studentdetabseapp;

import java.util.Scanner;

public class studentapp {

	public static void main(String[] args) {
		
	
		
		//ask how many students we want to 
		System.out.println("enter no of new students to enroll: ");
		Scanner sc= new Scanner(System.in);
		int noofstudents=sc.nextInt();
		student[] students=new student[noofstudents];
		
		// create N no of students
		for(int n=0; n<noofstudents;n++) {
			students[n]=new student();
			students[n].enroll();
			students[n].paytuition();
			System.out.println(students[n].ShowInfo());
			
		}
		
		

	}

}
