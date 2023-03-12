/**
 * 单例模式:
 * 懒汉式单例
 */


public class Singleton {

    private Singleton(){};
    private static Singleton singleton = null;

    //懒汉式单例类.在第一次调用的时候实例化自己
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //饿汉式单例类.在类初始化时，已经自行实例化
    //private Singleton(){};
    private static final Singleton singleton2 = new Singleton();
    public static Singleton getInstance3(){
        return singleton2;
    }

    /**
     * 懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例，要实现线程安全，
     * 有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全
     * @return
     */

    //1.在getInstance方法上加同步
    public static synchronized Singleton getInstance1(){
        if(singleton == null){
            singleton  = new Singleton();
        }
        return singleton;
    }

    //2.双重检查锁定
    public static  Singleton getInstance2(){
        if (singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton =new Singleton();
                }
            }
        }
        return singleton;
    }

    //3.静态内部类
    private class LazyHolder{
        private static final Singleton SINGLETON = new Singleton();
        }
        // private Singleton(){};
        public static final Singleton getSingleton(){
            return LazyHolder.SINGLETON;
    }
    /**
     * 懒汉式顾名思义，会延迟加载，在第一次使用该单例的时候才会实例化对象出来，第一次调用时要做初始化，如果要做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
     * 至于1、2、3这三种实现又有些区别，
     *
     * 第1种，在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的，
     *
     * 第2种，在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
     *
     * 第3种，利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗，所以一般我倾向于使用这一种。
     */

}
