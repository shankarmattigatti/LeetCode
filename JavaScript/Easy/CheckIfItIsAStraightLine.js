/**
 * 1232. Check If It Is a Straight Line
 * @param {number[][]} coordinates
 * @return {boolean}
 */
var checkStraightLine = function (coordinates) {
  var point1 = coordinates[1];
  var point2 = coordinates[0];
  var gSlope = slope(point1, point2);

  for (var i = 1; i < coordinates.length; i++) {
    var p1 = coordinates[i];
    var p2 = coordinates[0];
    var slop = slope(p1, p2);
    if (gSlope !== slop) return false;
  }
  return true;
};

const slope = function (p1, p2) {
  if (p1[0] - p2[0] === 0) {
    return Infinity;
  }

  return (p2[1] - p1[1]) / (p2[0] - p1[0]);
};
