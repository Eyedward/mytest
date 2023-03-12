import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class APITest {
    public static void main(String[] args) throws ParseException {
        String property = System.getProperty("os.name");
        System.out.println("当前系统:"+property);

        Set<String> set = new HashSet<String>();
        set.add("Windows 10");
        set.add("Windows XP");
        set.add("Windows 7");
        if (set.contains(property)){
            System.out.println("系统支持");
        }else
            System.out.println("系统不支持");
        System.out.println("--------");

        Random r = new Random();
        for(int x=0; x<10; x++) {
        //double d = Math.floor(Math.random()*10+1);
        //int d = (int)(Math.random()*10+1);
            int d = r.nextInt(10)+1;
            System.out.println(d);
        }
        System.out.println("-------");

        //String str_time = "2023/3/7";
        //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        //Date date = df.parse(str_time);
        //System.out.println(date);

        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        //DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String str_time = df.format(date);
        System.out.println(str_time);

        System.out.println("-------");

        df = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");
        String str_time2 = df.format(date);
        System.out.println(str_time2);
    }
}
