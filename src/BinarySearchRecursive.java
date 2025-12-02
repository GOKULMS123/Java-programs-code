public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;

        if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 45};
        int target = 25;

        int result = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println(result != -1 ? 
            "Found at index: " + result : 
            "Not found");
    }
}
