package Class6;

import java.text.DecimalFormat;

public class Homework6 {

    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        double studentScore = 496;
        double maxScore = 700;
        double studentPercentage = studentScore * 100 / maxScore;
           if (studentPercentage > 90 && studentPercentage <= 100) {
            System.out.println("Your percentage is: " + df.format(studentPercentage) + " and your Grade is: " + "A");
        } else if (studentPercentage > 80 && studentPercentage <= 89.99){
            System.out.println("Your percentage is: " + df.format(studentPercentage) + " and your Grade is: " + "B");
        } else if (studentPercentage > 70 && studentPercentage <= 79.99){
            System.out.println("Your percentage is: " + df.format(studentPercentage) + " and your Grade is: " + "C");
        } else if (studentPercentage > 60 && studentPercentage <= 69.99){
            System.out.println("Your percentage is: " + df.format(studentPercentage) + " and your Grade is: " + "D");
        } else if (studentPercentage > 50 && studentPercentage <= 59.99){
            System.out.println("Your percentage is: " + df.format(studentPercentage) + " and your Grade is: " + "E");
        } else if (studentPercentage <= 50 && studentPercentage > 0){
            System.out.println("Your percentage is: " + df.format(studentPercentage) + " and your Grade is: " + "F");
        }
        else {
            System.out.println("Invalid value of student score");
        }

        int var = 225;
        if (var%3 == 0 && var%5 == 0){
            System.out.println("Number " + var + " is divisible by both 3 and 5");
        } else if (var%3 == 0){
            System.out.println("Number " + var + " is divisible by 3");
        } else if (var%5 == 0){
            System.out.println("Number " + var + " is divisible by 5");
        }
        else {
            System.out.println("Number " + var + " is not divisible by 3 or 5");
        }

        char carGear = 'd';
        String driveType = "  SnoW ";
        switch (carGear) {
            case 'P':
            case 'p':
                System.out.println("You can park the car");
                break;
            case 'N':
            case 'n':
                System.out.println("Put car in car wash");
                break;
            case 'R':
            case 'r':
                System.out.println("Reverse the car");
                break;
            case 'D':
            case 'd':

                if (carGear == 'D' || carGear == 'd' && driveType.trim().equalsIgnoreCase("snow")) {
                    System.out.println("You are on Snow mode");
                } else if (carGear == 'D' || carGear == 'd' && driveType.trim().equalsIgnoreCase("sport")){
                    System.out.println("You are on Sport mode");
                } else if (carGear == 'D'|| carGear == 'd' && driveType.trim().equalsIgnoreCase ("eco")){
                    System.out.println("You are on Eco mode");
                } else {
                    System.out.println("Invalid Drive Type");
                }
                break;
            default:
                System.out.println("Invalid Car Gear input");
        }




    }
}










