package myGames;



import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static myGames.Game2.myGame2;
import static myGames.Utils.*;

@Slf4j
public class Game {
    private static final String STR1 = "playerOne is WINNER!!!";
    private static final String STR2 = "playerTwo is WINNER!!!";
    private static final String STR3 = "no one's!!!";

    public static void ranGame(int n, String playerOne, String playerTwo) throws IOException {

        int One = 0;
        int Two = 0;
        for (int i = 0; i < n; i++) {
            String result = myGame2(playerOne, playerTwo);
            if (result.equals(STR1)) {
                One++;
            } else if (result.equals(STR2)) {
                Two++;
            }
            if(n > 1) {
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

    static String myGame(String[] str) {
        String result = null;
        int playerOne = (int) Math.floor(Math.random() * str.length);
        System.out.println("playerOne - " + str[playerOne]);
        int playerTwo = (int) Math.floor(Math.random() * str.length);
        System.out.println("playerTwo - " + str[playerTwo]);


        if (str[playerOne].equals("Stone") && str[playerTwo].equals("Scissors")) {
            result = STR1;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Stone") && str[playerTwo].equals("Paper")) {
            result = STR2;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Stone") && str[playerTwo].equals("Stone")) {
            result = STR3;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Scissors") && str[playerTwo].equals("Stone")) {
            result = STR2;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Scissors") && str[playerTwo].equals("Paper")) {
            result = STR1;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Scissors") && str[playerTwo].equals("Scissors")) {
            result = STR3;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Paper") && str[playerTwo].equals("Scissors")) {
            result = STR2;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Paper") && str[playerTwo].equals("Stone")) {
            result = STR1;
            System.out.println(result);
            System.out.println();
        } else if (str[playerOne].equals("Paper") && str[playerTwo].equals("Paper")) {
            result = STR3;
            System.out.println(result);
            System.out.println();
        }

        return result;
    }
}
