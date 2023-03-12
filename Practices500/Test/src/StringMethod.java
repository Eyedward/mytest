public class StringMethod {
    /**
     * 1.在Java中，基本数据类型 == 比较的是值；对象类型 == 比较的是对象的地址。
     * 2.String类是使用频率非常高的一种对象类型，JVM为了提升性能和减少开销，避免字符串的重复创建，因此维护了一块特殊的内存空间，即字符串常量池。
     * 3.当需要使用字符串时，先去字符串常量池查看该字符串是否已经存在，如果存在，则可直接使用；如果不存在，则初始化，并将该字符串放入到字符串常量池中。
     *
     * 4.在JDK1.6及之前版本，字符串常量池在方法区中；在JDK1.7及以后版本，字符串常量池在堆中。
     *
     * 5.==判断的是对象内存的地址，因此相同的字符串String str = "abc";String str2 = "abc";在字符串常量池中会返回同样的地址，则返回true。
     * 6.字符串String str = "abc";字符串对象String str2 = new String("abc");字符串对象str2的地址在堆空间，字符串str的地址在字符串常量池，因此两者不相等。
     * 7.字符串对象String str = new String("abc"); 字符串对象String str2 = new String("abc"); str和str2均在堆空间，是2个对象，地址一定是不同的，所以两者不相等。
     */
    public static void main(String[] args) {
        String str = "Hello World !";
        System.out.println(str);

        int hashCode = str.hashCode();
        System.out.println(hashCode);

        String name = str.getClass().getName();
        System.out.println(name);

        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str2==str3);//false
        System.out.println(str2.equals(str3));//true,boolean equals(string),覆盖了 Object 中的方法，判断字符串内容是否 相同

    }
}
