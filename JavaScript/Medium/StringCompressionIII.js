/**
 * 3163. String Compression III
 * @param {string} word
 * @return {string}
 */
const compressedString = function(word) {
    let count = 1;
    let comp = "", prev = word[0];
    for (let i = 1; i < word.length; i++) {
        if (count == 9 || prev != word[i]) {
            comp += count + prev;
            prev = word[i];
            count = 1;
        } else {
            count++;
        }
    }

    return comp += count + prev;
};