package tableOfContents;

import java.util.Scanner;

public class TableOfContentsUI {

    public static void main(String[] args) {

        TableOfContents tableOfContents = new TableOfContents();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Titel ein: ");
        String titel = scanner.nextLine();
        System.out.print("Bitte geben Sie die Seitenzahl ein: ");
        int seitenzahl = scanner.nextInt();
        String ergebnis = tableOfContents.createEntry(titel, Integer.toString(seitenzahl));
        System.out.println("Ergebnis : " + ergebnis);
    }
}
