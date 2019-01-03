import java.util.Scanner;

class CPE11150_cola_a {
	static Scanner inp = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.print("? ");
		int N = inp.nextInt();
		int ans = DoIt(N);
		System.out.println(ans);
	} // ========//

	private static int DoIt(int N) {
		if (N <= 1) // 當N<=1時，直接印出目前有幾罐可樂。因為他再怎麼跟朋友借瓶子，也無法歸還空瓶。
			return N;
		int ans = N; // ans=最多可以喝多少可樂。初始化為一開始所擁有的可樂數量。
		while (N != 1) { // 當瓶子剩下1根時，結束迴圈。
			if (N == 2) // 當N==2時再跟朋友借一個瓶子。
				N = N + 1;
			ans = ans + N / 3;// 喝掉的可樂數量
			N = N % 3 + N / 3;// 目前的瓶子=原本剩下的瓶子+兌換後的瓶子
		}
		return ans;
	} // ========//
} /**** end_of_class ****/