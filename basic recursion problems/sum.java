package Recursion;

public class sum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(summ(n));
    }
    public static int summ(int n) {
        if (n == 1) {
            return 1;
        }
        return summ(n - 1) + n;
    }
}
