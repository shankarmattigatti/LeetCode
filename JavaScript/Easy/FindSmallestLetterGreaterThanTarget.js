/**
 * 744. Find Smallest Letter Greater Than Target
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function (letters, target) {
  let min = Number.MAX_SAFE_INTEGER;
  let ch = target;
  for (let letter of letters) {
    let difference = letter.charCodeAt(0) - target.charCodeAt(0);
    if (difference < min && letter > target) {
      min = difference;
      ch = letter;
    }
  }
  return ch === target ? letters[0] : ch;
};
