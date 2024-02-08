import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String string = "We are in the class. We are here in this room.";
        System.out.println(string);
        String yourString = (string.replaceAll("We", "You"));
        System.out.println(yourString);

        String alphanumeric = "abcDeeF12grefdf532jjkds";
        System.out.println(alphanumeric.replaceAll(".", "j"));
        System.out.println(alphanumeric.replaceAll("^abcDee", "AAA"));
        System.out.println(alphanumeric.replaceAll("^abcDee", "XXX"));
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDee"));
        System.out.println(alphanumeric.matches("^abcDeeF12grefdf532jjkds"));
        System.out.println(alphanumeric.replaceAll("jjkds$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[gfr]","I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[gfr][fd]","X"));
        System.out.println("Harry".replaceAll("[Hh]arry","Harry"));

        String newAlphanumeric = "abcDeeF12grefdf532jjkds";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","A"));
        System.out.println(newAlphanumeric.replaceAll("[abcdre79325]","WWW"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]","Y"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","Y"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","Y"));
        System.out.println(newAlphanumeric.replaceAll("(?iu)[a-f3-8]","Y"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]","HHH"));
        System.out.println(newAlphanumeric.replaceAll("\\d","HHH"));
        System.out.println(newAlphanumeric.replaceAll("\\D","HHH"));

        String sentence = "This is a sentence\t and this is line one\n";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));
        System.out.println(sentence.replaceAll("\t","tab"));
        System.out.println(sentence.replaceAll("\\S",""));
        System.out.println(sentence.replaceAll("\\w","A"));
        System.out.println(sentence.replaceAll("\\W","G"));
        System.out.println(sentence.replaceAll("\\b","P"));

        String newAlphanumeric4 = "abcDeeeF12grefdfhhhiiiiijjkds";
        System.out.println(newAlphanumeric4.replaceAll("^abcDeee","Www"));
        System.out.println(newAlphanumeric4.replaceAll("^abcDe{3}","Www"));
        System.out.println(newAlphanumeric4.replaceAll("^abcDe+","QQQ"));
        System.out.println(newAlphanumeric4.replaceAll("^abcDe*","RRR"));
        System.out.println(newAlphanumeric4.replaceAll("^abcDe{2,5}","OOO"));
        System.out.println(newAlphanumeric4.replaceAll("h+i+j","Q"));

StringBuilder htmlText = new StringBuilder("<h1>Our Heading</h1>");
htmlText.append("<h2>Sub-heading</h2>");
htmlText.append("<p>This is a paragraph about something.</p>");
htmlText.append("<p>This is another paragraph about something.</p>");
htmlText.append("<h2>Summary</h2>");
htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern ="<h2>";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();

        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " +matcher.start() + " to " + matcher.end());
        }

String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }
        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
        System.out.println("harry".replaceAll("[H|h]arry","Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";
        //String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " +tNotVMatcher.end());

        }
//        start with 4 followed by 12 digits between the range of 0-9, optional additional 3 numbers betweeen the range of 0-9
        String visaRegEx = "^4[0-9]{12}([0-9]{3})?$";

        String vCard1 = "4434444544347";//match
        String vCard2 = "5434444544347";//non-match
        String vCard3 = "4434444544347333";//match
        String vCard4 = "4434444544";//non-match

        System.out.println(vCard1.matches(visaRegEx));
        System.out.println(vCard2.matches(visaRegEx));
        System.out.println(vCard3.matches(visaRegEx));
        System.out.println(vCard4.matches(visaRegEx));









    }
}
