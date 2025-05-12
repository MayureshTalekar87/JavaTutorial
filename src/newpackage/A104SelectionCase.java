package newpackage;

public class A104SelectionCase {

	public static void main(String[] args) {

		// IF...ELSE CONDITION =============
		int num = 8;
		if(num==0)
			System.out.println("0 is neither even nor odd");
		else if(num%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");

		// TERNARY OPERATOR ==============
		int i=8;
		int j=0;
		j = i>6?1:2;	// if i>6 then j=1 else j=2;
		System.out.println(j);

		// SWITCH CASE ====================
		// We can use string in switch above java 8 and later.
		int n =3;
		switch(n){
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;	// if no break, will execute next sentences ie. o/p = Three and Four.
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("No match");
		}
	}

}
