import java.util.Scanner;

class Student
{
public static void main(String[] args)
{

int student_id; //Student ID
String student_name, student_attend; // Student Name, student Attendence
 
System.out.println("Enter the Student Name : ");
Scanner sc=new Scanner(System.in); // making Scanner object sc
student_name=sc.next();	// Taking value from the user

System.out.println("Enter Student ID : ");
student_id=sc.nextInt();	// Taking value from the user

System.out.println("Enter Student Attendence Present or Absent 'P' or 'A' : ");
student_attend=sc.next();	// Taking value from the user

System.out.println("Student Name is: "+student_name);	// Printing student name
System.out.println("Student ID is: "+student_id);	// Printing student id
System.out.println("Student Attendence is : "+student_attend);	// Printing student attendence
}
}