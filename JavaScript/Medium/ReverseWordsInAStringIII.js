/**
 * 557. Reverse Words in a String III
 * @param {string} s
 * @return {string}
 */
const reverseWords = function (s) {
  let sb = [];
  let res = [];

  for (let i = 0; i < s.length; i++) {
    const ch = s[i];
    if (ch === ' ') {
      res.push(reverse(sb.join('')));
      res.push(ch);
      sb = [];
    } else {
      sb.push(ch);
    }
  }
  res.push(reverse(sb.join('')));

  return res.join('');
};

const reverse = function (word) {
  if (word === "") return "";
  let res = [];
  for (let i = word.length - 1; i >= 0; i--) {
    res.push(word[i]);
  }
  return res.join('');
};