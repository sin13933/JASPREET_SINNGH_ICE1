/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
/**
 *Name: Jaspreet Singh
 * Student ID:991711642
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
             Card c = new Card();
            Random random = new Random();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
            magicHand[i] = c;
        
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter Value between 1-13");
            int number = scan.nextInt();
            System.out.println("Enter Suit from Hearts, Diamonds,Spades,Clubs");
            String cards = scan.next();
            
        Card userCard = new Card();
        userCard.setValue(number);
        userCard.setSuit(cards);
        int luckyNum = 7;
        String luckySuit = "Hearts";

        if ((c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) || (luckyNum== c.getValue() && luckySuit ==c.getSuit() ) ) {
            System.out.println("You win, it is in the magic hand");
        } else {
            System.out.println("You lose,it is not in the magic hand");
        }
    }
    }
    }
    

