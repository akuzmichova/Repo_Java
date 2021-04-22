package Class13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabClass13 {
    public static void main(String[] args) {
        String[] words = {"happy", "peaceful", "nice", "world", "begin", "learn"};
        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            wordsList.add(words[i]);
        }

        for (String word : words) {
            wordsList.add(word);
        }

        List<String> wordsList3 = Arrays.asList(words);
        System.out.println("wordList3 -->" + wordsList3);


        List<String> names = new ArrayList<>();
        names.add("hApPY");     // ["hApPY"]
        names.add("peace");     // ["hApPY", "peace"]
        names.add("joy");       // ["hApPY", "peace", "joy"]
        names.add("grow");      // ["hApPY", "peace", "joy", "grow"]
        names.add("peace");     // ["hApPY", "peace", "joy", "grow", "peace"]
        names.add("LearN");     // ["hApPY", "peace", "joy", "grow", "peace", "LearN"]
        names.add("joy");
        names.add("peace");
        names.add("happy");
        names.add("joy");
        names.add("world");
        System.out.println("names --> " + names);   // names --> [hApPY, peace, joy, grow, peace, LearN, joy, peace, happy, joy, world]


        int indexOfgrow = names.indexOf("grow");
        int lastIndexOfgrow = names.lastIndexOf("grow");
        if (indexOfgrow == lastIndexOfgrow) {
            System.out.println("Grow is appearing only once");
        } else {
            System.out.println("Grow is appearing more than one time");
        }

        int growCount = 0;
        for (int i=0; i<names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("grow")) {
                growCount++;
            }
        }
        if (growCount == 1) {
            System.out.println("Grow is appearing only once");
        } else if (growCount >1) {
            System.out.println("Grow is appearing more than one time");
        } else {
            System.out.println("Grow is not present in the given list");
        }


    }
}
