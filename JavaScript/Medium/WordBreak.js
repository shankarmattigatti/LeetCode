/**
 * 139. Word Break
 * @param {string} s
 * @param {string[]} wordDict
 * @return {boolean}
 */
var wordBreak = function (s, wordDict) {
  let queue = [];
  let wordDictSet = new Set(wordDict);
  let visited = new Array(s.length).fill(false);
  queue.push(0);

  while (queue.length !== 0) {
    let i = queue.shift();

    if (visited[i])
      continue;

    for (let j = i + 1; j <= s.length; j++) {
      if (wordDictSet.has(s.substring(i, j))) {
        if (j === s.length)
          return true;

        queue.push(j);
      }
    }
    visited[i] = true;
  }
  return false;
};