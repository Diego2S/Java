import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {

        LocalDate t1 = LocalDate.now();
        LocalDateTime t2 = LocalDateTime.now();

        Instant agora = Instant.now();
        Instant myBDay = Instant.parse("1991-07-02T21:20:00Z");
        Duration idade = Duration.between(myBDay,agora);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Nascimento: " + fmt1.format(myBDay));
        System.out.println("Agora LocalDateTime: " + fmt2.format(t2));
        System.out.println("Agora LocalDateTime: " + fmt3.format(t1));
        System.out.println("Agora: " + fmt1.format(agora));

        System.out.println(String.format("Duracao: %.2f", idade.toDays()/365.25));

    }
}