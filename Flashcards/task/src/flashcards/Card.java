package flashcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Card {

    private static final Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
    private static final Map<String, String> cards = new LinkedHashMap<>();
    private static final Random random = new Random();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Input the action (add, remove, import, export, ask, exit): ");
            System.out.print(">");
            String action = scanner.next();

            if (action.equals("exit")) {
                System.out.println("Bye bye!");
                break;
            } else if (action.equals("add")) {
                addCard();
            } else if (action.equals("ask")) {
                ask();
            } else if(action.equals("remove")) {
                remove();
            } else if(action.equals("import")) {
                importCards();
            } else if(action.equals("export")) {
                exportCards();
            }
            System.out.println();
        }
    }

    public static void addCard() {
        System.out.println("The card:");
        System.out.print(">");
        String card = scanner.next();
        if (!cards.containsValue(card)) {
            System.out.println("The definition of the card");
            System.out.print(">");
            String definition = scanner.next();
            if(!cards.containsKey(definition)) {
                cards.put(definition, card);
                System.out.println("The pair (\"" + card + "\":\"" + definition + "\") has been added.");
            } else {
                System.out.println("The definition \"" + definition + "\" already exists.");
            }
        } else {
            System.out.println("The card \"" + card + "\" already exists.");
        }
    }

    public static void ask() {
        System.out.println("How many times to ask?");
        System.out.print(">");
        int numberOfCards = scanner.nextInt();

        for (int i = 0; i < numberOfCards; i++) {
            int randomKey = random.nextInt(cards.size());
            List<String> keys = new ArrayList<>(cards.keySet());
            String key = keys.get(randomKey);

            System.out.printf("Print the definition of \"%s\":%n", cards.get(key));
            System.out.print(">");
            String answer = scanner.next();
            if (key.equals(answer)) {
                System.out.println("Correct answer");
            } else if (cards.containsKey(answer)) {
                System.out.printf("Wrong answer. The correct one is \"%s\". you've just written the definition of \"%s\"%n", key, cards.get(answer));
            } else {
                System.out.printf("Wrong answer. The correct one is \"%s\".%n", key);
            }
        }
    }

    public static void remove() {
        System.out.println("The card:");
        System.out.print(">");
        String card = scanner.next();
        String cardRemoved = "";
        for (String key : cards.keySet()) {
            if(cards.get(key).equals(card)) {
                cardRemoved = cards.remove(card);
                System.out.println("The card has been removed");
            }
        }
        if  (cardRemoved != null && cardRemoved.equals("")) {
            System.out.println("Can't remove \"" + card + "\": there is no such card.");
        }

    }

    public static void importCards() {
        System.out.println("File name:");
        System.out.print(">");
        String fileName = scanner.next();
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String[] cardsFromFile = scanner.nextLine().split(":");
//                System.out.println(cardsFromFile[0] + ":" + cardsFromFile[1]);
                cards.put(cardsFromFile[0], cardsFromFile[1]);
            }
            System.out.println(cards.size() + " cards have been loaded.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }

    public static void exportCards() {
        System.out.println("File name:");
        System.out.print(">");
        String fileName = scanner.next();
        File file = new File(fileName);
        try (FileWriter writer = new FileWriter(file)) {

            for (String definition : cards.keySet()) {
                writer.write(definition + ":" + cards.get(definition) +"\n");
            }
            System.out.println(cards.size() + " cards have been saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
