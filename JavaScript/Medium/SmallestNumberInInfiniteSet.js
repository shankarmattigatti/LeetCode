// 2336. Smallest Number in Infinite Set
const SmallestInfiniteSet = function () {
  this.set = new Set();
  this.next = 1;
};

/**
 * @return {number}
 */
SmallestInfiniteSet.prototype.popSmallest = function () {
  if (this.set.size > 0) {
    const smallest = Array.from(this.set).sort((a, b) => a - b)[0];
    this.set.delete(smallest);
    return smallest;
  }
  return this.next++;
};

/**
 * @param {number} num
 * @return {void}
 */
SmallestInfiniteSet.prototype.addBack = function (num) {
  if (num < this.next) {
    this.set.add(num);
  }
};

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * var obj = new SmallestInfiniteSet()
 * var param_1 = obj.popSmallest()
 * obj.addBack(num)
 */
