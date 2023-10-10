package numberAnalyser;

public class NumberAnalyser {

    public int getGGT(int number1, int number2) {

        int divider = 1;

        int min = number1;
        if (number2 < number1) {
            min = number2;
        }

        min = (number1 < number2) ? number1 : number2;

        for (int currentDivider = divider + 1; currentDivider < Math.min(number1, number2); currentDivider++)
        if (number1 % currentDivider == 0 && number2 % currentDivider == 0) {
            divider = currentDivider;

        }
        return 0;
    }

    public boolean isPrimeNumber(int number) {
        return false;
    }

    public String getPrimeNumbers(int start, int end) {
        return "";
    }

    public int getChecksum(int number) {
        return 0;
    }

    public boolean isHappyNumber(int number) {
        return false;
    }

    public boolean isPerfectNumber(int number) {
        return false;
    }
}
