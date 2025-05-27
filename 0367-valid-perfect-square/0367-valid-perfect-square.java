class Solution {
    public boolean isPerfectSquare(int num) {
    
    // Brute Force Approch //Not Optimised
    //    if(num<2) return true;
    //    else if (num<10){ for(int i =2;i<((num/2)+1);i++){
    //         if(i*i==num) return true;
    //     }}
    //     else if (num>=10){
    //    for(int i =2;i<((num/3)+1);i++){
    //     if(i*i==num) return true;
    //    }}
    //    return false;



    //Binary Search Approch
    if(num<2) return true;
    int left =2, right =num/2;
    while(left<=right){
        int mid=left+(right-left)/2;
        long des=(long)mid * mid;
        if(des ==num) return true;
        else if(des<num) left=mid+1;
        else right=mid-1;
    }
    return false;
    }
}