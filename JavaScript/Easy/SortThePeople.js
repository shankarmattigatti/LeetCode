/**
 * 2418. Sort the People
 * @param {string[]} names
 * @param {number[]} heights
 * @return {string[]}
 */
const sortPeople = function (names, heights) {
  let map = new Map();
  for (let i = 0; i < names.length; i++) {
    map.set(heights[i], names[i]);
  }

  var sortedMap = new Map([...map.entries()]
                      .sort((a, b) => b[0] - a[0]));

  return [...sortedMap.values()];
};