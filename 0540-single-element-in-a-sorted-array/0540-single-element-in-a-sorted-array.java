class Solution {
    public int singleNonDuplicate(int[] nums) {
        int unique = 0;
        for(int i : nums){
            unique = unique ^ i;
            
        }
        return unique;
    }
}