package encapsulation;

import java.util.Scanner;

public class Employee {
	int student_id;
	String student_name;
	float salary;
	int age;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a student id");
		 student_id=sc.nextInt();
		 System.out.println("Enter a student name");
		 student_name=sc.next();
		 System.out.println("Enter a salary");
		 salary=sc.nextFloat();
		 System.out.println("Enter a age");
		 age=sc.nextInt();
	}
		 
		 void display() {
		 System.out.println("student_id="+student_id);
		 System.out.println("student_name="+student_name);
		 System.out.println("salary="+salary);
		 System.out.println("age="+age);
		 
		 }
		 public static void main(String[] args) {
			
			 Employee ob=new Employee();
			 ob.input();
			 ob.display();
				
		 
			
		}
		 
		 
		 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}


