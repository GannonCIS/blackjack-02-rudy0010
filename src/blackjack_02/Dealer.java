/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack_02;

import java.util.Scanner;

/**
 *
 * @author gubotdev
 */
public class Dealer {
    
    private Hand dealerHand = new Hand();
    private Player[] myPlayers = {};
    private Deck myDeck = new Deck();
    
    Scanner scan = new Scanner(System.in);
    
    public Dealer(int numOfPlayers){

    }
    
    public Dealer(){
        System.out.println("How many want to play?");
        int num = scan.nextInt();
        initPlayers(num);
    }
    
    private void initPlayers(int numOfPlayers){
        myPlayers = new Player[numOfPlayers];
        for(int i = 0; i < myPlayers.length; i++){
            System.out.println("Player " + (i+1) + " what's your name?");
            String name = scan.next();
            if(name.equals("")){
                myPlayers[i] = new Player(i+1);
            }else{
                myPlayers[i] = new Player(name);   
            }
        }
    }
    
    public void dealOpeningHand(){
        for (int i = 0; i  < 2; i++){
            for (Player currPlayer : myPlayers){
                currPlayer.getMyHand().addCard(myDeck.dealCard());
            }
            dealerHand.addCard(myDeck.dealCard());
        }
    }
    
    public void playOutPlayerHands(){
        for(Player currPlayer : myPlayers){
            System.out.println(currPlayer.getName() + "'s Hand");
            currPlayer.getMyHand().printHand();
            while(currPlayer.getMyHand().getNumOfCards() < 5 && 
                    currPlayer.getMyHand().getScore() < 21){
                System.out.println(currPlayer.getName() +
                        ", would you like to hit? (y/n)");
                char opt = scan.next().toLowerCase().charAt(0);
                System.out.println("\n");
                if(opt=='y'){
                    currPlayer.getMyHand().addCard(myDeck.dealCard());
                }else{
                    break;
                }
                System.out.println(currPlayer.getName() + "'s Hand");
                currPlayer.getMyHand().printHand();
            }
        }
    }
    
    public void playOutDealerHand(){
        
    }
    
    public void declareWinners(){
        
    }
    
}
