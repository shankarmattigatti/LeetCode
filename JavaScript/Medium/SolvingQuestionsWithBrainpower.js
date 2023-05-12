/**
 * 2140. Solving Questions With Brainpower
 * @param {number[][]} questions
 * @return {number}
 */
var mostPoints = function (questions) {
  let dp = new Array(200001).fill(0);
  for (let i = questions.length - 1; i >= 0; --i) {
    dp[i] = Math.max(questions[i][0] + dp[questions[i][1] + i + 1], dp[i + 1]);
  }
  return dp[0];
};
