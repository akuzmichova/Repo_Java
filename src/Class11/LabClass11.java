package Class11;

import Class9.LabClass9;

import java.util.Arrays;

public class LabClass11 {
    public static void main(String[] args) {

        LabClass11 lc11 = new LabClass11();
        lc11.removeHash("test#string#more#");
        System.out.println("\n");
        int[] arr = {20, 10, 44, 40};
        int[] array1 = lc11.sortArray(arr);
        System.out.println(Arrays.toString(array1));

        int[] studentScores = {90, 89, 91, 97};
        String[] studentNames = {"happy", "happiness", "joy", "give"};
        lc11.maxMarkStudent(studentNames, studentScores);
    }

        // String s = "test#string#andmore";
        // String s1 = s.substring(s.indexOf("#")-1,s.indexOf("#")+2);
        public void removeHash (String myString){
            String[] splitByHash = myString.split("#");
            String[] stringNoHash = new String[splitByHash.length];
            String noFirstLastLetter = "";
            for (int i = 0; i < splitByHash.length; i++) {
                int wordLength = splitByHash[i].length();
                noFirstLastLetter = splitByHash[i].substring(1, wordLength - 1);
                System.out.print(noFirstLastLetter);
            }
            // String[] splitByLetter = myString.split("");
            // System.out.println(splitByLetter[splitByLetter.length-1]);

        }
        public static int[] sortArray ( int arr[]){
            for (int i = 1; i < arr.length; i++) {
                int j = i;
                int a = arr[i];
                while ((j > 0) && arr[j - 1] > a) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = a;
            }
            return arr;
        }

        public void maxMarkStudent (String[]studentNames,int[] studentScores){
            int maxScore = studentScores[0];
            int b1 = 0;
            for (int k = 0; k < studentScores.length; k++) {
                if (studentScores[k] > maxScore) {
                    maxScore = studentScores[k];
                    b1 = k;
                }
            }
            System.out.println("Student name who scored max marks: " + studentNames[b1]);
        }


    }





/**
 *int[] arr = {20, 10, 44, 40};
 *         for (int i = 0; i<arr.length; i++) {
 *             for (int j = i + 1; j < arr.length; j++) {
 *                 int tmp = 0;
 *                 if (arr[i] > arr[j]) {
 *                     tmp = arr[i];
 *                     arr[i] = arr[j];
 *                     arr[j] = tmp;
 *                 }
 *             }
 *             System.out.println(arr[i]);
 *
 * String s = "the text=text";
 * String s1 = s.substring(s.indexOf("=")+1);
 *
 *
 *  int indexOfHash = myString.indexOf('#');
 *         System.out.println(indexOfHash);
 *         String newString1 = myString.substring(0,indexOfHash-1);
 *         String newString2 = myString.substring(indexOfHash+2);
 *         String newString = newString1+newString2;
 *         System.out.println(newString);


 */

