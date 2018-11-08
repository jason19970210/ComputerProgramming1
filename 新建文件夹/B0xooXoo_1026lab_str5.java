import java.util.Scanner;

public class B0xooXoo_1026lab_str5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		String s;
		while (!(s = inp.nextLine().replaceAll(" ", "")).equals("-1")) {
			System.out.printf("%04x\n", Integer.parseInt(s, 2)); // 04 means output boxes, x as 16 in. , 2 as seen input string as binary
			
		} // while (true)
	} // ========//
} /**** end_of_class ****/