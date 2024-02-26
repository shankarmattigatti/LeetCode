/**
 * 1037. Valid Boomerang
 * @param {number[][]} points
 * @return {boolean}
 */
const isBoomerang = function (points) {
  const [[x1, y1], [x2, y2], [x3, y3]] = points;

  const area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

  return area !== 0;
};