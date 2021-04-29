package Class15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework15 {
    public static void main(String[] args) {
        Homework15 hw15 = new Homework15();
        System.out.println(hw15.generateTimeline(5));
        System.out.println(hw15.generateTimeline(10));
    }

    public String generateTimeline(int amountOfOutput) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        String currHour = sdf.format(now);

        Calendar currentCalendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("ha");

        String theRestTimeline = "";
        for (int i = 0; i < amountOfOutput - 1; i++) {
            currentCalendar.add(Calendar.HOUR, 2);
            String formattedCurrentTime = df.format(currentCalendar.getTime());
            theRestTimeline += formattedCurrentTime + " ";
        }
        String timeline = currHour + " " + theRestTimeline;
        return timeline;

    }
}


