import java.util.Scanner;

public class B0xooXoo_1026lab_str1 {
	public static void main(String[] args) {
		char[] digit = new char[16];
		for (int i = 0; i < 16; i++)
			digit[i] = (char) (i >= 10 ? 'A' + i - 10 : '0' + i);
		int[] base = new int[4 * 4];
		for (int i = 0; i < 4 * 4; i++)
			base[i] = (int) Math.pow(2, 15 - i);
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		while (true) {
			String s = inp.nextLine();
			if (s.equals("-1"))
				break;
			int sum = 0;
			for (int i = 0; i < 16; i++)
				sum += (s.charAt(i) - '0') * base[i];
			String ans = "";
			for (int i = 0; i < 4; i++) {
				ans = digit[sum % 16] + ans;
				sum = sum / 16;
			}
			System.out.println(ans);
		} // while (true)
	} // ========//
} /**** end_of_class ****/