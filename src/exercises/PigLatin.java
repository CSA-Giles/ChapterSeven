package exercises;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args){

        String userEntry;
        String ay = "ay";
        Scanner input = new Scanner(System.in);
        String pigLatin;
        char first;
        String restOfString;

        System.out.print("Enter any word you want, bud >>> ");
        userEntry = input.nextLine();

        first = userEntry.charAt(0);
        if(first == 'a'||first == 'e'||first == 'i'||first== 'o'|| first == 'u'){
            System.out.println(userEntry + ay);
        }
        else{
            restOfString = userEntry.substring(1,userEntry.length());
            System.out.println(restOfString + first + ay);
        }
    }
}
