/**
 * 1590. Make Sum Divisible by P
 * @param {number[]} nums
 * @param {number} p
 * @return {number}
 */
const minSubarray = function (nums, p) {
  const totalSum = nums.reduce((acc, num) => acc + num, 0);
  const totalMod = totalSum % p;

  if (totalMod === 0)
    return 0;

  let currentMod = 0;
  let minLength = nums.length;
  const modMap = new Map();
  modMap.set(0, -1);

  for (let i = 0; i < nums.length; i++) {
    currentMod = (currentMod + nums[i]) % p;
    const targetMod = (currentMod - totalMod + p) % p;
    if (modMap.has(targetMod)) {
      minLength = Math.min(minLength, i - modMap.get(targetMod));
    }
    modMap.set(currentMod, i);
  }

  return minLength < nums.length ? minLength : -1;
};