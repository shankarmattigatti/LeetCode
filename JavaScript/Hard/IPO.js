/**
 * 502. IPO
 * @param {number} k
 * @param {number} w
 * @param {number[]} profits
 * @param {number[]} capital
 * @return {number}
 */
const findMaximizedCapital = function (k, w, profits, capital) {
  const projects = profits.map((profit, i) => [profit, capital[i]]);
  projects.sort((a, b) => a[1] - b[1]);

  let currentCapital = w;
  let i = 0;
  const availableProjects = [];

  for (let j = 0; j < k; j++) {
    while (i < projects.length && projects[i][1] <= currentCapital) {
      availableProjects.push(projects[i][0]);
      let m = availableProjects.length - 1;
      while (m > 0 && availableProjects[m] > availableProjects[m - 1]) {
        [availableProjects[m], availableProjects[m - 1]] = [availableProjects[m - 1], availableProjects[m]];
        m--;
      }
      i++;
    }

    if (availableProjects.length === 0) break;

    currentCapital += availableProjects.shift();
  }

  return currentCapital;
};