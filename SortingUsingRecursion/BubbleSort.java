package Recursion.SortingUsingRecursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, -1, 5, 6, 3};
        Bubble_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap (int[] arr, int start, int end) {
        int temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp;
    }
    public static void Bubble_Sort(int[] arr, int start, int end) {
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                swap(arr, start, start + 1);
                Bubble_Sort(arr, start + 1, end);
            }
            else {
                Bubble_Sort(arr, start + 1, end);
            }
        }
        else {
            Bubble_Sort(arr, 0, end - 1);
        }
    }

}                  
