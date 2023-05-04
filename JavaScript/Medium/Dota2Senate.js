/**
 * 649. Dota2 Senate
 * @param {string} senate
 * @return {string}
 */
var predictPartyVictory = function (senate) {
  const n = senate.length;
  const radiant = [];
  const dire = [];
  for (let i = 0; i < n; i++) {
    if (senate[i] === "R") {
      radiant.push(i);
    } else {
      dire.push(i);
    }
  }
  while (radiant.length > 0 && dire.length > 0) {
    if (radiant[0] < dire[0]) {
      dire.shift();
      radiant.push(radiant.shift() + n);
    } else {
      radiant.shift();
      dire.push(dire.shift() + n);
    }
  }
  return radiant.length > 0 ? "Radiant" : "Dire";
};
