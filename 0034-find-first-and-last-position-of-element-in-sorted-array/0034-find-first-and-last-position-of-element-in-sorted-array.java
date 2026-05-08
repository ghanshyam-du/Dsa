class Solution {
    public static int first(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int res = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                res = mid;
                end = mid - 1;
            }else if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;

    }
    public static int last(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int res = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                res = mid;
                start = mid + 1;
            }else if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;

    }
    public int[] searchRange(int[] nums, int target) {
        int firstN = first(nums, target);
        int lastN = last(nums, target);

        return new int[]{firstN, lastN};
        
    }
}