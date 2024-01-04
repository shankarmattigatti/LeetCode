/**
 * 2870. Minimum Number of Operations to Make Array Empty
 * @param {number[]} nums
 * @return {number}
 */
const minOperations = function (nums) {
  const freqMap = new Map();
  let operations = 0;

  nums.forEach((num) => {
    freqMap.set(num, (freqMap.get(num) || 0) + 1);
  });

  for (const count of freqMap.values()) {
    if (count === 1) {
      return -1;
    }
    const tripletOperations = Math.floor(count / 3);
    const pairOperations = Math.ceil((count % 3) / 2);

    operations += tripletOperations + pairOperations;
  }

  return operations;
};
