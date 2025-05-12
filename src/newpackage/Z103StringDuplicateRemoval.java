package newpackage;

public class Z103StringDuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		String[] str3= new String[4];
		String str1 = "Mayuresh Mayuresh Mayuresh is Automation Tester Tester";

		String[] str2 = str1.split(" ");
		for(int i=0; i<str2.length; i++) {
			String str = str2[i];
			int j;
			for(j=0; j<i; j++) {
				if(str.equalsIgnoreCase(str2[j])) {
					break;
				}
			}
			if(i==j)
				str3[counter++]=str2[i];
		}

		for(String a : str3) {
			System.out.println(a);
		}
	}
}