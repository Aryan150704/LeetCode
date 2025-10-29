class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i=num1.length-1;
        m=m-1;
        n=n-1;
        while(i>=0){
            if(m<0 ||  n<0){
                if(m<0){
                    num1[i]=num2[n];
                    //num2[n]=0;
                    n--;
                }
                else{
                    num1[i]=num1[m];
                    //num1[m]=0;
                    m--;
                }
            }
            else{
            if(num1[m]>=num2[n]){
                num1[i]=num1[m];
                //num1[m]=0;
                m--;
            }
            else{
                num1[i]=num2[n];
                //num2[n]=0;
                n--;
            }
            }
            i--;
        }
    }
}