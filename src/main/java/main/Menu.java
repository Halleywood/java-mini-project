package main;

import java.util.Scanner;

public class Menu {

    public void printHeader() {
        System.out.println("🔴🔴🔴🔴🟠🟠🟠🟠🟡🟡🟡🟡🟢🟢🟢🟢🔵🔵🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠🟠🟡🟡🟡🟡🟢🟢🟢🟢🔵🔵🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠🟠🟡🟡🟡🟡🟢🟢🟢🟢🔵🔵🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠     🤘 ROCK! 🤘        🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠     🤚 PAPER! 🫱       🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠     ✌️ SCISSORS!✌️     🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠🟠🟡🟡🟡🟡🟢🟢🟢🟢🔵🔵🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠🟠🟡🟡🟡🟡🟢🟢🟢🟢🔵🔵🔵🔵🟣🟣🟣🟣");
        System.out.println("🔴🔴🔴🔴🟠🟠🟠🟠🟡🟡🟡🟡🟢🟢🟢🟢🔵🔵🔵🔵🟣🟣🟣🟣");
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

}
