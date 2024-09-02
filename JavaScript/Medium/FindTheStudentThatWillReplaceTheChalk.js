/**
 * 1894. Find the Student that Will Replace the Chalk
 * @param {number[]} chalk
 * @param {number} k
 * @return {number}
 */
const chalkReplacer = function (chalk, k) {
  let totalChalk = chalk.reduce((a, b) => a + b, 0);
  k %= totalChalk;

  for (let i = 0; i < chalk.length; i++) {
    if (k < chalk[i])
      return i;

    k -= chalk[i];
  }
};