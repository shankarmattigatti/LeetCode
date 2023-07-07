/**
 * 2024. Maximize the Confusion of an Exam
 * @param {string} answerKey
 * @param {number} k
 * @return {number}
 */
var maxConsecutiveAnswers = function (answerKey, k) {
  let maxLen = 0;
  const n = answerKey.length;

  ["T", "F"].forEach((char) => {
    let start = 0, balance = 0;
    for (let end = 0; end < n; end++) {
      if (answerKey[end] !== char) balance++;

      while (balance > k) {
        if (answerKey[start] !== char) balance--;
        start++;
      }
      maxLen = Math.max(maxLen, end - start + 1);
    }
  });

  return maxLen;
};
