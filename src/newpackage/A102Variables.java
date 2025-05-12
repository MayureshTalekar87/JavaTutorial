package newpackage;

public class A102Variables {

	public static void main(String[] args) {

		byte b = 100;	//1 bytes
		System.out.println(b);

		short s = 5000;	//2 bytes
		System.out.println(s);

		int a = 500000000;	//4 bytes
		System.out.println(a);

		long l = 8000000000000000000l;	//8 bytes [Need to put l at end of number]
		System.out.println(l);

		float percent = 5.5656565f;	//4 bytes [Need to put f at the end of number]
		System.out.println(percent);

		double percent1 = 5.565656565656;	//8 bytes
		System.out.println(percent1);

		char c = 65;	//2 bytes
		System.out.println(c);

		float f = 5;	// Implicit conversion [from int to float]
		int i = (int)5.5;	//Typecast / Explicit conversion [from float to int but will miss 0.5 at end]
		System.out.println(f+"  "+i);
	}

}
