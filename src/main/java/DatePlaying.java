import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePlaying {

    public boolean isLeapCurrentYear(){
        boolean leap = false;
        Date date = new Date(2020,4,20);
        //Date date = new Date(2020,4,20);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy");
        String s = ft.format(date);
        int year = Integer.parseInt(s);
        if ((year % 4) > 0 ) {
            System.out.println("is not a leap year");
            leap = false;
        }else{

            leap = true;
        }
        System.out.println(leap);
        return leap;
    }

    public static void printYYYYMMDDFormat(){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E YYYY.MM.dd hh:mm");
        String da = ft.format(date);
        System.out.println("formated date: " + "\n" + da);
        System.out.println();
        System.out.println("Play with Dates");
        String s = date.toString();
        s = s.toLowerCase();
        System.out.println(s);

    }

    public static void printNameOfDay(){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("EEEE");
        String day = ft.format(date);
        System.out.println(day);
    }

    public void countDaysOrYears(int minutes){
        int year;
        int day = minutes/1440;
        if (isLeapCurrentYear() == true) {
             year = minutes / 527040;
        }else{
            year = minutes/525600;


      }
        System.out.println("years: " + year + "\n" + "days: " + day);
    }

    public static void main(String[] args) {
        DatePlaying datePlaying = new DatePlaying();
        datePlaying.isLeapCurrentYear();
        System.out.println("-----------YYYY MM DD format");
        printYYYYMMDDFormat();
        System.out.println("-------------Leap-------------------");
        System.out.println();
        System.out.println("---------Name of Current Day-------------------------");
        printNameOfDay();
        datePlaying.countDaysOrYears(527040);

    }











}
