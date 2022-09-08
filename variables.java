class variables{
	int a;//Instance Variable [Inside Class and outside Method]
	int b=15;//Instance Variable [Inside Class and outside Method]

	public void test(){
	int a=10; //local variable [Inside Class and Inside Method]
	System.out.println("Local Variable : "+a);
}

static int p=50;//Static Variable (Inside Class outside Method with static keyword)

	public static void main(String[] args){
		
	variables obj2 = new variables();//Creating obj for Local variable
	obj2.test();

	variables obj1 = new variables();//Created obj for Instance variable
	System.out.println("Instance Variable i : "+obj1.a);//default value of i will be printed 
	System.out.println("Instance Variable j : "+obj1.b);// assign value will be printed

	System.out.println("Static Variable b : "+variables.p);//Driectky Printing by Classname.variablename
}
}