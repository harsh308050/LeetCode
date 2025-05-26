class Solution {
    public double myPow(double x, long n) {
        if(n==0) return 1;
        if(n<0) return 1/myPow(x,-n);
        // return x * myPow(x,n-1);
        double hlf= myPow(x,n/2);
        if(n%2==0) return hlf*hlf;
        else return x * hlf * hlf; 
    }
}