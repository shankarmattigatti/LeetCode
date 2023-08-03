/**
 * 2785. Sort Vowels in a String
 * @param {string} s
 * @return {string}
 */
var sortVowels = function (s) {
  let vowels = [];
  const vowel = "aeiouAEIOU";
  for (let char of s) {
    if (vowel.includes(char)) {
      vowels.push(char);
    }
  }

  vowels.sort();
  let vowelIndex = 0;
  let arr = s.split('');

  for (let i = 0; i < arr.length; i++) {
    if (vowel.includes(arr[i])) {
      arr[i] = vowels[vowelIndex++];
    }
  }

  return arr.join('');
};