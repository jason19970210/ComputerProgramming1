class CPE11150_cola_V2 {
	static java.util.Scanner inp = new java.util.Scanner(System.in);

	public static void main(String args[]) {
//		System.out.print("? ");
//		int N = inp.nextInt();
		for (int N = 1; N <= 20; N++) {
			int ans = DoIt(N), ans2 = DoIt2(N);
			System.out.println(N + ": " + ans + ", " + ans2);
		}
	} // ========//

	private static int DoIt2(int n) {
		return n + n / 2;
	}

	private static int DoIt(int N) {
		if (N <= 1) // ��N<=1�ɡA�����L�X�ثe���X���i�֡C�]���L�A����B�ͭɲ~�l�A�]�L�k�k�٪Ų~�C
			return N;
		int ans = N; // ans=�̦h�i�H�ܦh�֥i�֡C��l�Ƭ��@�}�l�Ҿ֦����i�ּƶq�C
		while (N != 1) { // ��~�l�ѤU1�ڮɡA�����j��C
			if (N == 2) // ��N==2�ɦA��B�ͭɤ@�Ӳ~�l�C
				N = N + 1;
			ans = ans + N / 3;// �ܱ����i�ּƶq
			N = N % 3 + N / 3;// �ثe���~�l=�쥻�ѤU���~�l+�I���᪺�~�l
		}
		return ans;
	} // ========//
} /**** end_of_class ****/