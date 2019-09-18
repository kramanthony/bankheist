/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;  // Import the Scanner class

public class sandbox {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to the Bank Hesit, type 'play' to begin!");
        String startGame = scan.nextLine(); // read user input
        if (startGame.toLowerCase().equals("play")) {
            System.out.println("Hey, name is Ron, got a name kid?");
            String userName = scan.nextLine();  // Read user input
            System.out.println("Alright, " + userName + ", got it, let's go.");  // Output user input
            playGame(userName);
        }

    }

    public static String playGame(String userName) {
        Scanner scanTwo = new Scanner(System.in); // create a scanner object
        String firstDecision = scanTwo.nextLine(); // read user input on wether to go in the front or the back of the bank.
        System.out.println("Alright," + userName + "Your choice, do you want to go through the front or the back of the Bank, choose wisely..");

    }
}

/* Make text string to say "Welcome to Bank Heist, type "PLAY" to begin!"
Ask for user input for name "What's your name?"

Game Text:
String Text: Go in through the front or back?
    if back, choose to wait for guard or try and sneak past him
        if they sneak past him, cops arrive, if not, get behind front desk
            Try to bust open the bank vault door or go over to file cabinet for access code.
            if they choose to bust open the bank vault door, police arrive, end game. If they choose to check file cabinets:
                Find code: "3584"
                    Take player to bank vault door and ask for code: Wrong input ends game, right input gets money "You Win!".
    if front - walk in and go upto front desk
    String Text: Shout "give me the money!" or try and crack the side door
        if they choose to shout, police arive, game ends. If not, continue:
            Door unlocks, continue behind front desk to bank vault door.
            Try to bust open the bank vault door or go over to file cabinet for access code.
            if they choose to bust open the bank vault door, police arrive, end game. If they choose to check file cabinets:
                Find code: "3584"
                    Take player to bank vault door and ask for code: Wrong input ends game, right input gets money.

 */
  