package Class13;

import Class9.Homework9;

import java.util.*;

public class Homework13 {

    public static void main(String[] args) {
        Homework13 hw13 = new Homework13();
        String[] words = {"happy", "peace", "grow", "joy", "laugh"};
        hw13.isDuplicatePresent(words);

        String[] words1 = {"happy", "peace", "peace", "grow", "peace", "joy", "laugh", "new"};
        hw13.isDuplicatePresent1(words1);

        String[] words2 = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"}; //happy, joy, laugh
        HashSet<String> repeatedWords = hw13.repeatedWords(words2);
        System.out.println("Repeated words are: " + repeatedWords);

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        String maxColor = hw13.colorMaxCount(arr);
        System.out.println("Color with maximum count is: " + maxColor);

    }

    public void isDuplicatePresent(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Duplicates present in the array");
        } else {
            System.out.println("There are no duplicates in the array");
        }
    }

    public void isDuplicatePresent1(String[] words2) {
        Set<String> mySet = new HashSet<>();
        for (String word : words2) {
            if (mySet.add(word) == false) {
                System.out.println("Duplicates present in the array!!!");
                break;
            }
        }
    }

    public HashSet<String> repeatedWords(String[] words2) {
        HashSet<String> myHashSet1 = new HashSet<>();
        HashSet<String> myHashSet2 = new HashSet<>();
        for (String word : words2) {
            if (myHashSet1.add(word) == false) {
                myHashSet2.add(word);
            }
        }
        return myHashSet2;
    }

    public String colorMaxCount(String[] arr) {
        String resultWord = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    resultWord = arr[i];
                }
            }
        }
            return resultWord;

    }

}


        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
