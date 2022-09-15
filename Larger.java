import java.util.*;
class Large
{
	public static void main(String[] args)
{
	int m,n,0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers : ");
	m = sc.nextInt(); 
	n = sc.nextInt();
	o = sc.nextInt();

	//finding the largest num

	if(m>n && m>o)
	System.out.println("M is Largest value : "+m);

	else if(n>o && n>m)
	System.out.println("N is Largest value : "+n);

	else
	System.out.println("O is Largest value : "+o);
	
}
}