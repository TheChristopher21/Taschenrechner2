package switchcase;

import java.util.Scanner;

public class TaschenrechnerSwitch {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte gebe eine zahl ein");
            int zahl1 = scanner.nextInt();

            System.out.println("Wähle ein operator aus");
            String operator = scanner.next();

            System.out.println("Gib die zweite Zahl ein");
            int zahl2 = scanner.nextInt();

            int a = 0;
            switch (operator) {
                case "+":
                    a = zahl1 + zahl2;
                    break;
                case "-":
                    a = zahl1 - zahl2;
                    break;
                case "*":
                    a = zahl1 * zahl2;
                    break;
                case "/":
                    a = zahl1 / zahl2;
                    break;
                case "w":
                    a = (int) Math.sqrt(zahl1);
                    break;
                default:
                    System.out.println("Falscher operator");
                    return;
            }
            System.out.println(a);


            System.out.println("Möchtest du die Anwendung erneut starten? (ja/nein)");
            String erneutStarten = scanner.next();
            if (!erneutStarten.equalsIgnoreCase("ja")) {
                break;
            }
        }

        System.out.println("Die Anwendung wurde beendet.");
    }



            }

