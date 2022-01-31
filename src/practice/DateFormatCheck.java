package practice;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateFormatCheck {

    public static void main(String[] args) throws ParseException {
        String a = "2021-09-12 09:03:34";
        String b = "2021-09-13 01:03:32";
        String c = "2021-08-13 10:46:38";

        if (c==null){
            c = "1970-01-01 00:00:00";
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstParsedDate = dateFormat.parse(a);
        System.out.println("Parsed first date :" +firstParsedDate);
        Date secondParsedDate = dateFormat.parse(b);
        System.out.println("Parsed second date :" +secondParsedDate);
        Date thirdParsedDate = dateFormat.parse(c);
        System.out.println("Parsed third date :" +thirdParsedDate);

        long x = secondParsedDate.getTime() - thirdParsedDate.getTime();
        System.out.println("Value of X:" +x);
        long y = firstParsedDate.getTime() - thirdParsedDate.getTime();
        System.out.println("Value of Y:" +y);
        int z;


        if (x >0 && y>0){

            z = 1;
        }
        else if (x>1 || y>1){

            z = 1;
        }
        else
            z =0;

    System.out.println("Result"+z);


    }


}
