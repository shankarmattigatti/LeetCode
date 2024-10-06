/**
 * 1813. Sentence Similarity III
 * @param {string} sentence1
 * @param {string} sentence2
 * @return {boolean}
 */
const areSentencesSimilar = function (sentence1, sentence2) {
  let words1 = sentence1.split(" ");
  let words2 = sentence2.split(" ");

  let i = 0, j = 0;
  while (i < words1.length && i < words2.length && words1[i] === words2[i]) {
    i++;
  }

  while (j < words1.length - i && j < words2.length - i && words1[words1.length - 1 - j] === words2[words2.length - 1 - j]) {
    j++;
  }

  return i + j === Math.min(words1.length, words2.length);
};