/**
 * 140. Word Break II
 * @param {string} s
 * @param {string[]} wordDict
 * @return {string[]}
 */
var wordBreak = function (s, wordDict) {
  return DFS(s, wordDict, new Map());
};

function DFS(s, wordDict, map) {
  if (map.has(s)) return map.get(s);

  let result = [];
  if (s.length === 0) {
    result.push("");
    return result;
  }

  for (let word of wordDict) {
    if (s.startsWith(word)) {
      let sublist = DFS(s.substring(word.length), wordDict, map);
      for (let sub of sublist) {
        result.push(word + (sub === "" ? "" : " ") + sub);
      }
    }
  }
  map.set(s, result);
  return result;
}
