package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private int passwordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "companyXYZ.com";
	
	
	// constructor to receive the firstname and lastname
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		// System.out.println("Email created: " + this.firstname + " " + this.lastname);
		
		// call a method asking for department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// call a method asking for random password
		this.password = randomPassword(passwordLength);
		System.out.println("Your Password: " + this.password);
		
		//combine elements to generate email
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department + "." + companySuffix;
		// System.out.println("Your email is:" + email);
		
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New worker:" +" " + firstname + " " + "Department CODE:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the department CODE: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {
			return "sales";
		}else if(deptChoice == 2) {
			return "dev";
		}else if(deptChoice == 3) {
			return "accounting";
		}
		else {
			return "";
		}
		
		
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
		
		
	}
    
	// set mailbox Capacity
	public void mailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alternate Email
	public void setaltEmail(String altemail) {
		this.alternateEmail = altemail;
	}
	
	// change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getmailboxCapacity() {
		return this.mailboxCapacity;
	}
	
	public String getaltEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	public String showInfo() {
		return "Display Name :" + firstname + " " + lastname +
				"\nCompany Email :" + email +
				"\nMailbox Capacity :" + mailboxCapacity + "mb";
	}

}
