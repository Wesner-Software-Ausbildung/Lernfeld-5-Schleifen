package numberListGenerator;

public class Generator {

    public String generateNumbers(int start, int end) {

        if (start >= end) {
            return "";
        }
        String result = "";

        for (int i = start; i <= end; i++) {
            result += i + ",";
        }

        result = result.substring(0, result.length() -1);
        return result;
    }

    public String generateNumbers(int start, int end, int steps, char delimiter) {

        if (start >= end) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i += steps) {

            result.append(i).append(delimiter);
        }
        result.deleteCharAt(result.length() -1);

        return result.toString();
    }

}
