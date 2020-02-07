package exercises;

import java.util.Scanner;

public class CountMovieSpaces {

    public static void main(String[] args){

        String movieQuote;
        Scanner input = new Scanner(System.in);
        int spaces = 0;

        System.out.print("Enter your favorite movie quote >>> ");
        movieQuote = input.nextLine();

        for(int i = 0; i < movieQuote.length(); ++i){
            if(movieQuote.charAt(i) == ' '){
                ++spaces;
            }
        }
        System.out.println("Amount of spaces: " + spaces);
    }
}
