/**
 * 1497. Check If Array Pairs Are Divisible by k
 * @param {number[]} arr
 * @param {number} k
 * @return {boolean}
 */
const canArrange = function (arr, k) {
  const remainderCounts = new Array(k).fill(0);
  for (let num of arr) {
    let remainder = ((num % k) + k) % k;
    remainderCounts[remainder]++;
  }

  for (let i = 1; i <= k / 2; i++) {
    if (remainderCounts[i] !== remainderCounts[k - i]) {
      return false;
    }
  }

  return remainderCounts[0] % 2 !== 0 ? false : true;
};