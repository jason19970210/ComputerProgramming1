import java.util.Scanner;

public class B0xooXoo_1026lab_str4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		String s;
		while (!(s = inp.nextLine()).equals("-1")) {
			System.out.printf("%04X\n", Integer.parseInt(s, 2));
		} // while (true)
	} // ========//
} /**** end_of_class ****/