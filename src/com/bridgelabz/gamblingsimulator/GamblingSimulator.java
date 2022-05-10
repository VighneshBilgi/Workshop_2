package com.bridgelabz.gamblingsimulator;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");

        int stake = 100;
        int bet = 1;

        double chance = Math.random();
        if(chance <0.5){
            System.out.println("You lose 1 dollar :(");
            stake = stake - bet;
        }else{
            System.out.println("You won 1 dollar :)");
            stake = stake + bet;
        }
        System.out.println("Your stake currently is :"+stake);

    }
}
