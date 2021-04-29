package Class15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LabClass15 {
    public static void main(String[] args) {

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        String currDate = sdf.format(now);
        int currDateInt = Integer.valueOf(currDate);
        if (currDateInt <= 15) {
            System.out.println("In first half");
        } else {
            System.out.println("In second half");
        }

        Date convertedDate = null;
        String dateText = "April 02 2021, 19:00:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd yyyy, HH:mm:ss");

        try {
            convertedDate = sdf2.parse(dateText);
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Converted Date --> " + convertedDate);

        System.out.println("now Date --> " + now);



        // is now equal to convertedDate
        boolean isNowEqualsConvertedDate = now.equals(convertedDate);
        System.out.println("Is now equals to convertedDate : " + isNowEqualsConvertedDate);

        // is now come after convertedDate
        boolean isNowAfterConvertedDate = now.after(convertedDate);
        System.out.println("Is now comes after convertedDate : " + isNowAfterConvertedDate);

        // is now come before convertedDate
        boolean isNowBeforeConvertedDate = now.before(convertedDate);
        System.out.println("Is now comes before convertedDate : " + isNowBeforeConvertedDate);

        /**
         * Print the current time as 9:22 PM
         * but you cannot create Date object
         */

        Calendar currentCalendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("h:mm a");
        String formattedCurrentTime = df.format(currentCalendar.getTime());
        System.out.println(formattedCurrentTime);

    }

}