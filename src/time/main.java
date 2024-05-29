package time;

import jdk.nashorn.internal.ir.CallNode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0L);
        System.out.println(date1);

        //simpledateformat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2 = new Date(0L);
        String format = simpleDateFormat.format(date2);
        System.out.println(format);
        String str = "2020/12/12 12:12:12";
        Date date3 = simpleDateFormat.parse(str);
        System.out.println(date3.getTime());

        //日历对象
        Calendar calendar = Calendar.getInstance();
        Date date4 = new Date(0L);
        calendar.setTime(date4);
        System.out.println(calendar);
        int i = calendar.get(Calendar.DATE);
        System.out.println(i);

        Instant now = Instant.now();
        System.out.println(now);

        System.out.println(test(10));
        getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static int test(int n) {
        if (n == 1) {
            return 1;
        }
        return n + test(n - 1);
    }


    public static int getSum(int... args) {
        System.out.println(args);
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
