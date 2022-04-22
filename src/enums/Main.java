package enums;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // exemplo 1
        LocalDate date = LocalDate.of(2022, Month.MARCH, 24);
        DayOfWeek dayOfWeek = DayOfWeek.THURSDAY;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(date.format(dateTimeFormatter));
        System.out.println(dayOfWeek);


    }

}
