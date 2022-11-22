package myGames;

public enum Items {
    STONE,
    PAPER,
    SCISSORS;

    public static void chooseItems() {
        StringBuilder message = new StringBuilder("Choose item: ");
        for (Items type : Items.values()) {
            message.append(" choose: ").append(type);
        }
        System.out.println(message);
    }
}