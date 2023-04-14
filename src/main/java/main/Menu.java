package main;

import java.util.Scanner;

public class Menu {

    public void printHeader() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" 🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠");
        System.out.println(" 🟠🤘 ROCK! 🤘  🤚 PAPER! 🫱  ✌️ SCISSORS!✌️ 🟠 ");
        System.out.println(" 🟠🤘 ROCK! 🤘  🤚 PAPER! 🫱  ✌️ SCISSORS!✌️ 🟠 ");
        System.out.println(" 🟠🤘 ROCK! 🤘  🤚 PAPER! 🫱  ✌️ SCISSORS!✌️ 🟠 ");
        System.out.println(" 🟠🤘 ROCK! 🤘  🤚 PAPER! 🫱  ✌️ SCISSORS!✌️ 🟠 ");
        System.out.println(" 🟠🤘 ROCK! 🤘  🤚 PAPER! 🫱  ✌️ SCISSORS!✌️ 🟠 ");
        System.out.println(" 🟠🤘 ROCK! 🤘  🤚 PAPER! 🫱  ✌️ SCISSORS!✌️ 🟠 ");
        System.out.println(" 🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠");
    }

    public void printCelebration(String input) {
        System.out.println("🎉🎊🥳🎈🎉🎊" + input + " you won this round! 🎉🎊🥳🎈🎉🎊 ");
    }

    public static void printComputer(){
        System.out.println("Looks like the computer wins this round! 🤖🤖🤖");
    }

    public static void scoreBoard(){
        System.out.println("🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠");
        System.out.println("🟠🟠       SCOREBOARD      🟠🟠");
        System.out.println("🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠🟠");
    }
    public static void endMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Thanks for playing! 🪨📃✂️");
        System.out.println("PRESS 1: to play a new game");
        System.out.println("PRESS 2: to see your score history");
        while (!s.hasNext("[12]")) {
            System.out.println("Please enter a 1 or 2");
            s.next();
        }
        String choice = s.next();
        if(choice.equals("1")){
            Main.startNewGame(s);
        }
        else{
            System.out.println("player history here!");
        }
    }

}
