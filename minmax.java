import java.util.*;

class minmax
{

void max(int[] a)
{
int val;
val=a[0];
for(int i=0;i<a.length;i++)
{
	if(val<a[i])
	val=a[i];
	
}
System.out.println("Maximum value in the array is::"+val);
}
void min(int[] a)
{
int val;
val=a[0];
for(int i=0;i<a.length;i++)
{
	if(val>a[i]){
	val=a[i];
	}
}
System.out.println("Minumum value in the array is::"+val);
}
public static void main(String[] args){
	   
	minmax o = new minmax();
	int n=3;
	System.out.println("enter the number of elelment you want to store in array");
	Scanner cs=new Scanner(System.in);
	n=cs.nextInt();
	int[] a = new int[n];  
	System.out.println("enter the elelments in array");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<n;i++)
	{
	   a[i]=sc.nextInt();
	}
		o.max(a);
		o.min(a);
	}
}
 