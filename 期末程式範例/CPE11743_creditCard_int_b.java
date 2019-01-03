import java.util.Scanner;

public class CPE11743_creditCard_int_b {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		int total = inp.nextInt();
		inp.nextLine();
		for (int rec = 0; rec < total; rec++) {
			int sum1 = 0, sum2 = 0, num, a1;
			for (int i = 1; i <= 4; i++) {
				num = inp.nextInt();
				a1 = num % 10;
				num /= 10;
				sum1 += a1 % 10 + a1 / 10;

				a1 = num % 10 * 2;
				num /= 10;
				sum1 += a1 % 10 + a1 / 10;

				a1 = num % 10;
				num /= 10;
				sum1 += a1 % 10 + a1 / 10;

				a1 = num % 10 * 2;
				num /= 10;
				sum1 += a1 % 10 + a1 / 10;
			}
			if ((sum1 + sum2) % 10 == 0)
				System.out.println("good");
			else
				System.out.println("bad");
		}
	}
}
//3
//5181 2710 9900 0017
//5181 2710 9900 0012
//0123 4567 8909 8767
//-1
