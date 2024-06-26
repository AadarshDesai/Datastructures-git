package Kunals.InterviewQuestions_BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(Floor(arr, target));
    }

    static int Floor(int[] arr, int target){
        int start = 0;
        int end =  arr.length-1;
        boolean isAsc = arr[start] < arr[end];
            if(!isAsc){
                if(target > arr[0]){
                    return -1;
                }
            }
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target == arr[mid]){
                    return arr[mid];
                }
                if(isAsc){
                    if(target < arr[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }else{
                    if(target > arr[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                } 
            }
            if(isAsc){
                return end;
            }else{
                return start;
            } 
    }
}
