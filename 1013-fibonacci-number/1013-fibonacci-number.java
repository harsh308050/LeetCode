class Solution {
    public int fib(int n) {
        int ans=1;
        if(n==0){
            return ans=0;
        }
        else if (n==1){
            return ans=1;
        }
        else if(n>=2){
            int a = 0, b = 1;
            for(int i=2;i<=n;i++){
                ans=a+b;
                a=b;
                b=ans;

            }
        }
        return ans;
    }
}