/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maximumSubarraySum = function(nums, k) {
    let map = new Map();

    let max = 0;
    let sum = 0;

    for(let i = 0; i< k ;i++){
        sum += nums[i];
        map.set(nums[i],(map.get(nums[i]) || 0) + 1);
    }

    if(map.size === k){
        max = sum;
    }
    for(let i = k; i < nums.length; i++){
        sum = sum - nums[i - k] + nums[i];
        map.set(nums[i- k], map.get(nums[i - k]) - 1);
        if(map.get(nums[i - k]) === 0){
            map.delete(nums[i - k]);
        }

        map.set(nums[i] , (map.get(nums[i]) || 0) + 1);

        if(map.size === k){
            max = Math.max(max, sum);
        }
    }
    return max;
   
};