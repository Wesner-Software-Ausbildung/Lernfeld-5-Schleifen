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
                System.out.print(sign + " ");
                for (int j = 0; j < numberOfSings; j++) {
                    System.out.print("  ");
                }
                System.out.print(sign + " ");
                System.out.println();
            }
        }

    }

    public void drawRhombus(int diameter) {

        if (diameter < 5 || diameter > 50 || diameter % 2 == 0) {
            System.out.print("Ungültiger Durchmesser. Der Durchmesser muss eine ungerade Zahl von 5 bis 50 sein. Versuch bitte noch mal.");
            return;
        }

        int middle = diameter / 2;

        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                if (Math.abs(j - middle) + Math.abs(i - middle) == middle) {
                    if ((i == 0 && j == middle) || (i == middle && j == 0) || (i == diameter - 1 && j == middle) || (i == middle && j == diameter - 1)) {
                        System.out.print(".");
                    } else if (i <= middle) {
                        if (j < middle) {
                            System.out.print("/");
                        } else {
                            System.out.print("\\");
                        }
                    } else {
                        if (j < middle) {
                            System.out.print("\\");
                        } else {
                            System.out.print("/");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
