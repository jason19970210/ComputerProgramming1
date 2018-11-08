import java.util.Scanner;

public class B0xooXoo_1012lab_v2 {
	public static void main(String[] args) {
		int[] dom = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] ans = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		int n = inp.nextInt();
		for (int j = 1; j <= n; j++) {
			int m = inp.nextInt(), d = inp.nextInt();
			int x = 3 + d - 1; // 2020/01/01 ==> WED
			for (int i = 1; i < m; i++)
				x += dom[i];
			System.out.println(ans[x % 7]);
		}
	} // ========//
} /**** end_of_class ****/