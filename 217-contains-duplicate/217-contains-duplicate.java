class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
        int i=0;
        while(i<nums.length){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}