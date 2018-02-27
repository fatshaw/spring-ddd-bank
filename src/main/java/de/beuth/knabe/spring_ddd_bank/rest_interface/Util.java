package de.beuth.knabe.spring_ddd_bank.rest_interface;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Util {

    /**
     * Formats a LocalDate in china as 1999-01-01.
     */
    static final DateTimeFormatter MEDIUM_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

}
