package exercises;

import java.util.Scanner;

public class BabyNameComparison {

    public static void main(String[] args){

        String babyA;
        String babyB;
        String babyC;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a baby name >>>");
        babyA = input.next();
        System.out.print("Enter another baby name >>>");
        babyB = input.next();
        System.out.print("Enter a final baby name >>>");
        babyC = input.next();

        System.out.println("Your options for comparison are: " + babyA + " or " + babyB
        + ",\n" + babyA + " or " + babyC + ",\nand " + babyB + " or " + babyC);
    }
}
