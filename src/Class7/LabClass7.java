package Class7;

import java.util.Arrays;

public class LabClass7 {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i <= letters.length - 1; i++) {
            System.out.println("Letter at index-" + i + ": " + letters[i]);
        }
        System.out.println("\n");
        int k = 0;
        while (k < letters.length) {
            System.out.println("Letter at index-" + k + ": " + letters[k]);
            k++;
        }
        System.out.println("\n");
        int l = 0;
        for (char alphabet : letters) {
            System.out.println("Letter at index-" + l + ": " + alphabet);
            l++;
        }

        int[] ssnNumbers = {1111, 2222, 3333, 4444, 5555};

        for (int i = 0; i < ssnNumbers.length; i++) {
            System.out.println(ssnNumbers[i]);
        }
        System.out.println("\n");

        for (int ssn : ssnNumbers) {
            System.out.println(ssn);
        }
        System.out.println("\n");

        int j = 0;
        while (j < ssnNumbers.length) {
            System.out.println(ssnNumbers[j]);
            j++;
        }

        int[] myArray = {11, 44, 22, 66, 44, 76, 85};
        int[] myreversedArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            myreversedArray[i] = myArray[myArray.length - 1 - i];

        }
        System.out.println(Arrays.toString(myreversedArray));

        String paragraph = "Are you searching for Essay Writing Topics in English for various competitions and speeches for school events? Then you are on the right page here you will get all kinds of topics for essay writing in English. As we have gathered numerous essay topics in long and short forms for all classes students. Yes, what you heard is correct, this page is filled with Long essays for class 10, 9, 8, 7, and Short essays for class 6, 5, 4, 3, 2, 1. So, anyone can check out this Essay Writing in English Article on AplusTopper for school events & competitions. Moreover, you can also find 10 lines on the selected far topic in English for the speeches in school programs. These Ten lines in English will assists students and teachers at the time of school speeches on special events. Hence, students can refer to the below provided a massive list of essays in English and participate in any kind of events conducted by schools. For the sake of class 1 to 10 students, we have also covered 10 Lines and Essay on 'My School' in English and Hindi here.";
        String wordToFind = "SCHOOL";
        String[] lowerParagraph = paragraph.toLowerCase().split(" ");
        String lowerWordToFind = wordToFind.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerParagraph.length; i++) {
            if (lowerParagraph[i].contains(lowerWordToFind)) {
                count++;
            }
        }
        System.out.println(count);

        String[] myWords = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};
        wordToFind = "peace";
        int counter = 0;
        for (int k1 = 0; k1 < myWords.length; k1++) {
            if (myWords[k1].equalsIgnoreCase(wordToFind)) {
                counter++;
            }
        }
        System.out.println(counter);






        int j1 = 0;
        int[] indexOfFoundWord = new int[counter];
        for (int h = 0; h<myWords.length; h++) {
            if (myWords[h].equalsIgnoreCase(wordToFind)) {
                indexOfFoundWord[j1] = h;
                j1++;
            }
            }
        System.out.println(Arrays.toString(indexOfFoundWord));


    }
}
