package Recursion;

public class productOfDigits {
    public static void main(String[] args) {
        int n = 5123;
        System.out.println(product_of_digits(n));
    }
    public static int product_of_digits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product_of_digits(n / 10);
    }
}
