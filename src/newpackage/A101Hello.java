package newpackage;
public class A101Hello {

	// Java Compiler compiles code starting from main method or JVM start execution by calling main method.
	// public - So as to have this method accessible globally, JVM can access it outside class.
	// static - It is a class method by default, JVM not required to instantiate a class/create object of a class to access it.
	// void - Do not return anything to JVM, so added return type as void.
	// main - method name
	// string[] args - string array to accept parameters in complex command line processing.
	// Java code can be executed without main method using static block.

	public static void main(String[] args) {
		System.out.println("Hello Worlds");
	}
}



/*public class A101Hello {

 	//For java to run any program starting point is always a main method.
	//Without using main method, a program can be started with a static block as below only for java older version 1.6 and below.
	//Static block gets executed only once, when class is loaded into stack memory by ClassLoader [part of JRE].
	//Two types of memory as STACK and HEAP
	//STACK [stores order of method execution and variables]
	//HEAP [stores the objects and uses dynamic memory allocation and deallocation]

	static {
		System.out.println("Code executed without main method, using static block");
		System.exit(0);
	}
}*/