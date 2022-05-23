import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        Date date = Date.from(dateTime.atZone(ZoneId.systemDefault())
                .toInstant());
        date.setYear(date.getYear() - 10);
        System.out.println(date);
    }
}
