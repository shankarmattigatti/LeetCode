/**
 * 2709. Greatest Common Divisor Traversal
 * @param {number[]} nums
 * @return {boolean}
 */
const canTraverseAllPairs = function (nums) {
  const n = nums.length;
  const uf = new UnionFind(n);
  const primeToIndex = new Map();

  nums.forEach((num, index) => {
    for (let prime of getPrimeFactors(num)) {
      if (primeToIndex.has(prime)) {
        uf.union(index, primeToIndex.get(prime));
      }
      primeToIndex.set(prime, index);
    }
  });

  const root = uf.find(0);
  for (let i = 1; i < n; i++) {
    if (uf.find(i) !== root) {
      return false;
    }
  }
  return true;
};

const getPrimeFactors = function (n) {
  const factors = new Set();
  for (let i = 2; i * i <= n; i++) {
    while (n % i === 0) {
      factors.add(i);
      n /= i;
    }
  }
  if (n > 1)
    factors.add(n);

  return factors;
};

class UnionFind {
  constructor(size) {
    this.root = Array.from({ length: size }, (_, index) => index);
  }

  find(x) {
    if (this.root[x] === x) {
      return x;
    }
    this.root[x] = this.find(this.root[x]);
    return this.root[x];
  }

  union(x, y) {
    const rootX = this.find(x);
    const rootY = this.find(y);
    if (rootX !== rootY) {
      this.root[rootY] = rootX;
    }
  }
}