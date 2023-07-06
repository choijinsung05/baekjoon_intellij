package Bronze5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class q10699 {
    public static void main(String [] args) {
        LocalDate d = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String answer = d.format(formatter);

        System.out.println(answer);
    }
}
