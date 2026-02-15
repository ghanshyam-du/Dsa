/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    let start = 0;
    let end = nums.length-1;

    while (start < end) {
        let sum = nums[start] + nums[end];

        if (sum == target) {
            return [start +1, end + 1];
        }
        // let mid = start + (end - start) / 2;

        else if (sum > target) {
            end--;
        }
        else{
            start++;
        }



    }
};