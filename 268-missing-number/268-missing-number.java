class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int expected= (n*(n+1))/2;
        int total=0;
        for(int num:nums){
            total=total+num;
        }
        return expected-total;
        
    }
}