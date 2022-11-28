package myGames;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static myGames.Items.*;
import static myGames.Utils.chooseItem;
import static myGames.Utils.oneOrZero;

@Slf4j
public class Game {
    private static final String STR1 = "playerOne is WINNER!!!";
    private static final String STR2 = "playerTwo is WINNER!!!";
    private static final String STR3 = "no one's!!!";
    private static final String KEY1 = "PAPER_STONE";
    private static final String KEY2 = "STONE_CISSORS";
    private static final String KEY3 = "SCISSORS_PAPER";
    private static final String KEY4 = "STONE_PAPER";
    private static final String KEY5 = "SCISSORS_STONE";
    private static final String KEY6 = "PAPER_SCISSORS";
    private static final String KEY7 = "STONE_STONE";
    private static final String KEY8 = "SCISSORS_SCISSORS";
    private static final String KEY9 = "PAPER_PAPER";
    public static void ranGame(int n, String playerOne, String playerTwo) throws IOException {

        int One = 0;
        int Two = 0;
        for (int i = 0; i < n; i++) {
            String result = myGame(playerOne, playerTwo);
            if (result.equals(STR1)) {
                One++;
            } else if (result.equals(STR2)) {
                Two++;
            }
            if (n > 1) {
                System.out.println("Press 1 to continue the game and 0 to stop");
                int x = oneOrZero();
                if (x == 0) {
                    log.info("game stop");
                    break;
                }
            }
        }

        absoluteWinner(playerOne, playerTwo, One, Two);
    }

    private static void absoluteWinner(String playerOne, String playerTwo, int One, int Two) {
        System.out.println("________________________________________________");
        if (One > Two) {
            log.info("Number of games won: " + One);
            log.info("'" + playerOne + "'" + " - is absolute winner!!!!");
            System.out.println("Number of games won: " + One + " / " + playerOne + " is absolute winner!!!!");

        } else if (One < Two) {
            log.info("Number of games won: " + Two);
            log.info("'" + playerTwo + "'" + " - is absolute winner!!!!");
            System.out.println("Number of games won: " + Two + " / " + playerTwo + " is absolute winner!!!!");
        } else {
            log.info("Result os games: " + STR3);
            System.out.println(STR3);
        }
    }

    static String myGame(String playerOne, String playerTwo) {
        String result;

        System.out.println("The " + playerOne + " makes a move");
        Items itemOne = chooseItem();
        System.out.println("The " + playerTwo + " makes a move");
        Items itemTwo = chooseItem();

        HashMap<String, String> play = new HashMap<>();
        play.put(KEY1, STR1);
        play.put(KEY2, STR1);
        play.put(KEY3, STR1);

        play.put(KEY4, STR2);
        play.put(KEY5, STR2);
        play.put(KEY6, STR2);

        play.put(KEY7, STR3);
        play.put(KEY8, STR3);
        play.put(KEY9, STR3);

        result = play.get(itemOne+ "_" + itemTwo);
        System.out.println(result);
        return result;
    }
}
