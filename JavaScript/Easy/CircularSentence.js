/**
 * 2490. Circular Sentence
 * @param {string} sentence
 * @return {boolean}
 */
const isCircularSentence = function (sentence) {
  let prevChar;
  let words = sentence.split(" ");
  for (let i = 0; i < words.length; i++) {
    if (i === 0) {
      prevChar = words[i][words[i].length - 1];
      continue;
    }

    if (prevChar !== words[i][0]) {
      return false;
    }

    prevChar = words[i][words[i].length - 1];
  }

  return prevChar === words[0][0];
};