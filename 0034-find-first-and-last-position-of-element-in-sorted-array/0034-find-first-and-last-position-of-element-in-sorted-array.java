class Solution {
    public static int firstPos(int[] nums, int target){
        int start = 0;
        int last = nums.length - 1; 
        int res = -1;


        while(start <=  last){
            int mid =(start + last)/2;

            if(nums[mid] == target){
                res = mid;
                last = mid - 1;
            }
            else if(nums[mid] > target){

                last = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return res;
    }



     public static int lastPos(int[] nums, int target){
        int start = 0;
        int last = nums.length - 1; 
        int res = -1;


        while(start <=  last){
            int mid =(start + last)/2;

            if(nums[mid] == target){
                res = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target){

                last = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int n1 =  firstPos(nums, target);
        int n2 =  lastPos(nums, target);
        int[] arr = new int[] {n1, n2};

        return arr;
        
    }
}