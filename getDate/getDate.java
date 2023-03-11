import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class getDate {

    public static void main(String[] args) {
        
        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeformat.format(currentDate));

        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateformat.format(currentDate));
        
    }
    
}
