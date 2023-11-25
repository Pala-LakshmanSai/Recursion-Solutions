package Recursion;

public class countZeros {
    static int count = 0;
    public static void main(String[] args) {
        int num = 1204000201;
        count_zeros(num);
        System.out.println(count);
    }
    public static void count_zeros(int n) {
        if (n == 0) {
            return;
        }
        if (n % 10 == 0) {
            count++;
        }
        count_zeros(n / 10);
    }
}
