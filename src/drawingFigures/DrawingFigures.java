package drawingFigures;

public class DrawingFigures {

    public void drawSquare(char sign, int numberOfSings) {

        for (int i = 0; i < numberOfSings; i++) {

            if (i == 0 || i == numberOfSings - 1) {
                for (int j = 0; j < numberOfSings; j++) {
                    System.out.print(sign + "  ");
                }
                System.out.println();
            }
            else {
                System.out.print(sign + "  ");
                for (int j = 0; j < numberOfSings; j++) {
                    System.out.print("  ");
                }
                System.out.print(sign + "  ");
                System.out.println();
            }
        }

    }
}
