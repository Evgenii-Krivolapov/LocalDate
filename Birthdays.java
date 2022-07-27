package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
    }


    public static String collectBirthdays(int year, int month, int day) {
        String result = "";
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        for (int age = 0; ; age ++) {
            if (!today.isBefore(birthday.plusYears(age))) {
                result = result + age + " - " + formatter.format(birthday.plusYears(age)) + System.lineSeparator();
            } else {
                return result;
            }
        }

    }
}