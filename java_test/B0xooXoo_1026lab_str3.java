import java.util.Scanner;

public class B0xooXoo_1026lab_str3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		while (true) {
			String s = inp.nextLine();
			if (s.equals("-1"))
				break;
			System.out.printf("%04X\n", Integer.parseInt(s, 2));
		} // while (true)
	} // ========//
} /**** end_of_class ****/