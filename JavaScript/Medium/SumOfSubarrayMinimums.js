/**
 * 907. Sum of Subarray Minimums
 * @param {number[]} arr
 * @return {number}
 */
const sumSubarrayMins = function (arr) {
  let n = arr.length;
  let stack = [];
  let left = new Array(n).fill(0);
  let right = new Array(n).fill(0);
  let mod = 1e9 + 7;

  for (let i = 0; i < n; i++) {
    while (stack.length !== 0 && arr[stack[stack.length - 1]] > arr[i]) {
      stack.pop();
    }
    left[i] = stack.length === 0 ? -1 : stack[stack.length - 1];
    stack.push(i);
  }

  stack = [];
  for (let i = n - 1; i >= 0; i--) {
    while (stack.length !== 0 && arr[stack[stack.length - 1]] >= arr[i]) {
      stack.pop();
    }
    right[i] = stack.length === 0 ? n : stack[stack.length - 1];
    stack.push(i);
  }

  let sum = 0;
  for (let i = 0; i < n; i++) {
    sum = (sum + arr[i] * (i - left[i]) * (right[i] - i)) % mod;
  }

  return sum;
};