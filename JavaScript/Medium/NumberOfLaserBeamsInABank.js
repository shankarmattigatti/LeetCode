/**
 * 2125. Number of Laser Beams in a Bank
 * @param {string[]} bank
 * @return {number}
 */
const numberOfBeams = function (bank) {
  let totalBeams = 0;
  let prevDeviceCount = 0;

  for (let i = 0; i < bank.length; i++) {
    let currentRow = bank[i];
    let deviceCount = 0;

    for (let j = 0; j < currentRow.length; j++) {
      if (currentRow[j] === "1") {
        deviceCount++;
      }
    }

    if (deviceCount > 0) {
      totalBeams += deviceCount * prevDeviceCount;
      prevDeviceCount = deviceCount;
    }
  }

  return totalBeams;
};
