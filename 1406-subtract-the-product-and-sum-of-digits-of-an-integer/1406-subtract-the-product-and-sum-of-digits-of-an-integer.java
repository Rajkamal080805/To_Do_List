class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int m=1;
         while(n!=0){
            int dig = n%10; 
            s=s+dig;
            m=m*dig;
            n=n/10;
         } 
         return m-s;
    }
}