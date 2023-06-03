/**
 * 1376. Time Needed to Inform All Employees
 * @param {number} n
 * @param {number} headID
 * @param {number[]} manager
 * @param {number[]} informTime
 * @return {number}
 */
const numOfMinutes = function (n, headID, manager, informTime) {
  const adjList = new Array(n).fill(null).map(() => []);
  for (let i = 0; i < n; i++) {
    if (manager[i] !== -1) {
      adjList[manager[i]].push(i);
    }
  }

  return dfs(headID, adjList, informTime);
};

const dfs = function (node, adjList, informTime) {
  let maxTime = 0;
  for (const sub of adjList[node]) {
    maxTime = Math.max(maxTime, dfs(sub, adjList, informTime));
  }

  return maxTime + informTime[node];
};
