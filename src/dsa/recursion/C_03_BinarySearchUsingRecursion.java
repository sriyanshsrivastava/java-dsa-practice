package dsa.recursion;

public class C_03_BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1,3,4,10,15};
        System.out.println(rBinarySearch(array,17,0,array.length-1));

    }

    static int rBinarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start) / 2;

        if(arr[mid]==target){
            return mid;
        }

        if(target<arr[mid]){
            return rBinarySearch(arr,target,start,(mid-1));
        }else{
            return rBinarySearch(arr,target,mid+1,end);
        }
    }
}
