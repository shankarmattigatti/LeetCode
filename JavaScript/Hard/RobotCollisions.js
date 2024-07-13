/**
 * 2751. Robot Collisions
 * @param {number[]} positions
 * @param {number[]} healths
 * @param {string} directions
 * @return {number[]}
 */
const survivedRobotsHealths = function (positions, healths, directions) {
  let robots = positions.map((pos, index) => ({
    pos: pos,
    health: healths[index],
    dir: directions[index],
    index: index
  }));

  let stack = [];
  robots.sort((a, b) => a.pos - b.pos);
  for (let robot of robots) {
    if (robot.dir === 'R') {
      stack.push(robot);
    } else {
      while (stack.length > 0 && stack[stack.length - 1].dir === 'R') {
        let last = stack[stack.length - 1];
        if (last.health > robot.health) {
          last.health--;
          robot.health = 0;
          break;
        } else if (last.health < robot.health) {
          robot.health--;
          stack.pop();
        } else {
          stack.pop();
          robot.health = 0;
          break;
        }
      }
      if (robot.health > 0) {
        stack.push(robot);
      }
    }
  }

  let result = new Array(positions.length).fill(0);
  for (let robot of stack) {
    result[robot.index] = robot.health;
  }
  return result.filter(h => h > 0);
};