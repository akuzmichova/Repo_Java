package Class1;

public class Homework2 {
    public static void main(String[] args) {
        byte numDayHours = 24;
        System.out.println("Number of hours in a day: " + numDayHours);
        short maxNumYearDays = 366;
        System.out.println("Max number of days in a year: " + maxNumYearDays);
        int numAmazonEmployees = 575700;
        System.out.println("Total number of employees in Amazon: " + numAmazonEmployees);
        int populationUSA = 328200000;
        System.out.println("Population of the USA: " + populationUSA);
        float mortgageRateChase = 2.625f;
        System.out.println("Chase bank mortgage interest rate: " + mortgageRateChase + "%");
        double balanceBankAcc = 100.25;
        System.out.println("My bank account balance: " + balanceBankAcc + "$");
        boolean isSunRiseFromWest = false;
        System.out.println("Does the sun rise from the west: " + isSunRiseFromWest);
        char myFirstName = 'A';
        char myLastName = 'K';
        System.out.println("Initials of my name: " + myFirstName + myLastName);


        String[] myWords = {"help", "help", "peace", "peace", "peace", "Learn", "happy", "help", "help"};
        int[] counter = new int[myWords.length];
        for (int i = 0; i < myWords.length; i++) {
            for (int j = 0; j < myWords.length; j++) {
                if (myWords[i].equalsIgnoreCase(myWords[j])) {
                    counter[i]++;
                }
            }
        }
        for (int k=0; k<counter.length; k++){
            System.out.println(myWords[k]+" " + counter[k]);
        }

    }
}

/**
 * find the words appearing max number of times
 * if all words are unique, answer should be "All Unique"
 * if one word is appearing max number of times, answer should be that word
 * if two or more words are appearing max number of times, answer should be all those words
 */





