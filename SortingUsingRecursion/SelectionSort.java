package Recursion.SortingUsingRecursion;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, -1, 5, 6, 3};
        selection_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        else {
            int min_index = find_min(arr, start, end);
            swap(arr, start, min_index);
            selection_sort(arr, start + 1, end);
        }
    }
    public static int find_min(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
