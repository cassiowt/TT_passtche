package app;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TesteDatas {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    static Date dia = new Date();
    static Date hoje = new Date();
    static Date dataQualquer = new Date();

    public static void main(String[] args) {
        try {

            System.out.println(hoje);
            System.out.println(sdf.format(hoje));

            dataQualquer = sdf.parse("0705/1970 00:00:00");
            System.out.println(dataQualquer);
            System.out.println(sdf.format(dataQualquer));


        } catch (ParseException e) {
            System.out.println("Deu um erro na inserção da Data");
            //e.printStackTrace();
        }
    }
}
