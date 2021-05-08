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

    int[] array = { 3, 5, 1, 4, 2, 7 };
    int foundValue = missingSmallest(array);
    System.out.println(foundValue);

    int[] array2 = { -1, -3, 4, 2 };
    int foundValue2 = missingSmallest(array2);
    System.out.println(foundValue2);

    int[] array3 = { 0, 5, -1, 1, 2, 5, 3, 7, 1, 2 };
    int foundValue3 = missingSmallest(array3);
    System.out.println(foundValue3);

        /**
         * X=7  Y=42  Arr={6, 42, 11, 7, 1, 42}; //Ans -> 4
         * X=6  Y=13  Arr={13, 13, 1, 6}; //Ans -> 0
         * X=100  Y=63  Arr={100, 63, 100, 6, 2}; //Ans -> 1
         * X=10  Y=64  Arr={10, 32, 100, 64, 2, 55, 22}; //Ans -> 6
         */

        int[] ints = {6, 42, 11, 7, 1, 42};
        int x = 7;
        int y = 42;
        int countX = 0;
        int countY = 0;
        int i = 0;
        for (i=0; i<ints.length; i++){
            if (ints[i] == x){
                countX++;
            }
            if (ints[i] == y){
                countY++;
            }
            if (countX>=2 || countY>=2){
                break;
            }
        }
        System.out.println("Harry and Sam: " + (i-1));
    }




    public static int missingSmallest(int[] arr) {
        int check = 1;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == check) {
                check++;
                i = -1;
            }
        }
        return check;

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




