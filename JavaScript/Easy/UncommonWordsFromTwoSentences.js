/**
 * 884. Uncommon Words from Two Sentences
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
const uncommonFromSentences = function (s1, s2) {
  const words1 = s1.split(' ');
  const words2 = s2.split(' ');

  const wordCount = {};
  [...words1, ...words2].forEach(word => {
    wordCount[word] = (wordCount[word] || 0) + 1;
  });

  let result = [];
  for (let word in wordCount) {
    if (wordCount[word] === 1)
      result.push(word);
  }

  return result;
};