package newpackage;

public class Z102StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcabcde";
		String check  = "abc";
		int counter=0;

		for(int i=0; i<a.length()-3; i++)
		{
			if(a.substring(i,i+3).contentEquals(check)) {
				counter = counter+1;
			}
		}
		System.out.println(counter);
	}

}
