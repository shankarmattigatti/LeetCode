/**
 * 1318. Minimum Flips to Make a OR b Equal to c
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {number}
 */
var minFlips = function (a, b, c) {
  let flips = 0;
  for (let i = 0; i < 32; i++) {
    let bit_a = (a >> i) & 1;
    let bit_b = (b >> i) & 1;
    let bit_c = (c >> i) & 1;

    if (bit_c === 1) {
      if ((bit_a | bit_b) !== 1) {
        flips += 1;
      }
    } else {
      flips += bit_a + bit_b; // since we need to flip both bits if they are 1
    }
  }
  return flips;
};
