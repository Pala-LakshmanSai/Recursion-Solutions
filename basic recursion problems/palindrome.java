package Recursion;

public class palindrome {
    public static void main(String[] args) {
    int num = 1234321;
    int digits = (int)(Math.log10(num)) + 1;
    int rev = reverse_a_number(num, digits);
    System.out.println(rev == num);
   }
   public static int reverse_a_number (int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (int)(Math.pow(10, digits - 1)) + reverse_a_number(n / 10, digits - 1);
   }
    
}

   