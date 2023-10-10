package tableOfContents;

public class TableOfContents {
    public String createEntry(String heading, String page) {

        int dotsCount = 50 - heading.length() - page.length();

        if (dotsCount < 0) {
            return "";
        }

        StringBuilder dots = new StringBuilder(dotsCount);
        for (int i = 0; i < dotsCount; i++) {
            dots.append(".");
        }

        return heading + dots.toString() + page;
    }
}
