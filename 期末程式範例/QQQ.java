
public class QQQ {
	public static void main(String[] args) {
		String s = "OOXXOXXOOO", t[] = s.split("X+");
		int sum = 0;
		for (int i = 0; i < t.length; i++) {
			int len = t[i].length();
			int area = len * (1 + len) / 2;
			sum = sum + area;
			System.out.printf("%d [%s] area=%d, sum=%d\n", i, t[i], area, sum);
		}
		System.out.println(s + " --> " + sum);
	} // ========//
} /**** end_of_class ****/
