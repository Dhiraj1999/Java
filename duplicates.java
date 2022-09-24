import java.util.*;

class duplicates{


void find(int[] k)
{
	

System.out.println("the duplicate element in the array is");
	for(int i=0;i<k.length;i++) //first element
{
	 for(int j=i+1;j<k.length;j++) //second element
	{
		if(k[i]==k[j])//comparing first and second element
		System.out.println(k[i]+"");
	}
}
  


}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 
  System.out.println("enter a length of array");
  int l=sc.nextInt();
  int[] ele=new int[l];
   duplicates du=new duplicates();




for(int i=0;i<l;i++)
{
	System.out.println("enter "+i+ "element of array");
	ele[i]=sc.nextInt();
}
  du.find(ele);






}
}