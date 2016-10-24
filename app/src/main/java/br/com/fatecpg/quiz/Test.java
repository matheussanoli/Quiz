package br.com.fatecpg.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Alyne on 23/10/2016.
 */

public class Test {
    private int punctuation;
    private String date;
    private String hour;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPunctuation() {return punctuation;}

    public void setPunctuation(int punctuation) {
        this.punctuation = punctuation;
    }

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Date data = new Date();

        Calendar  cal = Calendar.getInstance();
        cal.setTime(data);
        Date data_atual = cal.getTime();

       date = data_atual.toString();

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        SimpleDateFormat dateFormat_hora = new SimpleDateFormat("HH:mm:ss");
        Date data = new Date();

        Calendar  cal = Calendar.getInstance();
        cal.setTime(data);
        Date data_atual = cal.getTime();

        String hora_atual = dateFormat_hora.format(data_atual);
        hour = hora_atual;

        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

}
