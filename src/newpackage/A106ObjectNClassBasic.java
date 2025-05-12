package newpackage;

class Calc{
	int num1;	//Default values to int variables is 0.
	int num2;
	int num3;
	int result;

	// CONSTRUCTORS ===============================
	// 1. Constructor is a Member method of a class
	// 2. Same name that of class
	// 3. Does not return any value
	// 4. Allocates memory to variables
	// 5. Whenever object of a class is created, a constructor gets called
	// ============================================

	// Below is example of construcor overloading as both have same name different signature (parameters defers).
	// DEFAULT CONSTRUCTOR --
	public Calc() {
		System.out.println("In Default constructor");
	}

	// PARAMETERISED CONSTRUCTOR --
	public Calc(int num3) {	//Variable passed in method is local to that so called as local variable [brown color]
		this.num3 = num3;	//Variable declared in class is called as instance variable as it belongs to instance or object of the class [blue color]
		System.out.println("In Parameterised constructor");
	}

	public void perform() {
		result = num1 + num2;
	}
}

public class A106ObjectNClassBasic {

	public static void main(String[] args) {
		// OBJECT KNOWS SOMETHING (VARIABLES) AND DOES SOMETHING (METHODS).
		Calc obj = new Calc();	// Default constructor gets called.
		Calc obj1 = new Calc(10);	// Parameterized constructor gets called.

		obj.num1=3;	//object knows something.
		obj.num2=5;
		obj.perform();	//object does something.

		System.out.println(obj.result);
		System.out.println(obj1.num3);
	}

}
