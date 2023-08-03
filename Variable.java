
public class Variable {

	public static void main(String[] args) {
		System.out.println(5);
		int abc_1 = 5;//4bytes->32 bits
		abc_1=1000_00;
		System.out.println(abc_1);
		float abc_2 = 5.5f;//4bytes
		abc_2=5.6f;
		System.out.println(abc_2);
		double abc_3=5.7;
		System.out.println(abc_3);
		//use short instead of int  becuse of memory limitation
		long l=32767;//8bytes 64 bits 
		int i=32767;//4bytes 32 bits 
		short s=32767;//2bytes 16 bits->-+32768
		byte b=126;//1byte 8 bits ->-128 to +127
		float f=5.7f;
		double d=4.5;
		char c='A';
		c=67;//American Standard code for information Exchange
		System.out.println(c);
		d=5;
		System.out.println(d);// implicit conversion
		int k=(int) 5.5; //type cast or explicit
		//Byte >>>Short>>> int>>>long>>>float>>double
		//			char>>>
		/*
		 * Interface and Class Starts with Cap letter Abc
		 * Method variable Starts with small letter abc abc()
		 * Constructor starts with Cap end consists a bracket Abc()
		 */
	}

}
