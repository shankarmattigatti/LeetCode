/**
 * 2092. Find All People With Secret
 * @param {number} n
 * @param {number[][]} meetings
 * @param {number} firstPerson
 * @return {number[]}
 */
const findAllPeople = function (n, meetings, firstPerson) {
  meetings.sort((a, b) => a[2] - b[2]);

  const unionFind = new UnionFind(n);
  unionFind.union(0, firstPerson);

  let currentTimeIndex = 0;
  while (currentTimeIndex < meetings.length) {
    const currentTime = meetings[currentTimeIndex][2];
    const currentPool = new Set();

    while (currentTimeIndex < meetings.length && currentTime === meetings[currentTimeIndex][2]) {
      const [personA, personB] = meetings[currentTimeIndex];
      unionFind.union(personA, personB);
      currentPool.add(personA);
      currentPool.add(personB);
      currentTimeIndex++;
    }

    for (const person of currentPool) {
      if (!unionFind.connected(0, person)) {
        unionFind.reset(person);
      }
    }
  }

  const peopleKnowingSecret = [];
  for (let person = 0; person < n; person++) {
    if (unionFind.connected(person, 0)) {
      peopleKnowingSecret.push(person);
    }
  }
  return peopleKnowingSecret;
};


class UnionFind {
  constructor(size) {
    this.parent = new Array(size).fill(0).map((_, index) => index);
    this.rank = new Array(size).fill(0);
  }

  union(x, y) {
    const rootX = this.find(x);
    const rootY = this.find(y);

    if (rootX === rootY) return;

    if (this.rank[rootX] < this.rank[rootY]) {
      this.parent[rootX] = rootY;
    } else if (this.rank[rootX] > this.rank[rootY]) {
      this.parent[rootY] = rootX;
    } else {
      this.parent[rootY] = rootX;
      this.rank[rootX]++;
    }
  }

  find(person) {
    while (person !== this.parent[person]) {
      this.parent[person] = this.parent[this.parent[person]];
      person = this.parent[person];
    }
    return person;
  }

  connected(personOne, personTwo) {
    return this.find(personOne) === this.find(personTwo);
  }

  reset(person) {
    this.parent[person] = person;
    this.rank[person] = 0;
  }
}