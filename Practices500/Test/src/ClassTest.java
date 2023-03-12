import java.lang.reflect.Method;
import java.util.Date;

/**
 * JAVA反射机制是在运行状态中，
 * 对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；
 * 这种动态获取的信息以及动态调用对象的法的功能称为java语言的反射机制。
 *
 * Class类对象有三种实例化模式：
 * 1.Class。forName("完成类名待包名")
 * 2.对象.getClass();
 * 3.任何类型.class
 */
public class ClassTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date);

        Class<?> date1 = Class.forName("java.util.Date");
        System.out.println(Date.class);//Data类.class
        System.out.println(date.getClass());//对象.getClass()
        System.out.println(date1);//使用Class类提供的方法:public static Class forName(String className) throws ClassNotFoundException

        System.out.println("-----");
        Object newInstance = date1.newInstance();//Date date = new Date();date == newInstance;
        System.out.println(newInstance);
        System.out.println("------");

        //通过反射机制，获取Class，通过Class来实例化对象
        Class<?> clazz = SingletonTest2.class;

        // //通过getMethods方法获取所有public修饰的普通方法
        Method[] methods = clazz.getMethods();
        for (Method i : methods) {
            System.out.println(i.getName());
        }
        System.out.println("-------");

        //通过getDeclaredMethods返回类中所有的实例方法
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method i : methods1) {
            System.out.println(i.getName());
        }
    }
}
