package Class4;

import java.util.Locale;

public class Lab {
    public static void main(String[] args) {
        String myName = "Aksana";
        String validOrInvalid = myName.length() > 10 ? "valid" : "invalid";
        System.out.println(validOrInvalid);
        int lastIndex = myName.length() - 1;
        char myChar = myName.length() > 5 ? myName.charAt(0) :
                myName.charAt(lastIndex);
        System.out.println(myChar);

        String myLetter = myName.length() > 5 ? myName.substring(0,1) :
                myName.substring(myName.length()-1);
        System.out.println(myLetter);
        String myFirstName = " aksana";
        String pureName = myFirstName.trim();
        String firstLetter = pureName.substring(0,1);
        String capitalLetter = firstLetter.toUpperCase();
        String endOfName = pureName.substring(1);
        String myFullNameLength = capitalLetter + endOfName;
        int mumOfLetters = myFullNameLength.length();
        System.out.println(capitalLetter + endOfName);
        System.out.println(mumOfLetters);

        String sentence_1 = "Happy peace Grow";
        String sentenceLower = sentence_1.toLowerCase();
        boolean containsVowel = sentenceLower.contains ("a") ||
                sentenceLower.contains ("e") ||
                sentenceLower.contains ("i") ||
                sentenceLower.contains ("o") ||
                sentenceLower.contains ("u");

        int result = containsVowel ? sentenceLower.indexOf("a"): sentenceLower.indexOf("z");
        System.out.println(result);


    }
}
