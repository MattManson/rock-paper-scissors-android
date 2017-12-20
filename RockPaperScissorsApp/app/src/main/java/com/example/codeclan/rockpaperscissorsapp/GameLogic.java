package com.example.codeclan.rockpaperscissorsapp;

/**
 * Created by Weasel on 20/12/2017.
 */

public class GameLogic {

    Computer computer;

    public GameLogic(){
        computer = new Computer("bob");
    }

    public String play(String computerHand, String playerHand){
        String win;
        if ((computerHand == "rock" && playerHand == "scissors") |
                (computerHand == "paper" && playerHand == "rock") |
                (computerHand == "scissors" && playerHand == "paper")
                ) {
            win = "computer wins with " + computerHand;}
            else if(computerHand == playerHand){
                win = "draw";
            }
            else{ win = "player wins with " + playerHand;}
            return win;
    }



}
