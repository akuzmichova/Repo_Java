package Class5;

import java.util.Arrays;
import java.util.Locale;

public class Homework5 {
    public static void main(String[] args) {

        String fullName = "  Aksana V Kuzmichova  ";
        String fullNameNoSpace = fullName.trim().toUpperCase();
        boolean isFirstNameStartsWith_K_k = fullNameNoSpace.startsWith("K");
        //boolean isFirstNameStartsWith_K_k = fullNameNoSpace.startsWith("K") || fullNameNoSpace.startsWith("k");
        System.out.println("Does first name starts with 'K': " + isFirstNameStartsWith_K_k);
        String[] afterSplitBySpace = fullNameNoSpace.split(" ");
        int lastIndex = afterSplitBySpace.length - 1;
        boolean lastLetter_A_a = afterSplitBySpace[lastIndex].endsWith("a") ||afterSplitBySpace[lastIndex].endsWith("A");

        if (lastIndex >= 1) {
            System.out.println("Does last name ends with 'a': " + lastLetter_A_a);
            System.out.println("First letter of last name is: " + afterSplitBySpace[lastIndex].charAt(0));
        }
        else {
            System.out.println("No last name entered");
        }
        int firstNameLength = afterSplitBySpace[0].split("").length;
        System.out.println("Number of letters in the first name is: " + firstNameLength);

        String threeWordsSentence_1 =  "  hApPY nEW yeAr   ";
        String threeWordsSentence_1ToLowerCase = threeWordsSentence_1.toLowerCase().trim();
        String[] threeWordsSentence_1Split = threeWordsSentence_1ToLowerCase.split(" ");
        String firstWordFirstLetter = threeWordsSentence_1Split[0].toUpperCase().substring(0,1);
        String secondWordFirstLetter = threeWordsSentence_1Split[1].toUpperCase().substring(0,1);
        String thirdWordFirstLetter = threeWordsSentence_1Split[2].toUpperCase().substring(0,1);

        String firstWordRest = threeWordsSentence_1Split[0].substring(1);
        String secondWordRest = threeWordsSentence_1Split[1].substring(1);
        String thirdWordRest = threeWordsSentence_1Split[2].substring(1);

        System.out.println("'hApPY nEW yeAr' in Title case is: " + firstWordFirstLetter + firstWordRest
                + " " + secondWordFirstLetter + secondWordRest
                + " " + thirdWordFirstLetter + thirdWordRest);

        String threeWordsSentence_2 =  "Lab sessIONS clAsses";
        String threeWordsSentence_2ToUpperCase = threeWordsSentence_2.toUpperCase().trim();
        String[] sentence_2Split = threeWordsSentence_2ToUpperCase.split(" ");
        System.out.println("Abbreviation of 'Lab sessIONS clAsses' is: " + sentence_2Split[0].substring(0,1)
                + sentence_2Split[1].substring(0,1) + sentence_2Split[2].substring(0,1));

        String sentence_4 = "We all are here to learn good stuff";
        String[] sentence_4ByWords = sentence_4.split(" ");
        int numWords = sentence_4ByWords.length;
        System.out.println("Number of words in the sentence: " + numWords);

    }
}


