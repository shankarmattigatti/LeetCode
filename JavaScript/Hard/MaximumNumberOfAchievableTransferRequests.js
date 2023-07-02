/**
 * 1601. Maximum Number of Achievable Transfer Requests
 * @param {number} n
 * @param {number[][]} requests
 * @return {number}
 */
var maximumRequests = function (n, requests) {
  let res = [0];
  let net = Array(n).fill(0);
  dfs(requests, net, 0, 0, res);
  return res[0];
};

const dfs = function (requests, net, i, count, res) {
  if (i === requests.length) {
    for (let j = 0; j < net.length; j++) {
      if (net[j] !== 0) return;
    }
    res[0] = Math.max(res, count);
    return;
  }
  let from = requests[i][0];
  let to = requests[i][1];
  net[from]--;
  net[to]++;
  dfs(requests, net, i + 1, count + 1, res);
  net[from]++;
  net[to]--;

  dfs(requests, net, i + 1, count, res);
};
