package Recursion;

//way-1
// public class reverseNumber {
//     static int sum = 0; 
//     public static void reverse_a_number(int n) {
//         if  (n == 0) {
//             return;
//         }
//         sum = sum * 10 + (n % 10);
//         reverse_a_number(n / 10);
//     }
//     public static void main(String[] args) {
//         int num = 12345;
//         reverse_a_number(num);
//         System.out.println(sum);
//     }
// }


//way-2
public class reverseNumber {
   public static void main(String[] args) {
    int num = 1234;
    int digits = (int)(Math.log10(num)) + 1;
    System.out.println(reverse_a_number(num, digits));
   }
   public static int reverse_a_number (int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (int)(Math.pow(10, digits - 1)) + reverse_a_number(n / 10, digits - 1);
   }
}