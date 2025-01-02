/**
 * 2559. Count Vowel Strings in Ranges
 * @param {string[]} words
 * @param {number[][]} queries
 * @return {number[]}
 */
const vowelStrings = function (words, queries) {
  const isVowel = char => 'aeiouAEIOU'.includes(char);

  const prefixSum = new Array(words.length + 1).fill(0);
  for (let i = 0; i < words.length; i++) {
    const startsWithVowel = isVowel(words[i][0]);
    const endsWithVowel = isVowel(words[i][words[i].length - 1]);
    prefixSum[i + 1] = prefixSum[i] + (startsWithVowel && endsWithVowel ? 1 : 0);
  }

  const result = queries.map(([start, end]) =>
    prefixSum[end + 1] - prefixSum[start]
  );

  return result;
};