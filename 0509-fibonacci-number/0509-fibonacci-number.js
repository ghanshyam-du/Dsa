/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n, dp = []) {

    if(n == 0) return 0;
    if(n == 1) return 1;

    if(dp[n] !== undefined){
        return dp[n];
    }

    dp[n] = fib(n-1, dp) + fib(n-2, dp);

    return dp[n];
    
};