// to calculate sum of two numbers function if my input char is 'y' [yes] to continue again other wise to stop  process?

import java.util.*;

class sumfunc
{

 void plus(int a, int b)
 {
 System.out.println("The Addition of "+a+" & "+b+"two number is:-"+(a+b) );
 
 }
 
 void minus(int a, int b)
 {
 System.out.println("The Addition of "+a+" & "+b+"this two number is:-"+(a-b ));
 
 }
 
 void multi(int a, int b)
 {
 System.out.println("The Addition of "+a+" & "+b+"two number is:-"+(a*b ));
 
 }
 
 public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	
	  
	  sumfunc fu=new sumfunc();
	  char ch='y';
	  
	  do{
		  System.out.println("enter a two number for operation");
		    int m=sc.nextInt();
	  int n=sc.nextInt();
		  fu.plus(m,n);
		  fu.minus(m,n);
		  fu.multi(m,n);
		  System.out.println("Enter y to continue again :");
		  ch=sc.next().charAt(0);
		  ch=Character.toUpperCase(ch);
		  
	  }while(ch=='Y');
	 
	 
	 
 }
 
}
 