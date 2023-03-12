import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        //通过名称（ip字符串或主机名）来获取一个ip对象
        // InetAddress ip = InetAddress.getByName("www.baidu.com");
        InetAddress ip = InetAddress.getByName("ZhangY-PC");

        //InetAddress ip = InetAddress.getLocalHost();

        //获取本地主机InetAddress对象
        System.out.println(InetAddress.getLocalHost());//ZhangY-PC/169.254.145.168

        //获取本地IP地址
        System.out.println("address:"+ip.getHostAddress());//address:169.254.145.168

        //获取本地主机名
        System.out.println("name:"+ip.getHostName());//name:ZhangY-PC
    }
}
