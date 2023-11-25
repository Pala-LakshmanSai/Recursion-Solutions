package Recursion.RecursionArrayQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -12, 54};
        int target = -12;
        System.out.println(linear_search(arr, target, 0));
    }
    public static int linear_search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return linear_search(arr, target, i + 1);
    }
}
