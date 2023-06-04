/**
 * 547. Number of Provinces
 * @param {number[][]} isConnected
 * @return {number}
 */
var findCircleNum = function (isConnected) {
  let count = 0;
  const visited = new Array(isConnected.length).fill(0);
  const queue = [];

  for (let i = 0; i < isConnected.length; i++) {
    if (visited[i] === 0) {
      queue.push(i);

      while (queue.length > 0) {
        const q = queue.shift();
        visited[q] = 1;

        for (let j = 0; j < isConnected.length; j++) {
          if (isConnected[q][j] === 1 && visited[j] === 0) {
            queue.push(j);
          }
        }
      }
      count++;
    }
  }

  return count;
};
