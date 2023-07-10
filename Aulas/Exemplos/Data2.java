package Exemplos;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Data2 {
    public static void main(String[] args){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-01-06T15:50:44Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        cal.add(Calendar.HOUR_OF_DAY,4);
        d = cal.getTime();
        System.out.println(sdf.format(d));

        for (int i =0;i<12;i++) {
            int mes = 1 + cal.get(Calendar.MONTH);
            System.out.println(mes);
        }


    }
}