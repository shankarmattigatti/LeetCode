/**
 * 2742. Painting the Walls
 * @param {number[]} cost
 * @param {number[]} time
 * @return {number}
 */
const paintWalls = function(cost, time) {
    const n = cost.length;

    let minCosts = new Array(n + 1).fill(Number.MAX_SAFE_INTEGER);
    minCosts[0] = 0;

    for (let i = 0; i < n; i++) {
        for (let j = n; j > 0; j--) {
            const previousWallIndex = Math.max(j - time[i] - 1, 0);
            minCosts[j] = Math.min(minCosts[j], minCosts[previousWallIndex] + cost[i]);
        }
    }

    return minCosts[n];
};