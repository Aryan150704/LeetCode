class Solution {
    public boolean search(int[] arr, int target) {
        int str=0;
        int end=arr.length-1;
        while(str<=end){
            
            int mid=str+(end-str)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[str]==arr[mid] && arr[mid]==arr[end]){
                str++;
                end--;
                continue;
            }
            if(arr[str]<=arr[mid]){
                if(arr[str]<=target && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    str=mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[end]){
                    str=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}