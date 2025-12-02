

public class LinearSearch {
    public static int linearsearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,34,67,10,12,15};
        int target = 10;

        int index = linearsearch(arr, target);
        System.out.println(index != -1 ? "Element found at index " + index : "Element not found");

       
    }
}
