/**
 * 1636. Sort Array by Increasing Frequency
 * @param {number[]} nums
 * @return {number[]}
 */
const frequencySort = function (nums) {
  let map = new Map();
  for (let num of nums) {
    map.set(num, (map.get(num) || 0) + 1);
  }

  nums.sort((a, b) => {
    let freqA = map.get(a);
    let freqB = map.get(b);
    if (freqA !== freqB)
      return freqA - freqB;

    return b - a;
  });

  return nums;
};