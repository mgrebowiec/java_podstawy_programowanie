package pl.sda.mg.zadanie17;

import pl.sda.mg.util.InUtil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysCounter {
    public static void main(String[] args) {
        LocalDate usersDate = InUtil.getDateFromUser();
        System.out.println("Ilosc dni: " + Math.abs(ChronoUnit.DAYS.between(usersDate, LocalDate.now())));
    }


}
