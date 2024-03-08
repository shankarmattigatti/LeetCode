/**
 * 3005. Count Elements With Maximum Frequency
 * @param {number[]} nums
 * @return {number}
 */
const maxFrequencyElements = function (nums) {
  const freqMap = new Map();
  for (let num of nums) {
    if (freqMap.has(num)) {
      freqMap.set(num, freqMap.get(num) + 1);
    } else {
      freqMap.set(num, 1);
    }
  }

  let maxFreq = 0;
  for (const freq of freqMap.values()) {
    maxFreq = Math.max(freq, maxFreq);
  }

  let count = 0;
  for (const freq of freqMap.values()) {
    if (freq === maxFreq) {
      count += freq;
    }
  }

  return count;
};