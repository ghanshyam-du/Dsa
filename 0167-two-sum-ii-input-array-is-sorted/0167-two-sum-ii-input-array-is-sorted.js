/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};
    for(let i = 0; i<= nums.length; i++){
        map[nums[i]] = i;
    }

    for(let i = 0; i<= nums.length ; i++){
        let value = target - nums[i];

        if(map[value] && map[value] != i){
            return [i+1, map[value]+1]
        }
    }
};