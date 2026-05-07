/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    let map = new Map();

    let  i = 0;
    while(i < nums.length){
        let val = target - nums[i];
        if(map.has(val)){
            return [i, map.get(val)];
        }

        map.set(nums[i], i);
        i++;
    }
    
};