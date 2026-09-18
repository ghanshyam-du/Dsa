/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    
    let totalCap = 0;
    let i = 0;
    let j = height.length-1;

    while(i < j){
        let maxCap = 0;
       if(height[i] > height[j]){
         maxCap = height[j] * Math.abs(i - j);
        //  console.log("i",maxCap);
        j--;
       }
       else{
        maxCap = height[i]  * Math.abs(i - j);
        // console.log("j",maxCap);
        i++;
       }

       totalCap = Math.max(totalCap, maxCap);
    //    console.log(totalCap)

    }
    return totalCap;
};
