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


        String myString = "test#string";
        int indexOfHash = myString.indexOf('#');
        System.out.println(indexOfHash);
        String newString1 = myString.substring(0,indexOfHash-1);
        String newString2 = myString.substring(indexOfHash+2);
        String newString = newString1+newString2;
        System.out.println(newString);


    }
}



