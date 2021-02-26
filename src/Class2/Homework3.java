package Class2;

public class Homework3 {
    public static void main(String[] args) {
        double cTemp;
        double fTemp;
        double kTemp;

        cTemp = 30;
        fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C --> " + fTemp + "°F");

        cTemp = 28;
        kTemp = (cTemp + 273.15);
        System.out.println(cTemp + "°C --> " + kTemp + "°K");

        fTemp = 15;
        cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + "°F --> " + cTemp + "°C");

        fTemp = 50;
        kTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp + "°F --> " + kTemp + "°K");

        kTemp = 70;
        fTemp = (kTemp * 9/5 - 459.67);
        System.out.println(kTemp + "°K --> " + fTemp + "°F");

        kTemp = 90;
        cTemp = (kTemp - 273.15);
        System.out.println(kTemp + "°K --> " + cTemp + "°C");

    }
}


