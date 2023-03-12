import java.time.LocalDate;
import java.util.Calendar;

/**
 * 日历类 : java.util.Calendar
 * 日历字段 : 组成日历的每个部分,都称为日历字段 : 年,月,日,时分秒,星期
 * Calendar抽象类,不能建立对象,子类继承 : GregorianCalendar (格林威治)
 *
 * 由于创建日历对象的过程非常的繁琐,考虑语言,时区... Sun公司工程师开发了一简单获取对象的方式,不要自己new
 * Calendar类定义了静态方法 : static Calendar getInstance() 返回的是Calendar 的子类的对象 GregorianCalendar

 */
public class CalendarTest {

    /**
     * Calendar类的方法get()
     * 获取日历字段
     */
    public static void calendarGet(Calendar calendar){
        //Calendar calendar =  Calendar.getInstance();//返回子类对象
       /* int year = calendar.get(Calendar.YEAR);
        System.out.println(year);*/
        System.out.println( calendar.get(Calendar.YEAR)+"年" + (calendar.get(Calendar.MONTH) +1)+"月" +
                calendar.get(Calendar.DAY_OF_MONTH)+"日" + calendar.get(Calendar.HOUR_OF_DAY)+"点" +
                calendar.get(Calendar.MINUTE)+"分"+calendar.get(Calendar.SECOND)+"秒");
    }

    /**
     * Calendar类的方法set()
     * 设置日历字段
     */
    public static void calendarSet(){
        Calendar calendar = Calendar.getInstance() ; //和操作系统时间一样
        //自己设置日历,传递了年月日
        //calendar.set(2021,5,30);

        //设置某一个字段
        calendar.set(Calendar.DAY_OF_MONTH,30);
        //调用calendarGet,输出日历
        calendarGet(calendar);
    }

    /**
     * Calendar类的方法add()
     * 设置日历字段的偏移量
     */
    public static void calendarAdd(){
        Calendar calendar = Calendar.getInstance() ; //和操作系统时间一样
        //日历向后,偏移180天
        calendar.add(Calendar.DAY_OF_MONTH,180);
        calendarGet(calendar);
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println("------");

        System.out.println( calendar.get(Calendar.YEAR)+"年" + (calendar.get(Calendar.MONTH) +1)+"月" +
                calendar.get(Calendar.DAY_OF_MONTH)+"日" + calendar.get(Calendar.HOUR_OF_DAY)+"点" +
                calendar.get(Calendar.MINUTE)+"分"+calendar.get(Calendar.SECOND)+"秒");

        /**
         * JDK8新的时间日期对象
         * LocalDate 本地日期
         *
         * static LocalDate now() 获取LocalDate的对象,跟随操作系统
         * static LocalDate of() 获取LocalDate的对象,自己设置日期
         * of方法中传递年月日 of(int year,int month,int day)
         *
         */

        //获取LocalDate的对象,跟随操作系统
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //静态方法of()设置日期
        LocalDate of =  LocalDate.of(2022,5,10);
        System.out.println("of = " + of);
    }
}
