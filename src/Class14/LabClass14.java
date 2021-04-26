package Class14;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.*;

public class LabClass14 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101, "happy");
        myMap.put(10, "job");
        myMap.put(908, "learn");
        myMap.put(1111, "grow");
        myMap.put(76, "HappY");

        Integer checkKey = 76;
        if (myMap.containsKey(checkKey)) {
            if (myMap.get(checkKey).length() > 4) {
                System.out.println(myMap.get(checkKey));
            } else {
                System.out.println("value not greater than 4");
            }
        } else {
            System.out.println("key not available");
        }


        for (Integer key : myMap.keySet()) {
            if (myMap.containsKey(key)) {
                if (myMap.get(key).length() > 4) {
                    System.out.println(key);
                }
            }
        }

        Map<String, Integer[]> scores = new HashMap<>();
        Integer[] studentScores = {90, 89, 76, 89, 100};
        scores.put("john", studentScores);
        System.out.println(scores);


        Map<String, List<Integer>> scores2 = new HashMap<>();

        Integer[] studentArrayJohn = {90, 89, 76, 89, 100};
        List<Integer> studentScoresJohn = Arrays.asList(studentArrayJohn);
        scores2.put("john", studentScoresJohn);

        Integer[] studentArrayHarry = {70, 89, 76, 89, 100};
        List<Integer> studentScoresHarry = Arrays.asList(studentArrayHarry);
        scores2.put("harry", studentScoresHarry);

        Integer[] studentArrayReene = {90, 77, 98, 98, 100};
        List<Integer> studentScoreReene = Arrays.asList(studentArrayReene);
        scores2.put("reene", studentScoreReene);

        Integer[] studentArrayDomino = {90, 89, 100, 89, 100};
        List<Integer> studentScoresDomino = Arrays.asList(studentArrayDomino);
        scores2.put("domino", studentScoresDomino);

        Integer[] studentArrayJoy = {89, 89, 77, 89, 98};
        List<Integer> studentScoresJoy = Arrays.asList(studentArrayJoy);
        scores2.put("joy", studentScoresJoy);

        System.out.println(scores2);


        Collection<String> studentNames = scores2.keySet();
        Map<String, Integer> totalScore = new HashMap<>();

        for (String studentName : studentNames) {
            List<Integer> studentScore = scores2.get(studentName);
            int total = 0;
            for (Integer score : studentScore) {
                total+=score;
            }
            totalScore.put(studentName, total);
        }
        System.out.println(totalScore);

        int maxScore = 0;
        String topper = "";
        for (String studentName : studentNames) {
            if (totalScore.get(studentName) > maxScore) {
                topper = studentName;
                maxScore = totalScore.get(studentName);
            }
        }
        System.out.println("Topper : " + topper);
        System.out.println("Max Score : " + maxScore);



        Collection<Integer> totalScores = totalScore.values();
        for (Integer score : totalScores) {

        }


        /**
         * Student name: john
         * Student Score: 90, 89, 76, 89, 100
         *
         * Student name: harry
         * Student Score: 70, 89, 76, 89, 100
         *
         * Student name: reene
         * Student Score: 90, 77, 98, 98, 100
         *
         * Student name: domino
         * Student Score: 90, 89, 100, 89, 100
         *
         * Student name: joy
         * Student Score: 89, 89, 77, 89, 98
         *
         * Store the data in a appropriate variable.
         *
         */


    }
}
