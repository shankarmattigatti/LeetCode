package com.leetcode.Easy;

// 1603. Design Parking System
public class DesignParkingSystem {
    private final int big, medium, small;
    private int i = 0, j = 0, k = 0;

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (i < big) {
                i++;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (j < medium) {
                j++;
                return true;
            } else {
                return false;
            }
        } else if (carType == 3) {
            if (k < small) {
                k++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
