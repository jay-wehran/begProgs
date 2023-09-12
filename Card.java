/*
Jason Wehran
2/10/23
CSE007 Spring 2023: Lab 3 
VSCode / JDK 11
This program will output a random card number and suit
*/
public class Card {
    public static void main(String[] args) {

        int cardNumber = (int) (Math.random() * 52);
        String suitName;
        String cardIdentity="";
        //System.out.println(cardNumber);

        int suit = cardNumber / 13;
        int identity = cardNumber % 13;

        if(suit == 0) {
            suitName = "Diamonds";
        } else if (suit == 1) {
            suitName = "Clubs";
        } else if (suit == 2) {
            suitName = "Hearts";
        } else {
            suitName = "Spades";
        }
        //System.out.println(suitName);
        switch (identity) {
            case 0: 
                cardIdentity = "Ace";
                break;
            case 1: 
                cardIdentity = "2"; 
                break;
            case 2:
                cardIdentity = "3"; 
                break;
            case 3:
                cardIdentity = "4"; 
                break;
            case 4: 
                cardIdentity = "5"; 
                break;
            case 5:
                cardIdentity = "6"; 
                break;
            case 6:
                cardIdentity = "7"; 
                break;
            case 7:
                cardIdentity = "8"; 
                break;
            case 8:
                cardIdentity = "9"; 
                break;
            case 9:
                cardIdentity = "10"; 
                break;
            case 10: 
                cardIdentity = "Jack"; 
                break;
            case 11: 
                cardIdentity = "Queen"; 
                break;
            case 12: 
                cardIdentity = "King"; 
                break;

        }
        //System.out.println("Random Number" + cardNumber + "; You picked the " + cardIdentity + "of" + suitName);
        System.out.println("");
        System.out.println("You picked the " + cardIdentity + " of " + suitName + "!");
        System.out.println("");
    }
    
}
