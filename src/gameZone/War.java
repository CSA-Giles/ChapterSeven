package gameZone;

import java.util.Random;

public class War {
    public static void main(String[] args) {

        String[] suits = {"clubs", "hearts", "spades", "diamonds"};
        Random rand = new Random();
        int randSuit = rand.nextInt(suits.length);
        int randSuitTwo = rand.nextInt(suits.length);
        final int CARDS_IN_SUIT = 13;
        int value;
        int valueTwo;
        String cardValue;
        

        value = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        valueTwo = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        if(value > 10) {
            cardValue = setValue(value);
            System.out.println("I got a " + cardValue + " of " + suits[randSuit]);
        }
        else if(value < 2){
            cardValue = setValue(value);
            System.out.println("I got an " + cardValue + " of " + suits[randSuit]);
        }
        else{
            System.out.println("I got a " + value + " of " + suits[randSuit]);
        }

        if(valueTwo > 10) {
            cardValue = setValue(valueTwo);
            System.out.println("You got a " + cardValue + " of " + suits[randSuitTwo]);
        }
        else if(valueTwo < 2){
            cardValue = setValue(valueTwo);
            System.out.println("You got an " + cardValue + " of " + suits[randSuitTwo]);
        }
        else{
            System.out.println("You got a " + valueTwo + " of " + suits[randSuit]);
        }

        if(value == valueTwo)
            System.out.println("It's a tie");
        else if(value > valueTwo)
            System.out.println("Player One wins");
        else
            System.out.println("Player Two wins");

    }
    public static String setValue(int number){
        String type = null;
        if(number == 1) {
            type = "Ace";
        }
        else if(number == 11)
            type = "Jack";
        else if(number == 12)
            type = "Queen";
        else if(number == 13)
            type = "King";
        return type;
    }
}
