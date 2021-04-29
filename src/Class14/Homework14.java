package Class14;

import java.util.*;

public class Homework14 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy");
        Homework14 hw14 = new Homework14();
        System.out.println(hw14.duplicatesWithCount(words));

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        System.out.println("Color with maximum count: " + hw14.countColors(arr));

        Map<Integer, String> intStringMap = new HashMap<>();
        intStringMap.put(101, "happy");
        intStringMap.put(102, "peace");
        intStringMap.put(103, "Happy");
        intStringMap.put(104, "learn");
        intStringMap.put(105, "PEaCe");
        intStringMap.put(106, "HAPPY");

        hw14.toPrintKeyWithSameValue(intStringMap);

        Map<Integer, String> intStringMap1 = new HashMap<>();
        intStringMap1.put(111, "happy");
        intStringMap1.put(98, "peace");
        intStringMap1.put(10, "LAugh");
        intStringMap1.put(55, "learn");
        intStringMap1.put(101, "Grow");

        hw14.toPrintKeyWithSameValue(intStringMap1);
    }

    public Map<String, Integer> duplicatesWithCount(List<String> words) {
        Map<String, Integer> myMap = new HashMap<>();
        for (String word : words) {
            if (myMap.containsKey(word)) {
                myMap.put(word, myMap.get(word) + 1);
            } else {
                myMap.put(word, 1);
            }
        }
        Map<String, Integer> duplicates = new HashMap<>();
        Set<String> wordSet = myMap.keySet();
        for (String duplicate : wordSet) {
            int count = myMap.get(duplicate);
            if (count >= 2) {
                duplicates.put(duplicate, count);
            }
        }
        return duplicates;
    }

    public String countColors(String[] arr) {
        Map<String, Integer> colorMap = new HashMap<>();
        for (String color : arr) {
            if (colorMap.containsKey(color)) {
                colorMap.put(color, colorMap.get(color) + 1);
            } else {
                colorMap.put(color, 1);
            }
        }
        Collection<String> colors = colorMap.keySet();
        int maxValue = 0;
        String maxColor = "";
        for (String color : colors) {
            if (colorMap.get(color) > maxValue) {
                maxColor = color;
                maxValue = colorMap.get(color);
            }
        }
        return maxColor;
    }

    public void toPrintKeyWithSameValue( Map<Integer, String> intStringMap) {
        Map<String, Set<Integer>> colorCount = new HashMap<>();
        for (Integer number : intStringMap.keySet()) {
            String color = intStringMap.get(number).toLowerCase();

            if (colorCount.get(color) != null) {
                colorCount.get(color).add(number);
            } else {
                Set<Integer> numbers = new HashSet<Integer>();
                numbers.add(number);
                colorCount.put(color, numbers);
            }
        }
        for (String currentColor : colorCount.keySet()) {
            Set<Integer> numbers = colorCount.get(currentColor);
            if (numbers.size() > 1) {
                System.out.println(currentColor + ":" + numbers);

            }
        }

    }

}

/**
 * Question 2:
 * <p>
 * Create method that will print the keys with same value, else "All keys have different values"
 * <p>
 * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
 * Output (print) ->
 * "happy" with keys -> 101, 103, 106
 * "peace" with keys -> 102, 105
 * <p>
 * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
 * Output (print) ->
 * All keys have different values
 */


/**
 * Question 3:
 * Create a method that will take String-array as input
 *
 * If there is a color with maximum count, return the color name
 * If there are two or more colors with same number, return all.
 */

