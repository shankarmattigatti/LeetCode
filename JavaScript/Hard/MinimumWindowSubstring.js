/**
 * 76. Minimum Window Substring
 * @param {string} s
 * @param {string} t
 * @return {string}
 */
const minWindow = function (s, t) {
  if (s.length === 0 || t.length === 0)
    return "";

  let charFreqMap = new Map();
  for (let ch of t) {
    charFreqMap.set(ch, (charFreqMap.get(ch) || 0) + 1);
  }

  let winStart = 0, matched = 0, minLength = s.length + 1, subStrStart = 0;
  for (let winEnd = 0; winEnd < s.length; winEnd++) {
    let rightChar = s[winEnd];
    if (charFreqMap.has(rightChar)) {
      charFreqMap.set(rightChar, charFreqMap.get(rightChar) - 1);
      if (charFreqMap.get(rightChar) >= 0) {
        matched++;
      }
    }

    while (matched === t.length) {
      if (minLength > winEnd - winStart + 1) {
        minLength = winEnd - winStart + 1;
        subStrStart = winStart;
      }

      let leftChar = s[winStart++];
      if (charFreqMap.has(leftChar)) {
        if (charFreqMap.get(leftChar) === 0) {
          matched--;
        }

        charFreqMap.set(leftChar, charFreqMap.get(leftChar) + 1);
      }
    }
  }

  return minLength > s.length ? "" : s.substring(subStrStart, subStrStart + minLength);
};