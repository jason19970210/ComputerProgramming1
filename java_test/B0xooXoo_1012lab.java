import java.util.Scanner;

public class B0xooXoo_1012lab {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		int n = inp.nextInt();
		for (int i = 1; i <= n; i++) {
			int y = inp.nextInt(), d = inp.nextInt();
			int x = 3 + d - 1; // 2020/01/01 ==> WED
			if (y > 1)
				x += 31;
			if (y > 2)
				x += 29;
			if (y > 3)
				x += 31;
			if (y > 4)
				x += 30;
			if (y > 5)
				x += 31;
			if (y > 6)
				x += 30;
			if (y > 7)
				x += 31;
			if (y > 8)
				x += 31;
			if (y > 9)
				x += 30;
			if (y > 10)
				x += 31;
			if (y > 11)
				x += 30;
			String ans = "SUN";
			if (x % 7 == 1)
				ans = "MON";
			if (x % 7 == 2)
				ans = "TUE";
			if (x % 7 == 3)
				ans = "WED";
			if (x % 7 == 4)
				ans = "THU";
			if (x % 7 == 5)
				ans = "FRI";
			if (x % 7 == 6)
				ans = "SAT";
			System.out.println(ans);
		}
	} // ========//
} /**** end_of_class ****/