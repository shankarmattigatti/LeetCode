/**
 * 977. Squares of a Sorted Array
 * @param {number[]} nums
 * @return {number[]}
 */
const sortedSquares = function (nums) {
  let result = [];
  nums.forEach(num => {
    result.push(num * num);
  });

  return result.sort((a, b) => a - b);
};