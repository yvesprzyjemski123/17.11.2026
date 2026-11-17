import java.util.Scanner;

public class Aufgabe01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Anzahl der verfügbaren und zu ziehenden Zahlen abfragen
        System.out.print("Wie viele Zahlen stehen zur Verfügung? ");
        int anzahl = sc.nextInt();

        System.out.print("Wie viele Zahlen sollen gezogen werden? ");
        int ziehungen = sc.nextInt();

        // Prüfen, ob die Eingaben gültig sind
        if (ziehungen > anzahl || ziehungen <= 0 || anzahl <= 0) {
            System.out.println("Ungültige Eingabe!");
            return;
        }

        // Arrays erstellen
        int[] numbers = new int[anzahl];
        int[] result = new int[ziehungen];

        // Lostrommel mit Zahlen füllen
        for (int i = 0; i < anzahl; i++) {
            numbers[i] = i + 1;
        }

        // Zahlen ziehen
        for (int i = 0; i < ziehungen; i++) {

            // Zufälligen Index auswählen
            int zufall = (int)(Math.random() * anzahl);

            // Gezogene Zahl speichern
            result[i] = numbers[zufall];

            // Letzte Zahl der Lostrommel an die gezogene Stelle verschieben
            numbers[zufall] = numbers[anzahl - 1];

            // Lostrommel verkleinern
            anzahl--;
        }

        // Ergebnis ausgeben
        System.out.println("Die gezogenen Lottozahlen sind:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}