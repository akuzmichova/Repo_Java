package Class14;

import java.util.*;

public class Homework14_newSolution {
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> wordsList = Arrays.asList(words);
        System.out.println(findDuplicateWithCount(wordsList));

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green", "yellow", "yellow", "yellow", "yellow"};

        System.out.println(findColorWithCount(arr));

    }

    public static Map<String, Integer> findDuplicateWithCount(List<String> myList) {
        Map<String, Integer> duplicates = new HashMap<>();

        for (int i = 0; i < myList.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(i).equalsIgnoreCase(myList.get(j))) {
                    count++;
                }
            }
            if (!duplicates.containsKey(myList.get(i).toLowerCase()) && count > 1) {
                duplicates.put(myList.get(i).toLowerCase(), count);
            }
        }
        return duplicates;
    }

    public static List<String> findColorWithCount(String[] colorArray) {
        Map<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < colorArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < colorArray.length; j++) {
                if (colorArray[i].equalsIgnoreCase(colorArray[j])) {
                    count++;
                }
            }
            if (!duplicates.containsKey(colorArray[i].toLowerCase()) && count > 1) {
                duplicates.put(colorArray[i].toLowerCase(), count);
            }
        }
        System.out.println(duplicates);
        Collection<Integer> allValues = duplicates.values();
        int maxColorCount = findMax(allValues);
        List<String> colorWithMaxCount = new ArrayList<>();
        for (String color : duplicates.keySet()) {
            if (duplicates.get(color) == maxColorCount) {
                colorWithMaxCount.add(color);
            }
        }
        return colorWithMaxCount;
    }

    public static int findMax(Collection<Integer> myCollection) {
        Object[] valuesObject = myCollection.toArray();
        Object maxValue = valuesObject[0];
        System.out.println(maxValue);
        for (int i=1; i<valuesObject.length; i++) {
            if (Integer.valueOf(maxValue.toString()) < Integer.valueOf(valuesObject[i].toString())) {
                maxValue = valuesObject[i];
            }
        }
        return Integer.valueOf(maxValue.toString());
    }


}