/**
 * 567. Permutation in String
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
const checkInclusion = function (s1, s2) {
  if (s1.length > s2.length)
    return false;

  let s1Freq = new Array(26).fill(0);
  let windowFreq = new Array(26).fill(0);

  for (let i = 0; i < s1.length; i++) {
    s1Freq[s1.charCodeAt(i) - 'a'.charCodeAt(0)]++;
    windowFreq[s2.charCodeAt(i) - 'a'.charCodeAt(0)]++;
  }

  if (arraysMatch(s1Freq, windowFreq))
    return true;

  for (let i = s1.length; i < s2.length; i++) {
    windowFreq[s2.charCodeAt(i) - 'a'.charCodeAt(0)]++;

    windowFreq[s2.charCodeAt(i - s1.length) - 'a'.charCodeAt(0)]--;

    if (arraysMatch(s1Freq, windowFreq))
      return true;
  }

  return false;
};

const arraysMatch = function (arr1, arr2) {
  for (let i = 0; i < 26; i++) {
    if (arr1[i] !== arr2[i]) return false;
  }
  return true;
};