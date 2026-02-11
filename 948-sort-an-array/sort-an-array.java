class Solution {
    public int[] sortArray(int[] nums) {
        mergSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        } 
        int mid=si+(ei-si)/2;
        mergSort(arr,si,mid); // left part
        mergSort(arr,mid+1,ei); // right part
        merge(arr,si,mid,ei);
    }
    public void merge(int[] arr,int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int temp[]=new int[ei-si+1];
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        int n=0;
        for(int m=si;m<=ei;m++){
            arr[m]=temp[n];
            n++;
        }
    }
}