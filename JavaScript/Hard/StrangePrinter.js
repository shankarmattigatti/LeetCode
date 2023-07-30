/**
 * 664. Strange Printer
 * @param {string} s
 * @return {number}
 */
const strangePrinter = function(s) {
    const n = s.length;
    const dp = Array.from({ length: n }, () => Array(n).fill(0));

    for(let len = 1; len <= n; len++) {
        for(let i = 0; i <= n - len; i++) {
            const j = i + len - 1;
            dp[i][j] = len === 1 ? 1 : dp[i+1][j] + 1;

            for(let k = i + 1; k <= j; k++) {
                if(s[k] === s[i]) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k-1] + (k+1 > j ? 0 : dp[k+1][j]));
                }
            }
        }
    }
    return dp[0][n-1];
};