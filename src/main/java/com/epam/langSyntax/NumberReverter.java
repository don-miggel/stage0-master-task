package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int number1 = number % 10;
        int step = number / 10;
        int number2 = step % 10;
        step /=10;
        int number3 = step % 10;

        System.out.println(number1+""+number2+""+number3);
    }

}
