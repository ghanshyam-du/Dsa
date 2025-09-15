public class TwoSum {
    public static void main(String[] args) {
        
    }
    
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] arr = new int[2];
      HashMap<Integer, Integer> map = new HashMap<>();

      for(int i = 0; i < nums.length; i++){
          if(map.containsKey(target - nums[i])){
            arr[0] = i;
            arr[1] = map.get(target - nums[i] );

          }

          map.put(nums[i] , i);
      }


    // for(int i = 0; i< nums.length; i++){
    //     for(int j = i+1; j < nums.length; j++){
    //         if(nums[i] + nums[j] == target){
    //             arr[0] = i;
    //             arr[1] = j;

    //             return arr;
                
    //         }
    //     }
    // }

      return arr ;
        
    }
}