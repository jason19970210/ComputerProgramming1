import java.util.Scanner;

public class B0xooXoo_1026lab_str2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		while (true) {
			String s = inp.nextLine();
			if (s.equals("-1"))
				break;
			int sum = Integer.parseInt(s, 2);
			String ans = Integer.toHexString(sum).toUpperCase();
			String ans2 = String.format("%04X", sum);
			System.out.println(ans2);
		} // while (true)
	} // ========//
} /**** end_of_class ****/