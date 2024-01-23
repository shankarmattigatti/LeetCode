/**
 * 1239. Maximum Length of a Concatenated String with Unique Characters
 * @param {string[]} arr
 * @return {number}
 */
const maxLength = function (arr) {
  return backtrack(arr, 0, "", 0);
};

const backtrack = function (arr, start, currentStr, maxLen) {
  if (new Set(currentStr).size !== currentStr.length) {
    return maxLen;
  }

  maxLen = Math.max(maxLen, currentStr.length);
  for (let i = start; i < arr.length; i++) {
    maxLen = backtrack(arr, i + 1, currentStr + arr[i], maxLen);
  }

  return maxLen;
};