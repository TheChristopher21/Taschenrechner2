import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double zahl1, zahl2, ergebnis;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Wähle aus +, -, *, /, W");
        String operator = scanner.nextLine();

        if (Objects.equals(operator, "W")) {

            System.out.println("Gib eine zahl ein um die Wurzel aus ihr zu ziehen");
            zahl1 =scanner.nextDouble();

            ergebnis = Math.sqrt(zahl1);
            System.out.println("die wurzel aus" + " " + zahl1 + " " + "ist" + " " + ergebnis);
        }

       else if (Objects.equals(operator,"/")) {

            System.out.println("Erste Zahl bitte um sie zu dividieren");
            zahl1 = scanner.nextDouble();

            System.out.println("Zweite Zahl bitte um sie zu dividieren");
            zahl2 = scanner.nextDouble();

            ergebnis = zahl1 / zahl2;
            System.out.println("Das Ergebnis ist: " + ergebnis);
        }

        else if (Objects.equals(operator,"*")){

            System.out.println("Erste Zahl bitte um sie zu multiplizieren");
            zahl1 = scanner.nextDouble();

            System.out.println("Zweite Zahl bitte um sie zu multiplizieren");
            zahl2 = scanner.nextDouble();

            ergebnis = zahl1 * zahl2;
            System.out.println("Das Ergebnis ist: " + ergebnis);
        }

        else if (Objects.equals(operator, "+")) {
            System.out.println("Erste Zahl bitte");
            zahl1 = scanner.nextDouble();

            System.out.println("Zweite Zahl bitte");
            zahl2 = scanner.nextDouble();

            ergebnis = zahl1 + zahl2;
            System.out.println("Ergebnis ist" + ergebnis);

        } else if (Objects.equals(operator, "-")) {
            System.out.println("Erste Zahl bitte");
            zahl1 = scanner.nextDouble();

            System.out.println("Zweite Zahl bitte");
            zahl2 = scanner.nextDouble();

            ergebnis = zahl1 - zahl2;
            System.out.println("Ergebnis ist" + ergebnis);
        }

        else {
            System.out.println("Falsche angabe");

        }
    }
}
