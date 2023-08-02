/**
 * 46. Permutations
 * @param {number[]} nums
 * @return {number[][]}
 */
const permute = function (nums) {
  let result = [];
  generatePermutationsRecursive(nums, 0, [], result);
  return result;
};

const generatePermutationsRecursive = function (nums, index, currPermutation, result) {
  if (index === nums.length) {
    result.push(currPermutation);
  } else {
    for (let i = 0; i <= currPermutation.length; i++) {
      let newPermutation = [...currPermutation];
      newPermutation.splice(i, 0, nums[index]);
      generatePermutationsRecursive(nums, index + 1, newPermutation, result);
    }
  }
};