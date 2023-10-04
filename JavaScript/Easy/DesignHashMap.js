/** 
 * 706. Design HashMap
 */
const MyHashMap = function () {
  this.size = 1000;
  this.storage = new Array(this.size);
  for (let i = 0; i < this.size; i++) {
    this.storage[i] = [];
  }
};

/** 
 * @param {number} key
 * @return {number}
 */
MyHashMap.prototype._hash = function (key) {
  return key % this.size;
};

/** 
 * @param {number} key 
 * @param {number} value
 * @return {void}
 */
MyHashMap.prototype.put = function (key, value) {
  const index = this._hash(key);
  let slot = this.storage[index];

  for (let i = 0; i < slot.length; i++) {
    if (slot[i][0] === key) {
      slot[i][1] = value;
      return;
    }
  }
  slot.push([key, value]);
};

/** 
 * @param {number} key
 * @return {number}
 */
MyHashMap.prototype.get = function (key) {
  const index = this._hash(key);
  const slot = this.storage[index];
  for (let i = 0; i < slot.length; i++) {
    if (slot[i][0] === key) {
      return slot[i][1];
    }
  }
  return -1;
};

/** 
 * @param {number} key
 * @return {void}
 */
MyHashMap.prototype.remove = function (key) {
  const index = this._hash(key);
  const slot = this.storage[index];
  for (let i = 0; i < slot.length; i++) {
    if (slot[i][0] === key) {
      slot.splice(i, 1);
      return;
    }
  }
};