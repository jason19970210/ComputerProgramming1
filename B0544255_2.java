import java.util.Scanner;
public class B0544255_2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner msg = new Scanner(System.in);
		System.out.print("? ");
		String lang = inp.nextLine();
		String msg1 = inp.nextLine();
			
		if (lang.equals("JAVA")){
			System.out.println("public class helloWorld {");
			System.out.println(" public static void main(String[] args) {");
			System.out.println("	System.out.println("+ msg1 +");");
			System.out.println(" }");
			System.out.println("}");
		} else if (lang.equals("C++") ) {	
			System.out.println("#include <iostream>");
			System.out.println("int main() {");
			System.out.println("	std::cout << \""+msg1+"\";");
			System.out.println("}");
		} else if (lang.equals("C") ) {			
			System.out.println("#include <stdio.h>");
			System.out.println("main() {");
			System.out.println("	printf(\""+msg1+"\"\\n);");
			System.out.println("}");		
		} else if (lang.equals("PASCAL") ) {
			System.out.println("Program HelloWorld;");
			System.out.println("Begin");
			System.out.println("	Write('"+msg1+"');");
			System.out.println("End.");			
		} else if (lang.equals("PYTHON") ) {
			System.out.println("print(\""+msg1+"\")");			
		} else if (lang.equals("BASIC") ) {
			System.out.println("10 PRINT(\""+msg1+"\")");			
		} else {
			System.out.print("Error!");			
		}	
	}

}
