package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 2) + fibo(n - 1);
    }
}
