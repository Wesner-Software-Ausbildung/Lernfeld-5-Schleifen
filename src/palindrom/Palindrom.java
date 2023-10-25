package palindrom;

public class Palindrom {
    public boolean isPalindrom(String text){

        String lowerCaseText = text.toLowerCase();

        String processedText = lowerCaseText.replace(" ", "");

        StringBuilder sb = new StringBuilder(processedText);
        String reversedText = sb.reverse().toString();

        boolean isPalindrom = processedText.equals(reversedText);

        return isPalindrom;
    }
}
