package Recursion.RecursionArrayQuestions;

import java.util.ArrayList;

public class LinearSearchMultipleOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7, 3, 11};
        int target = 3;
        ArrayList<Integer> ans = new ArrayList<>(); 
        System.out.println(linear_search(arr, target, 0, ans));
    }
    public static ArrayList<Integer> linear_search(int[] arr, int target, int i, ArrayList<Integer> ans) {
        if (i == arr.length) {
            return ans;
        }
        if (arr[i] == target) {
            ans.add(i);
        }
        return linear_search(arr, target, i + 1, ans);
    }
}
