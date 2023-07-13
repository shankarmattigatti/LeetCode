/**
 * 207. Course Schedule
 * @param {number} numCourses
 * @param {number[][]} prerequisites
 * @return {boolean}
 */
const canFinish = function (numCourses, prerequisites) {
  let adj = [];
  for (let i = 0; i < numCourses; i++) {
    adj.push([]);
  }

  for (let i = 0; i < prerequisites.length; i++) {
    adj[prerequisites[i][0]].push(prerequisites[i][1]);
  }

  let visited = new Array(numCourses).fill(0);
  for (let i = 0; i < numCourses; i++) {
    if (visited[i] == 0) {
      if (isCyclic(adj, visited, i)) return false;
    }
  }

  return true;
};

const isCyclic = function (adj, visited, curr) {
  if (visited[curr] == 2) return true;

  visited[curr] = 2;
  for (let i = 0; i < adj[curr].length; i++) {
    if (visited[adj[curr][i]] != 1) {
      if (isCyclic(adj, visited, adj[curr][i])) return true;
    }
  }

  visited[curr] = 1;
  return false;
};
