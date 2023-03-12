import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throw和throws的区别？
 * 1、throw代表动作,表示抛出一个异常的动作; throws代表一种状态,代表方法可能有异常抛出。
 * 2、throw用在方法实现中,而throws用在方法声明中。
 * 3、throw只能用于抛出一种异常,而throws可以抛出多个异常。
 */
public class ThrowsDemo {
    public static void main(String[] args) throws ParseException {
        method();
        String str = "2020/10/11";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = dateFormat.parse(str);
        System.out.println(date);
    }

    public static void method() {
        int a = 50;
        int b = 0;
        if (b == 0) {
            //抛出运行时异常对象，并填写异常信息
            throw new RuntimeException("除数不能为0");
        } else {
            System.out.println(a / b);
        }
    }
}
