import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDemo {

    public static void main(String[] args) {
        // Define the required time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        // Get the current time in each time zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
        ZonedDateTime istTime = ZonedDateTime.now(istZone);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

        // Define a formatter for displaying the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display the current time in each time zone
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("GMT (Greenwich Mean Time): " + gmtTime.format(formatter));
        System.out.println("IST (Indian Standard Time): " + istTime.format(formatter));
        System.out.println("PST (Pacific Standard Time): " + pstTime.format(formatter));
    }
}
