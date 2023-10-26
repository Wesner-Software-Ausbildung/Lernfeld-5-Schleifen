package drawingFigures;

import java.util.Scanner;

public class DrawingFiguresUI {

    public static void main(String[] args) {
        DrawingFigures draver = new DrawingFigures();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie das zu zeichnende Zeichen ein: ");
        char sign = scanner.next().charAt(0);
        System.out.print("Geben Sie die Anzahl der Zeichen ein: ");
        int numbersOfSigns = scanner.nextInt();
        draver.drawSquare(sign, numbersOfSigns);
    }
}
