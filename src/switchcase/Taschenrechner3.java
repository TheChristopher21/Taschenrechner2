package switchcase;

import java.util.Scanner;

public class Taschenrechner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double zahl1 = 0;
        double ergebnis = 0;
        boolean ersteEingabe = true;

        while (true) {
            if (ersteEingabe) {
                System.out.println("Bitte gib eine Zahl ein:");
                zahl1 = scanner.nextInt();
                ersteEingabe = false;
                ergebnis += zahl1;
            }

            System.out.println("Wähle einen Operator aus (oder = zum Beenden):");
            String operator = scanner.next();

            if (operator.equals("=")) {
                System.out.println("Das Endergebnis ist: " + ergebnis);
                break;
            }

            System.out.println("Gib die nächste Zahl ein:");
            int zahl2 = scanner.nextInt();

            switch (operator) {
                case "+":
                    ergebnis += zahl2;
                    break;
                case "-":
                    ergebnis -= zahl2;
                    break;
                case "*":
                    ergebnis *= zahl2;
                    break;
                case "/":
                    ergebnis /= zahl2;
                    break;
                case "w":
                    ergebnis = (int) Math.sqrt(zahl1);
                    break;
                case "P":
                    ergebnis = Math.pow(zahl1, zahl2);
                    break;
                default:
                    System.out.println("Ungültiger Operator");
                    return;
            }

        }

        System.out.println("Die Anwendung wurde beendet.");
    }
}
