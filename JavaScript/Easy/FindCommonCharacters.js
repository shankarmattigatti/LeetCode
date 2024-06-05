/**
 * 1002. Find Common Characters
 * @param {string[]} words
 * @return {string[]}
 */
const commonChars = function (words) {
  let list = [];

  let dict = new Array(26).fill(0);
  for (let i = 0; i < words[0].length; i++) {
    dict[words[0].charCodeAt(i) - 'a'.charCodeAt(0)]++;
  }

  for (let i = 1; i < words.length; i++) {
    let curr = new Array(26).fill(0);

    for (let j = 0; j < words[i].length; j++) {
      curr[words[i].charCodeAt(j) - 'a'.charCodeAt(0)]++;
    }

    for (let j = 0; j < 26; j++) {
      if (curr[j] < dict[j]) dict[j] = curr[j];
    }
  }

  for (let i = 0; i < 26; i++) {
    for (let j = 0; j < dict[i]; j++) {
      list.push(String.fromCharCode('a'.charCodeAt(0) + i));
    }
  }

  return list;
};