/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */

function reverse(i, j, nums){
    while(i < j){
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
 }

var rotate = function(nums, k) {
     k = k % nums.length;
  reverse(0, nums.length - 1, nums);
  reverse(0, k-1, nums);
  reverse(k, nums.length -1, nums);
    
};