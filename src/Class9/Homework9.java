package Class9;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        System.out.println(titleCase("   How Are yOU my DeAr   "));
        studentGrade(500, 700);
        int[] myArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reversedArray(myArray)));
        String mySentence = " I wish you good luck ";
        System.out.println("Number of words in the sentence " + '"' + mySentence.trim() + '"' + " is: " + numOfWordsInSentence(mySentence));
    }

    public static String titleCase(String anyCaseSentence) {
        String trimLowerSentence = anyCaseSentence.trim().toLowerCase();
        String[] sentenceSplit = trimLowerSentence.split(" ");
        String titleCaseSentence = "";
        for (int i = 0; i < sentenceSplit.length; i++) {
            String firstWordFirstLetter = sentenceSplit[i].toUpperCase().substring(0, 1);
            String firstWordRest = sentenceSplit[i].substring(1);
            titleCaseSentence += firstWordFirstLetter + firstWordRest + " ";
        }
        String trimTitleCaseSentence = titleCaseSentence.trim();
        return titleCaseSentence;
    }

        public static String studentGrade(double studentScore, double maxScore) {
        String studentGrade = "";
        double studentPercentage = studentScore * 100 / maxScore;
        if (studentPercentage > 90 && studentPercentage <= 100) {
            System.out.println("Your Grade is: A");
        } else if (studentPercentage > 80 && studentPercentage <= 89.99) {
            System.out.println("Your Grade is: B");
        } else if (studentPercentage > 70 && studentPercentage <= 79.99) {
            System.out.println("Your Grade is: C");
        } else if (studentPercentage > 60 && studentPercentage <= 69.99) {
            System.out.println("Your Grade is: D");
        } else if (studentPercentage > 50 && studentPercentage <= 59.99) {
            System.out.println("Your Grade is: E");
        } else if (studentPercentage <= 50 && studentPercentage > 0) {
            System.out.println("Your Grade is: F");
        } else {
            System.out.println("Invalid value of student score");
        }
            return studentGrade;
        }

        public static int[] reversedArray(int[] myArray) {
            int[] myreversedArray = new int[myArray.length];
            for (int i = 0; i < myArray.length; i++) {
                myreversedArray[i] = myArray[myArray.length - 1 - i];
            }
            return myreversedArray;
        }

        public static int numOfWordsInSentence(String mySentence) {
            String[] mySentenceSplit = mySentence.trim().split(" ");
            int mySentenceLength = mySentenceSplit.length;
            return mySentenceLength;
        }


}