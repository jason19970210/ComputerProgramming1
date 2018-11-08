import java.util.Scanner;

public class B0xooXoo_1005lab {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("? ");
		int hcm = inp.nextInt(), w = inp.nextInt();
		double hm = hcm * 0.01;
		double BMI = w / hm / hm;
		String ans = "Good";
		if (BMI < 18.5)
			ans = "Under";
		if (BMI > 24.0)
			ans = "Over";
		System.out.print(ans);
	} // ========//
} /**** end_of_class ****/