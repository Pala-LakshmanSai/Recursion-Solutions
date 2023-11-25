package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 123465;
        System.out.println(sum_of_digits(n));
    }
    public static int sum_of_digits(int n) {
        if (n == 0) {
            return 0;
        }
        return sum_of_digits(n / 10) + n % 10;
    }
}
