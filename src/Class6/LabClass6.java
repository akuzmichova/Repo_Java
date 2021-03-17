package Class6;

import java.util.Arrays;

public class LabClass6 {
    public static void main(String[] args) {

        int[] myArray = {1, 8, 17, 33, 24};
        int totalAverage = (myArray[0]+myArray[1]+myArray[2]+myArray[3]+myArray[4])/myArray.length;
        System.out.println("Average of " + Arrays.toString(myArray) + " is: " + totalAverage);

        String[] names = {"john", "happy", "peACe", "jOy", "LEarN"};
        String nameToSearch = "Happy";
        int position = 0;
        if (names[0].equalsIgnoreCase(nameToSearch)) {
            System.out.println(position = 1);
        } else if (names[1].equalsIgnoreCase(nameToSearch)) {
            System.out.println(position = 2);
        } else if (names[2].equalsIgnoreCase(nameToSearch)) {
            System.out.println(position = 3);
        } else if (names[3].equalsIgnoreCase(nameToSearch)) {
            System.out.println(position = 4);
        } else if (names[4].equalsIgnoreCase(nameToSearch)) {
            System.out.println(position = 5);
        }
        if (position > 0) {
            System.out.println(nameToSearch + " is present at position " + position);
        } else {
            System.out.println(nameToSearch + " is not present in the array");
        }

        String studentGrade = "d";
        String scholarAmount = "";
        if (studentGrade.equalsIgnoreCase("B") || studentGrade.equalsIgnoreCase("C")) {
            scholarAmount = "half";
        } else if (studentGrade.equalsIgnoreCase("A")){
            scholarAmount = "full";
        } else {
            scholarAmount = "no";
        }
        switch (studentGrade.toUpperCase()) {
            case "A":
                scholarAmount = "full";
                break;
            case "B":
            case "C":
                scholarAmount = "half";
                break;
            default:
                scholarAmount = "no";
        }

        System.out.println("Based on your grade you get " + scholarAmount + " scholarship");

        String[] names1 = {"happy", "peace", "grow", "learn", "sleep", "share", "teach", "smile" };
        for (int i = names.length-1; i>=0; i--) {
            System.out.println(names1[i]);
        }
        System.out.println("\n");

        for (int i = 1; i<= names.length; i++) {
            System.out.println(names[names.length-i]);
        }

        String[] hello = {"Hello", "Hello", "Hello", "Hello", "Hello"};
        for (int i = 0; i<=4; i++) {
            System.out.println(hello[i]);
        }

        System.out.println("\n");
        for (int i = 0; i<=4; i++) {
            System.out.println("Hello");
        }
        System.out.println("\n");

        String[] words = {"happy", "peace", "grow", "learn", "sleep", "share", "teach", "smile" };
        for (int i = 0; i<words.length; i+=2) {
            System.out.println(words[i]);
        }
        System.out.println("\n");
        for (int i = 0; i<=words.length-1; i++) {
            if (i % 2 == 0) {
                System.out.println(words[i]);
            }
        }

        String sentence_2 = "how are you dear";
        String[] sentence2Array = sentence_2.split("");
        int count = 0;
        for (String letter: sentence2Array) {
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("0")
                    ||letter.equalsIgnoreCase("u")) {
                count++;
            }
        }
        System.out.println("\n\nCount: " + count);






    }

}











