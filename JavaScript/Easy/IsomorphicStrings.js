/**
 * 205. Isomorphic Strings
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
const isIsomorphic = function (s, t) {
  const s1 = new Array(256).fill(0);
  const t1 = new Array(256).fill(0);

  for (let i = 0; i < s.length; i++) {
    if (s1[s.charCodeAt(i)] !== t1[t.charCodeAt(i)]) {
      return false;
    }

    s1[s.charCodeAt(i)] = i + 1;
    t1[t.charCodeAt(i)] = i + 1;
  }

  return true;
};