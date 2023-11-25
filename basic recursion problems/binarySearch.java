package Recursion;

public class binarySearch {
    public static void main(String[] args) {
		int[] arr  = {1, 3, 4, 6, 7, 8, 12, 43};	
		int target = 12;
		System.out.println(BS(arr, target, 0, arr.length - 1));
	}
	public static int BS(int[] arr, int target, int start, int end) {
		int mid = start + (end - start) / 2;
		if (start <= end) {
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				return BS(arr, target, mid + 1, end);
			}
			else if (arr[mid] > target) {
				return BS(arr, target, start, mid - 1);
			}
		}	
		return -1;
	}
}
