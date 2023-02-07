/**
 * 904. Fruit Into Baskets
 * @param {number[]} fruits
 * @return {number}
 */
var totalFruit = function (fruits) {
  let basket = new Map();
  let left = 0, result = 0;
  for (let right = 0; right < fruits.length; right++) {
    if (basket.has(fruits[right])) {
      basket.set(fruits[right], basket.get(fruits[right]) + 1);
    } else {
      basket.set(fruits[right], 1);
    }

    while (basket.size > 2) {
      basket.set(fruits[left], basket.get(fruits[left]) - 1);
      if (basket.get(fruits[left]) == 0) {
        basket.delete(fruits[left]);
      }
      left++;
    }

    result = Math.max(result, right - left + 1);
  }

  return result;
};
