package Class8;

public class LabClass8 {
    public static void main(String[] args) {
        System.out.println(divide2IntNumbers(20, 10));
        System.out.println(greetUserByFirstName("Happy"));
        System.out.println("\n");
        String greeting = greetUserByFirstName("Happy");
        System.out.println(greeting);
        System.out.println("\n");
        greetUserByFirstName1("Aksana");
        System.out.println("\n");
        greetUserByFirstName("");
    }

    public static double divide2IntNumbers(int num1, double num2) {
        double result = 0.0;
        if (num2 != 0) {
            result = num1 / num2;
        }
        return result;
    }

    public static String greetUserByFirstName(String fName) {
        String greeting = "";
        if (fName.trim().length() == 0) {
            greeting = "Hello User";
        } else {
            fName = fName.toLowerCase().trim();
            fName = fName.substring(0, 1).toUpperCase() + fName.substring(1);
            greeting = "Hello " + fName;
        }
        return greeting;
    }

    public static void greetUserByFirstName1 (String fName) {
        System.out.println("Hello " + fName);

    }
}


