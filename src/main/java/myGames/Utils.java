package myGames;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static myGames.Items.*;

@Slf4j
public class Utils {
    static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static int inputNumber() {
        try {
            return getInteger();
        } catch (IOException | RuntimeException e) {
            log.info("an exception is thrown" + e);
            System.out.println("Error - Try again");
            return inputNumber();
        }
    }

    private static int getInteger() throws IOException {
        int count = Integer.parseInt(READER.readLine());
        if (count > 0) {
            return count;
        } else {
            log.info("enter invalid number");
            System.out.println("Number must be more than 0");
            return getInteger();
        }
    }

    public static String inputName() {
        Pattern patternName = Pattern.compile("^[А-Еа-еЄєЖжЗзИиІіЇїК-Щк-щЮюЯяЬьҐґA-Za-z']{3,256}$");
        String name;
        try {
            name = READER.readLine();
        } catch (IOException e) {
            log.info("an exception is thrown" + e);
            return inputName();
        }
        if (validateData(name, patternName)) {
            return name;
        }
        System.out.println("Username is invalid.\nTry again");
        return inputName();
    }
    public static boolean validateData(String name, Pattern pattern) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static int oneOrZero() throws IOException {
        try {
        int count = Integer.parseInt(READER.readLine());
        if (count == 0 || count == 1) {
            return count;
        } else {
            System.out.println("Number must be 0 or 1, try again");
            return oneOrZero();
        }
    }catch (IOException | RuntimeException e) {
            log.info("an exception is thrown" + e);
            System.out.println("Error - Try again");
            return oneOrZero();
        }
    }
    public static Items chooseItem() {
        try {
            chooseItems();
            Items item = Items.valueOf(READER.readLine());
            if (item.equals(STONE) || item.equals(PAPER) || item.equals(SCISSORS)){
                return item;
            }
            log.info("Wrong value entered " + item);
            System.out.println("Error! Should be only 'Stone', 'Paper' or 'Scissors'" + " Try again!");
            return chooseItem();

        } catch (IOException | RuntimeException e) {
            log.info("an exception is thrown" + e);
            System.out.println("Error - Try again");
            return chooseItem();
        }
    }
}
