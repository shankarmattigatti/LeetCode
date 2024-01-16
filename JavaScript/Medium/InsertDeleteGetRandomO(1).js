// 380. Insert Delete GetRandom O(1)
const RandomizedSet = function () {
  this.map = {};
  this.list = [];
};

/** 
 * @param {number} val
 * @return {boolean}
 */
RandomizedSet.prototype.insert = function (val) {
  if (this.map[val] !== undefined)
    return false;

  this.map[val] = this.list.length;
  this.list.push(val);
  return true;
};

/** 
 * @param {number} val
 * @return {boolean}
 */
RandomizedSet.prototype.remove = function (val) {
  if (this.map[val] === undefined)
    return false;

  var index = this.map[val];
  var lastElement = this.list[this.list.length - 1];

  this.list[index] = lastElement;
  this.map[lastElement] = index;

  this.list.pop();
  delete this.map[val];
  return true;
};

/**
 * @return {number}
 */
RandomizedSet.prototype.getRandom = function () {
  var randomIndex = Math.floor(Math.random() * this.list.length);
  return this.list[randomIndex];
};

/** 
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = new RandomizedSet()
 * var param_1 = obj.insert(val)
 * var param_2 = obj.remove(val)
 * var param_3 = obj.getRandom()
 */