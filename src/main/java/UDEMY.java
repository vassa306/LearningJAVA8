import java.text.SimpleDateFormat;
import java.util.Date;

public class UDEMY {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.mm.dd hh:mm");
        String da = ft.format(date);
        System.out.println("formated date: " + "\n" + da);
        System.out.println();
        System.out.println("Play with Dates");
        String s = date.toString();
        s = s.toLowerCase();
        System.out.println(s);
    }





}
