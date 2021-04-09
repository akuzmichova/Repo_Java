package Class12;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {
        int[] initialArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int[] cleanedArray = cleanArray(initialArray, 24);
        System.out.println(Arrays.toString(cleanedArray));

        int[] initialArray2 = {1, 2, 4, 3, 6, 1};
        cleanedArray = cleanArray(initialArray2, 24);
        System.out.println(Arrays.toString(cleanedArray));

        checkSpeed(74);
        checkSpeed(78);
        checkSpeed(88);
        checkSpeed(178);
        checkSpeed(70);

    }

    public static int[] cleanArray(int[] array, int toRemove) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != toRemove) {
                k++;
            }
        }
        int[] cleanedArray = new int[k];
        k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != toRemove) {
                cleanedArray[k] = array[i];
                k++;
            }
        }
        return cleanedArray;
    }


    public static final int speedLimit = 70;

    public static void checkSpeed(int speed) {
        if (speed > speedLimit) {
            int overSpeed = speed - speedLimit;
            int points = overSpeed / 5;
            if (points < 12) {
                System.out.println("User speed is " + speed + "; " + points + " points");
            } else {
                System.out.println("User speed is " + speed + "; " + points + " points (License suspended)");
            }
        } else {
            System.out.println("User speed is " + speed + "; " + "Thank you for driving within the speed limit");
        }
    }


}



