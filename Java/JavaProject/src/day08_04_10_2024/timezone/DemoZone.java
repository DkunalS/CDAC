package day08_04_10_2024.timezone;

import java.time.*;
import java.util.Locale;
import java.util.Set;

public class DemoZone
{
    public static void main(String[] args) {
        Set<String> zoneids = ZoneId.getAvailableZoneIds();
        System.out.println(zoneids);

        // Asia/Calcutta
        // America/Los_Angeles
        LocalDateTime indialocal = LocalDateTime.now();
        System.out.println(indialocal);

        ZonedDateTime ist = indialocal.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println(ist);

        Instant instant = ist.toInstant();
        ZonedDateTime la = instant.atZone((ZoneId.of("America/Los_Angeles")));
        System.out.println(la.toLocalDateTime());


    }
}
