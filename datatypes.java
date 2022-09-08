//wrp to demo short,byte,int,long datatype values.
class datatypes
{
	public static void main(String[] args)
	{
		byte l=72;   //int variable initialize
		short m=7859; // int variable initialize
		int n=78;// int variable initialize
		//  float f= 1.009;//int variable initialize
		long o=451;//int variable initialize
		double p=455.00001;//int variable initialize
		char ch='D';//int variable initialize
		String str="Hello world";//int variable initialize
  

		System.out.println("/nbyte store 1 byte (8 bits), range : -128 to +127 value of byte a : "+l);
		System.out.println("\nshort store 2 bytes (16 bits), range : -32768 to +32767 value of short b : "+m);
		System.out.println("int  store 4 bytes (32 bits), range : -2147483648 to +2147483647 value of int c : "+n);
		System.out.println("long  store 8 bytes (64 bits), range : -2 pow 63 to +2 pow 63 -1 value of long d : "+o);
		System.out.println("double store 8 bytes (64 bits), maximum decimals : 15 (.000000000000000) exponential range : 4.9 e pow -319 to 1.7 e pow +308 value of double d : "+p);
		System.out.println("Character store 2 bytes (16 bits), range : 0 to 65535 (Unicode Char) value of character ch : "+ch);
		System.out.println("String is a Class value of String str : "+str);
		// System.out.println("float datatype store 4 bytes (32 bits), maximum decimals : 7 (.0000000) exponential range : 1.4 e pow -38 to 3.4 e pow +38 value of float f : "+f);

	}
}