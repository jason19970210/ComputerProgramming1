import java.util.Scanner;

public class B0xooXoo_1019lab_v2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		int n = inp.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = inp.nextInt();
			int s = x % 60; x /= 60;
			int m = x % 60; x /= 60;
			int h = x % 24; x /= 24;
			int d = x;
			System.out.println(d + " days " + h + " hours " + m + " minutes " + s + " seconds");
		}
	} // ========//
} /**** end_of_class ****/
