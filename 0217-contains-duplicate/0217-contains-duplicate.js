/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let map = new Map();
    let i = 0;

    while(i < nums.length){
        if(map.has(nums[i])){
            return true;
        }

        map.set(nums[i], i);
        i++;

    }
    return false;
    
};