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