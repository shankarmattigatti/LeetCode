/**
 * 2149. Rearrange Array Elements by Sign
 * @param {number[]} nums
 * @return {number[]}
 */
const rearrangeArray = function (nums) {
  let posArray = [];
  let negArray = [];
  nums.forEach(num => {
    if (num > 0) {
      posArray.push(num);
    } else {
      negArray.push(num);
    }
  });

  let res = [];
  let i = 0, j = 0;
  while (i < posArray.length && j < negArray.length) {
    res.push(posArray[i]);
    res.push(negArray[j]);
    i++;
    j++;
  }
  return res;
};