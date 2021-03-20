package Class8;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total = 0;
        for (double number : doubleArray) {
            total += number;
        }
        System.out.println("Total of " + Arrays.toString(doubleArray) + " is: " + total);

        System.out.println("\n");

        total = 0;
        for (int i = 0; i <= doubleArray.length - 1; i++) {
            total += doubleArray[i];
        }
        System.out.println("Total of " + Arrays.toString(doubleArray) + " is: " + total);

        System.out.println("\n");

        total = 0;
        int j = 0;
        while (j <= doubleArray.length - 1) {
            total += doubleArray[j];
            j++;
        }
        System.out.println("Total of " + Arrays.toString(doubleArray) + " is: " + total);


        String word = "level";
        String[] letters = word.split("");
        boolean isPalindrome = true;
        for (int i = 0; i <= letters.length - 1; i++) {
            isPalindrome = isPalindrome && letters[i].equalsIgnoreCase(letters[letters.length - (i + 1)]);
        }

        System.out.println("Word " + '"' + word + '"' + " is palindrome: " + isPalindrome);

        int number = 20;
        boolean isPrime = false;
        if (number <= 1) {
            System.out.println(number + " is a prime number: " + isPrime);
        }
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                System.out.println(number + " is a prime number: " + isPrime);
                break;
            } else {
                isPrime = true;
                System.out.println(number + " is a prime number: " + isPrime);
                break;
            }
        }


    }
}


