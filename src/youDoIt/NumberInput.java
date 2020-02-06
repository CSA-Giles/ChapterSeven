package youDoIt;


import java.util.Scanner;

public class NumberInput {

    public static void main(String[] args){

        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number >>>");
        inputNumber = input.nextInt();
        result = inputNumber * FACTOR;

        System.out.print(inputNumber + " * " + FACTOR + " = " + result);


    }
}
