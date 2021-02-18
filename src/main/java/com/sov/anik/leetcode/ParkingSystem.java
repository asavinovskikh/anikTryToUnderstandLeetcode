package com.sov.anik.leetcode;

//https://leetcode.com/problems/design-parking-system/
public class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            } else {
                return false;
            }
        }

        if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            } else {
                return false;
            }
        }

        if (carType == 1) {
            if (small > 0) {
                small--;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //ParkingSystem obj = new ParkingSystem(big, medium, small);
    // * boolean param_1 = obj.addCar(carType);

}
