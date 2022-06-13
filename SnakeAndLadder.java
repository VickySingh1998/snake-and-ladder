package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
    int player1= 0;
    int noPlay = 0;
    int ladder = 1;
    int snake = 2;
    int diceRoll = (int) Math.floor(Math.random()*10) % 6 + 1;
    // System.out.println("Player rolled the die and got "+diceRoll);
    int option = (int) Math.floor(Math.random()*10) % 3;

    if (option == noPlay) {
        System.out.println("There is no play! player stays in the same position");
    } else if (option == ladder) {
        System.out.println("The player moves ahead by "+diceRoll);
    } else {
        System.out.println("The player moves behind by "+diceRoll);
    }
    }
}
