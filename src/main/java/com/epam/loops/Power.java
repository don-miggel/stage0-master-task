package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {

        int totalMult = 1;
        for(int i = 1; i <= power; i++)
            totalMult *= numberToPrint;
        System.out.println(totalMult);


    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
