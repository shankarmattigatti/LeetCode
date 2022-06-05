package com.leetcode.Medium;

import java.util.TreeSet;

// 1845. Seat Reservation Manager
public class SeatReservationManager {
    private TreeSet<Integer> seats;

    public SeatReservationManager(int n) {
        seats = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            seats.add(i);
        }
    }

    public int reserve() {
        return seats.pollFirst();
    }

    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
    }
}
