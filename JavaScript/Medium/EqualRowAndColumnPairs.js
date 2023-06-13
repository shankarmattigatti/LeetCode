/**
 * 2352. Equal Row and Column Pairs
 * @param {number[][]} grid
 * @return {number}
 */
var equalPairs = function (grid) {
  let count = 0;
  let n = grid.length;
  let rows = grid.map((row) => row.join(","));
  let cols = Array.from({ length: n }, (_, j) =>
    grid.map((row) => row[j]).join(",")
  );

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      if (rows[i] === cols[j]) {
        count++;
      }
    }
  }

  return count;
};
