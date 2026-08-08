class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int current=0;
        while(current<arr.length){
            if(arr.length - current < k){
                //reverse the array from atert to end then break
                reverse(current,arr.length-1,arr);
                break;
            }else{
                //reverse them till k times
                reverse(current,current+k-1,arr);
                current+=2*k;
            }
        }
        return String.valueOf(arr); 
    }
    public void reverse(int first , int last , char[] arr){
        while(first<=last){
            char temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}