/**
 * 1750. Minimum Length of String After Deleting Similar Ends
 * @param {string} s
 * @return {number}
 */
const minimumLength = function (s) {
  let left = 0, right = s.length - 1;

  while (left < right && s[left] === s[right]) {
    let ch = s[left];

    while (left <= right && s[left] === ch) {
      left++;
    }

    while (right >= left && s[right] === ch) {
      right--;
    }
  }

  return right - left + 1;
};