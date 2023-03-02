/**
 * 443. String Compression
 * @param {character[]} chars
 * @return {number}
 */
var compress = function (chars) {
  if (chars.length < 2) return chars.length;

  let count = 1;
  let prev = chars[0];
  let sb = "";
  for (let i = 1; i < chars.length; i++) {
    if (prev === chars[i]) {
      count++;
    } else {
      sb += prev;
      if (count > 1) sb += count;

      prev = chars[i];
      count = 1;
    }
  }
  sb += prev;
  if (count > 1) sb += count;

  for (let i = 0; i < sb.length; i++) {
    chars[i] = sb.charAt(i);
  }
  return sb.length;
};
