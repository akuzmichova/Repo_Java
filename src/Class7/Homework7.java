package Class7;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        String sentence_1 =  "  hApPY nEW yeAr is here     ";
        String trimSentence_1 = sentence_1.trim();
        String sentence_1ToLowerCase = trimSentence_1.toLowerCase();
        String[] sentence_1Split = sentence_1ToLowerCase.split(" ");
        String titleCaseSentence = "";
        for (int i = 0 ; i < sentence_1Split.length ; i++) {
            String firstWordFirstLetter = sentence_1Split[i].toUpperCase().substring(0, 1);
            String firstWordRest = sentence_1Split[i].substring(1);
            titleCaseSentence += firstWordFirstLetter + firstWordRest + " ";
        }
        System.out.println('"' + trimSentence_1 + '"' + " in Title case is: " + titleCaseSentence);

        String sentence_2 =  " Lab sessIONS clAsses oN SatUrdays   ";
        String trimSentence_2 = sentence_2.trim();
        String sentence_2ToUpperCase = sentence_2.toUpperCase().trim();
        String[] sentence_2Split = sentence_2ToUpperCase.split(" ");
        String abbrSentence = "";
        for (int i = 0 ; i<sentence_2Split.length ; i++) {
            abbrSentence += sentence_2Split[i].substring(0,1);
        }
        System.out.println("Abbreviation of " + '"' + trimSentence_2 + '"' + " is: " + abbrSentence);

        String sentence3 = "happy holidays";
        System.out.println("sentence3: " + sentence3);
        String reverseSentence3 = "";
        String[] splitSentence3 = sentence3.split("");
        for (int i = splitSentence3.length-1; i>=0; i--) {
            reverseSentence3 += splitSentence3[i];
          }
        System.out.println("Reverse sentence3: " + reverseSentence3);




    }
}


