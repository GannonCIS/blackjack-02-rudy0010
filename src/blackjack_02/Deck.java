/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack_02;

/**
 *
 * @author gubotdev
 */
public class Deck {
    
    private Card[] myCards = new Card[52];
    private int nextCard = 0;
    private String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack"
    ,"King","Queen"};
    private String[] suits = {};
    
    public Deck(){
        initDeck();
        shuffle();
        
    }

    private void initDeck() {
        
    }

    private void shuffle() {
        
    }
    
    public Card dealCard(){
        
        return null; //Don't forget to change this!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
    
    public void printDeck(){
        for(int i = 0; i < myCards.length; i++){
            System.out.println(myCards[i].RANK + " of " + myCards[i].SUIT);
        }
    }
    
}
