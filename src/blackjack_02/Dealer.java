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
public class Dealer {
    
    private Hand dealerHand = new Hand();
    private Player[] myPlayers = {};
    private Deck myDeck = new Deck();
    
    public void dealOpeningHand(){
        
    }
    
    public void playOutPlayerHands(){
        for(){
            if(myPlayers[i].getMyHand().getNumOfCards()<5){
                if(myPlayers[i].getMyHand().getScore()<21){
                    System.out.println("Want a card?");
                    String response = scan.next();
                    if(response.equals("y")){
                        myPlayers[i].getMyHand().addCard(myDeck.dealCard());
                        myPlayers[i].getMyHand().printHand();
                    }
                }
            }
        }    
    }
    
    public void playOutDealerHand(){
        
    }
    
    public void declareWinners(){
        
    }
    
}
