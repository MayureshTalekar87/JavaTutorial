package newpackage;

public class A105Looping {

	public static void main(String[] args) {

		// WHILE LOOP =================
		int i = 1;
		while(i<5) {
			System.out.println("Hello in while loop "+ i);	// will print 4 times (i=1,2,3,4) and i becomes 5
			i=i+1;
		}

		// FOR LOOP ==================
		for(int j=1; j<5; j++) {
			System.out.println("Hi in for loop "+j);	//will print 4 times (j=1,2,3,4) and j becomes 5
		}

		// DO..WHILE LOOP ============
		do {
			System.out.println("In do while " + i);		// will print 3 times (i=5,6,7)
			i++;
		}while(i<8);
	}

}
