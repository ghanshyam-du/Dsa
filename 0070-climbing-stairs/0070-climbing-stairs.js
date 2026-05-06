/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n, dp = []) {

    if(n == 0) return 1;
    if( n < 0) return 0; 

    if(dp[n] !== undefined){
        return dp[n];
    }

    dp[n] = climbStairs(n-1, dp) + climbStairs(n - 2, dp);

    return dp[n];

    
};