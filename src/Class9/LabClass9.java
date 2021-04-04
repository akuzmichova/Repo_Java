package Class9;

import java.util.Arrays;
/*
    1. count the names with max length
    2. create String[] with the count value
    3. store all names in step-2 String[] where nameLength is equal to maxLength
     */
public class LabClass9 {
    public String[] getNameMaxLength(String[] names) {
        int count = 1, nameWithMaxLength = names[0].length();
        for (int i = 1; i < names.length; i++) {
            int len = names[i].length();
            if (len == nameWithMaxLength) {
                count++;
            } else if (len > nameWithMaxLength) {
                count = 1;
                nameWithMaxLength = len;
            }
        }
        //System.out.println("Count " + count);

        String[] longestNames = new String[count];
        int j = 0;
        for (String name : names) {
            if (name.length() == nameWithMaxLength) {
                longestNames[j] = Homework9.toTitleCase(name);
                j++;
            }
        }
        //System.out.println(Arrays.toString(longestNames));
        return longestNames;
    }

    public String[] commonWordsInArrays(String[] arr1, String[] arr2) {
        int count1 = 0;
        String[] commonWords = new String[arr1.length];
        for (int t = 0; t < arr1.length; t++) {
            for (int p = 0; p < arr2.length; p++) {
                if (arr1[t].equalsIgnoreCase(arr2[p])) {
                    count1++;
                    commonWords[t] = arr1[t];
                }
            }
        }
        String[] onlyCommonWords = new String[count1];
        int b = 0;
        for (String sameWord : commonWords) {
            if (sameWord != null) {
                onlyCommonWords[b] = sameWord;
                b++;
            }
        }
        return onlyCommonWords;
        }

    /*
    1. create int[]
    2. store names length in int[]
    3. find max in int[]
    4. count the String with length equal to maxlength
    5. use count to create String []
     */

    public static String[] getNameMaxLength2(String[] names) {
        int[] lengthOfNames = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            lengthOfNames[i] = names[i].length();
        }
        //System.out.println(Arrays.toString(lengthOfNames));
        int maxLength = getMaxValue(lengthOfNames);
        //System.out.println("Max Lenhyh --> " + maxLength);
        int count = 0;
        for (String name : names) {
            if (name.length() == maxLength) {
                count++;
            }
        }
        //System.out.println("Counter --> " + count);
        String[] longestNames = new String[count];
        int j = 0;
        for (String name : names) {
            if (name.length() == maxLength) {
                longestNames[j] = Homework9.toTitleCase(name);
                j++;
            }
        }
        //System.out.println(Arrays.toString(longestNames));
        return longestNames;
    }

        public static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i=1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
        }

        public int findMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int findMax : numbers) {
            if (max<findMax){
                max=findMax;
            }
        }
        return max;
        }

        public String[] countRepeated (String[] words, String wordToFind) {
        int count = 0;
        String [] resultWords = null;
        for (String word : words) {
            if (word.toLowerCase().contains(wordToFind.toLowerCase())) {
                count++;
            }
        }
        if (count > 0) {
            resultWords = new String[count];
            int j1 = 0;
            for (String word : words) {
                if (word.toLowerCase().contains(wordToFind.toLowerCase())) {
                    resultWords[j1] = Homework9.toTitleCase(word);
                    j1++;
                }
            }
        } else {
            resultWords = new String[1];
            resultWords[0] = "none";
        }
        return resultWords;
        }
    /*
     * In given array, find the names with length greater than user given length
     * name: findNamesByLength
     * inputs: String[], int
     * return type: String[]
     */

        public String[] findNameByLength(String[] names, int shouldBeGreaterThan) {
        int count = 0;
        for (int i=0; i< names.length; i++) {
            if (names[i].length() > shouldBeGreaterThan) {
                count++;
            }
        }
        //System.out.println("Count --> " + count);
        String[] resultNames = new String[count];
        int j2=0;
        for (String name : names) {
            if (name.length() > shouldBeGreaterThan) {
                resultNames[j2] = name;
                j2++;
            }
        }
            //System.out.println(Arrays.toString(resultNames));
            return resultNames;
        }


        public static void main(String[] args) {
        LabClass9 lb9 = new LabClass9();
        String[] allNames = {"pEace", "happiness", "GivEs", "So", "aaa"};

        String[] resultNames = lb9.getNameMaxLength(allNames);
        System.out.println(Arrays.toString(resultNames));

        String[] resultNames2 = getNameMaxLength2(allNames);
        System.out.println(Arrays.toString(resultNames2));

        String[] myWords = {"happy", "and", "another", "HappyMan", "greatdaytoday", "good day"};
        String wordToContain = "day";
        String[] result =  lb9.countRepeated(myWords, wordToContain);
        System.out.println("Names which contain " + wordToContain + "-->" +
                Arrays.toString(result));
        int len1 = 10;
        String[] result2 = lb9.findNameByLength(myWords, len1);
        System.out.println("Names with length greater than " + len1 + "-->" +
                Arrays.toString(result2));


        String[] arr1 = {"Ted", "John", "Ron", "Mary", "Bob", "Gas"};
        String[] arr2 = {"Tom", "Gas", "Mary", "Paul", "John", "Ted"};

        String[] onlyCommonWords = lb9.commonWordsInArrays(arr1, arr2);
        System.out.println("Common words are: " + Arrays.toString(onlyCommonWords));

    }
}



/**
 * find the words appearing max number of times
 * if all words are unique, answer should be "All Unique"
 * if one word is appearing max number of times, answer should be that word
 * if two or more words are appearing max number of times, answer should be all those words
 * input: String[]
 * return type: String[]
 * */


