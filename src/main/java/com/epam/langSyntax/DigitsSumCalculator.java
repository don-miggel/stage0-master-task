package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int step = number;
        int number1 = number % 10;
        step /= 10;
        int number2 = step % 10;
        step /=10;
        int number3 = step % 10;
        step /=10;
        int number4 = step % 10;

        System.out.println(number1+number2+number3+ number4);

    }

}
