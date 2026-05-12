/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function (nums, k) {
   let max = 0;

   for(let i = 0; i< k; i++){
      max += nums[i];
   }

   let ans = max;
   for(let i = k; i< nums.length; i++){
       max = max - nums[i - k] + nums[i];
       ans = Math.max(ans, max);
   }

   return ans/k;
};