/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function (nums, k) {


    let max = 0;
    for (let i = 0; i < k; i++) {
        max += nums[i];
    }
    let ans = max;
    for (let j = k; j < nums.length; j++) {
        max = max - nums[j-k] + nums[j];
        ans = Math.max(max, ans);
    }

    return ans/k;

};