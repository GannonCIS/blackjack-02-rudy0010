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
public class Hand {
    
    private Card[] myCards = new Card[5];
    private int score = 0;
    private int numOfCards = 0;
    
    public Hand(){}
    
    public void addCard(Card newCard){
        if(numOfCards < 5){
            
        }
    }
    
    public int getScore(){
        return score;
    }
    
    public int getNumOfCards(){
        return numOfCards;
    }
    
    public void printHand(){
        for(int i = 0; i < myCards.length; i++){
            System.out.println(myCards[i].RANK + " of " + myCards[i].SUIT);
        }
    }
    
}
