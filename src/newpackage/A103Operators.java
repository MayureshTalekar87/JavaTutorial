package newpackage;

public class A103Operators {

	// Assignment
	// Arithmetic
	// Bitwise
	// Relational
	// Logical

	public static void main(String[] args) {

		// ASSIGNMENT ==============================
		int a = 6;
		int b = 4;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		// ARITHMETIC ==============================
		System.out.println("a+b = "+ (a+b));
		System.out.println("a-b = "+ (a-b));
		System.out.println("a*b = "+ (a*b));
		System.out.println("a/b = "+ (a/b)); // Default a/b results in int
		System.out.println("a%b = "+ (a%b));

		double c = (double) a/b; // Here correct result displayed as 1.5
		System.out.println("double a/b = "+ c);

		System.out.println("b = "+b);
		System.out.println("a = "+a);
		b = a++;	// First assign then increment b = 6; a = 7
		System.out.println("b = a++; Printed b value ="+b);
		System.out.println("b = a++; Printed a value ="+a);
		b = ++a;	// First increment then assign b = 8; a = 8
		System.out.println("b = ++a; Printed b value ="+b);
		System.out.println("b = ++a; Printed a value ="+a);

		a += b; // This means a = a + b; result 16
		System.out.println("a+=b value ="+a);

		// BITWISE ============================
		a = 5;
        b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // RELATIONAL =========================
        System.out.println("a ="+a+" b ="+b);
        System.out.println(" a>b = "+ (a>b)); // FALSE
        System.out.println(" a<b = "+ (a<b)); // TRUE
        System.out.println(" a==b = "+(a==b)); // FALSE
        System.out.println(" a!=b = "+(a!=b)); // TRUE

        // LOGICAL ============================
        System.out.println(" a<6 && b<10 = "+(a<6 && b<10)); // TRUE && TRUE = TRUE
        System.out.println(" a<2 && b<10 = "+(a<2 && b<10)); // FALSE && TRUE = FALSE
        System.out.println(" a<6 || b<10 = "+(a<6 || b<10)); // TRUE || TRUE = TRUE
        System.out.println(" a<2 || b<10 = "+(a<2 || b<10)); // FALSE || TRUE = TRUE
	}
}
