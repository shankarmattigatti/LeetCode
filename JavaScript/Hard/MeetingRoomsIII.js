/**
 * 2402. Meeting Rooms III
 * @param {number} n
 * @param {number[][]} meetings
 * @return {number}
 */
const mostBooked = function (n, meetings) {
  const bookingCount = new Array(n).fill(0);
  const roomAvailabilityTimes = new Array(n).fill(0);

  meetings.sort((a, b) => a[0] - b[0]);
  for (let i = 0; i < meetings.length; i++) {
    const [meetingStart, meetingEnd] = meetings[i];
    let roomBooked = false;
    let earliestAvailableRoomIndex = -1;
    let earliestEndTime = Number.MAX_SAFE_INTEGER;
    for (let j = 0; j < n; j++) {
      if (roomAvailabilityTimes[j] < earliestEndTime) {
        earliestEndTime = roomAvailabilityTimes[j];
        earliestAvailableRoomIndex = j;
      }
      if (roomAvailabilityTimes[j] <= meetingStart) {
        roomBooked = true;
        bookingCount[j]++;
        roomAvailabilityTimes[j] = meetingEnd;
        break;
      }
    }
    if (!roomBooked) {
      bookingCount[earliestAvailableRoomIndex]++;
      roomAvailabilityTimes[earliestAvailableRoomIndex] += (meetingEnd - meetingStart);
    }
  }

  let maxBookings = -1;
  let mostBookedRoomIndex = -1;
  for (let i = 0; i < n; i++) {
    if (bookingCount[i] > maxBookings) {
      maxBookings = bookingCount[i];
      mostBookedRoomIndex = i;
    }
  }
  return mostBookedRoomIndex;
};