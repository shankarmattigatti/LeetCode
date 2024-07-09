/**
 * 1701. Average Waiting Time
 * @param {number[][]} customers
 * @return {number}
 */
const averageWaitingTime = function (customers) {
  let startTime = 0, totalWaitingTime = 0;
  customers.forEach((customer) => {
    startTime = Math.max(startTime, customer[0]);
    totalWaitingTime += customer[1] + (startTime - customer[0]);
    startTime += customer[1];
  });

  return totalWaitingTime / customers.length;
};