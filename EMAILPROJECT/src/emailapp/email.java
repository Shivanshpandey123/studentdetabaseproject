package emailapp;

import java.util.Iterator;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

@SuppressWarnings("unused")
public class email {
	
	private String firstname;
	private String lastname;
	private String password;
	private int defaultpasswordlenght=10;
	private String department;
	private int mailboxCapacity=500;
	private String alternateemail;
	private String email;
	private String companySuffix ="company.com";
	
	// constructor to recv the 1name and lastname 
	public email(String firstname,String lastname) {
		
		this.firstname= firstname;
		this.lastname= lastname;
		System.out.println("EMAIL CREATED: "+ this.firstname+".."+this.lastname);
		
		//call a method for department
		this.department= setdepartment();
		System.out.println("Department:"+this.department);
		
		// call a method for password
		this.password=randompassword(defaultpasswordlenght);
		System.out.println("your password is:"+this.password);
		
		// combine elements to generate email
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("your email address is:"+email);
	}
	//call a method for department
	private String setdepartment() {
		System.out.println("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter Department Code:");
		Scanner sc = new Scanner(System.in);
		int depchoice = sc.nextInt();
		if (depchoice==1) { return "sales";}
		else if(depchoice==2) { return "development";}
		else if(depchoice==3) { return "accounting";}
		else { return "nothing";}
	}
	 
	// call a method for password
	private String randompassword(int lenght) {
		String passwordset ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[lenght];
		for (int i=0;i<lenght;i++) {
	int random=	(int)(Math.random()*passwordset.length());
	password[i]=passwordset.charAt(random);
			
		}
		return new String(password);
	}
//set the mailbox capacity
	public void setmailboxcapacity(int capacity) {
		this.mailboxCapacity= capacity;
	}
	//set the alternate email
	public void setalternateemail(String alternateemail) {
		this.alternateemail=alternateemail;
	}
	//change the password
	public void changepassword(String passowrd) {
		this.password=passowrd;
	}
	public int getmailboxcapacity() { return mailboxCapacity;}
	public String getalternateemail() { return alternateemail;}
	public String getpassword() { return password;}
	
	public String showinfo() {
		return "DISPLAY NAME:"+firstname+""+lastname+
				"\nCOMPANY EMAIL:"+email+
				"\nMAILBOXCAPACITY:"+mailboxCapacity+"MB";
	}
}
