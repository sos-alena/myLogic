package myGames;

import static myGames.Utils.chooseItem;

public class Game2 {


    private static final String STR1 = "playerOne is WINNER!!!";
    private static final String STR2 = "playerTwo is WINNER!!!";
    private static final String STR3 = "no one's!!!";

    static String myGame2(String playerOne, String playerTwo) {
        String result = null;

        System.out.println("The " + playerOne + " makes a move");
        String itemOne = chooseItem();
        System.out.println("The " + playerTwo + " makes a move");
        String itemTwo = chooseItem();

        if (itemOne.equals("Stone") && itemTwo.equals("Scissors")) {
            result = STR1;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Stone") && itemTwo.equals("Paper")) {
            result = STR2;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Stone") && itemTwo.equals("Stone")) {
            result = STR3;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Scissors") && itemTwo.equals("Stone")) {
            result = STR2;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Scissors") && itemTwo.equals("Paper")) {
            result = STR1;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Scissors") && itemTwo.equals("Scissors")) {
            result = STR3;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Paper") && itemTwo.equals("Scissors")) {
            result = STR2;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Paper") && itemTwo.equals("Stone")) {
            result = STR1;
            System.out.println(result);
            System.out.println();
        } else if (itemOne.equals("Paper") && itemTwo.equals("Paper")) {
            result = STR3;
            System.out.println(result);
            System.out.println();
        }

        return result;
    }
}
