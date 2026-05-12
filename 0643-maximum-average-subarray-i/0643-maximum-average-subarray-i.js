/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {

    let windowSum = 0;

    // first window
    for(let i = 0; i < k; i++){
        windowSum += nums[i];
    }

    let maxSum = windowSum;

    // slide the window
    for(let j = k; j < nums.length; j++){

        windowSum = windowSum - nums[j-k] + nums[j];

        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum / k;
};