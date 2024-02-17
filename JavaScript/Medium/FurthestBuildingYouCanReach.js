/**
 * 1642. Furthest Building You Can Reach
 * @param {number[]} heights
 * @param {number} bricks
 * @param {number} ladders
 * @return {number}
 */
const furthestBuilding = function (heights, bricks, ladders) {
  let heap = new MinHeap();
  for (let i = 0; i < heights.length - 1; i++) {
    let diff = heights[i + 1] - heights[i];
    if (diff > 0) {
      heap.insert(diff);
      if (heap.size() > ladders) {
        bricks -= heap.extract();
      }
      if (bricks < 0) {
        return i;
      }
    }
  }
  return heights.length - 1;
};

class MinHeap {
  constructor() {
    this.heap = [];
  }

  getParentIndex(i) {
    return Math.floor((i - 1) / 2);
  }

  getLeftChildIndex(parentIndex) {
    return 2 * parentIndex + 1;
  }

  getRightChildIndex(parentIndex) {
    return 2 * parentIndex + 2;
  }

  swap(i1, i2) {
    [this.heap[i1], this.heap[i2]] = [this.heap[i2], this.heap[i1]];
  }

  insert(key) {
    this.heap.push(key);
    let index = this.heap.length - 1;
    let parentIndex = this.getParentIndex(index);

    while (index !== 0 && this.heap[parentIndex] > this.heap[index]) {
      this.swap(parentIndex, index);
      index = parentIndex;
      parentIndex = this.getParentIndex(index);
    }
  }

  extract() {
    const root = this.heap[0];
    const last = this.heap.pop();
    if (this.heap.length > 0) {
      this.heap[0] = last;
      this.heapify(0);
    }
    return root;
  }

  heapify(index) {
    let left = this.getLeftChildIndex(index);
    let right = this.getRightChildIndex(index);
    let smallest = index;

    if (left < this.heap.length && this.heap[left] < this.heap[index]) {
      smallest = left;
    }

    if (right < this.heap.length && this.heap[right] < this.heap[smallest]) {
      smallest = right;
    }

    if (smallest !== index) {
      this.swap(index, smallest);
      this.heapify(smallest);
    }
  }

  size() {
    return this.heap.length;
  }
}