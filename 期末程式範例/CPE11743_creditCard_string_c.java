class CPE11743_creditCard_string_c {

	public static void main(String args[]) {
		java.util.Scanner inp = new java.util.Scanner(System.in);
		System.out.print("? ");
		while (true) {
			String s = inp.nextLine().replaceAll(" ", "");
			if (s.equals("-1"))
				break;
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				int digit = s.charAt(i) - '0';
				int digit2 = digit * 2 % 10 + digit * 2 / 10;
				sum += i % 2 == 0 ? digit2 : digit;
			}
			System.out.println(sum % 10 == 0 ? "good" : "bad");
		}
	} // ========//
} /**** end_of_class ****/
//3
//5181 2710 9900 0017
//5181 2710 9900 0012
//0123 4567 8909 8767
//-1
