package Assignment3;

import java.text.MessageFormat;
import java.util.Calendar;

public class NextTuesday {
    public static void main(String[] args) {
        
    for (int i = 0; i < 7; i++) {

        Calendar cur = Calendar.getInstance();
        cur.add(Calendar.DAY_OF_MONTH, i);

        Calendar tuesday = Calendar.getInstance();
        tuesday.setTime(cur.getTime());
        tuesday.add(Calendar.DAY_OF_MONTH, (7 + Calendar.TUESDAY - cur.get(Calendar.DAY_OF_WEEK)) % 7);
        
        

        System.out.println(MessageFormat.format("Date {0} -> {1} ", cur.getTime(),  tuesday.getTime()));
    }
}
}
