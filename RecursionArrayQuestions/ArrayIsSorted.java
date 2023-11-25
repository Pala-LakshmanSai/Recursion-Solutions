package Recursion.RecursionArrayQuestions;

//find whether the array is sorted or not
public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 18, 9, 12};
        System.out.println(array_is_sorted(arr, 0));
    }
    public static boolean array_is_sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && array_is_sorted(arr, i + 1);
    }
}
