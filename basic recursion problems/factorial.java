package Recursion;
public class factorial {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(fac(n));
	}

	public static int fac(int n) {
		if (n == 1) {
			return 1;
		}
		return fac(n - 1) * n;
	}
}