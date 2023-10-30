/**
 * 1356. Sort Integers by The Number of 1 Bits
 * @param {number[]} arr
 * @return {number[]}
 */
const sortByBits = function (arr) {
  arr.sort((a, b) => {
    let bitCountA = countBits(a);
    let bitCountB = countBits(b);

    if (bitCountA === bitCountB) {
      return a - b;
    }
    return bitCountA - bitCountB;
  });

  return arr;
};

const countBits = function (n) {
  let count = 0;
  while (n) {
    count += n & 1;
    n = n >>> 1;
  }
  return count;
};
