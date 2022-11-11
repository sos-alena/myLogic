package myGames;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;


import static myGames.Game.ranGame;
import static myGames.Utils.inputName;
import static myGames.Utils.inputNumber;
@Slf4j
public class AppGame {

    public static void main(String[] args) throws IOException {
        log.info("Game start:");

        String[] str = {"Stone", "Scissors", "Paper"};

        System.out.println("Enter number of games ");
        int n = inputNumber();

        System.out.println("Enter name of playerOne: ");
        String playerOne = inputName();
        System.out.println("playerOne - " + playerOne);
        System.out.println("--------------------------------");

        System.out.println("Enter name of playerTwo: ");
        String playerTwo = inputName();
        System.out.println("playerTwo - " + playerTwo);
        System.out.println("--------------------------------");

        ranGame(str, n, playerOne, playerTwo );
    }
}
