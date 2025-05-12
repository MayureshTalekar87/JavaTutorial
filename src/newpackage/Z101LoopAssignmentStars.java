package newpackage;

public class Z101LoopAssignmentStars {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=================");

		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=================");

		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 */
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				char ch = 64;
				ch = (char) (ch + j);
				System.out.print(ch);
			}
			System.out.println();
		}
		System.out.println("=================");

		/*
		 * 	****
		 * 	*  *
		 * 	*  *
		 * 	****
		 */
		for(i=1; i<=4; i++) {
			for(j=1; j<=4; j++) {
				if(i==1 || i==4 || j==1 || j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=================");
	}

}
