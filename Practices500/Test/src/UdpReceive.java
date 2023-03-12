import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceive {
    public static void main(String[] args) throws Exception {
        // 1，创建 udp 的 socket 服务。并指明端口号为10000，与发送端保持一致
        DatagramSocket ds = new DatagramSocket(10000);

        // 2，定义数据包，用于存储接收到数据。先定义字节数组，数据包会把数据存储到字节数组中。
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);

        // 3，通过 socket 服务的接收方法将收到的数据存储到数据包中。
        ds.receive(dp);//该方法是阻塞式方法。

        // 4，通过数据包的方法获取数据包中的具体数据内容，比如 ip，端口，数据等等。
        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();

        String text = new String(dp.getData(),0,dp.getLength());//将字节数组中的有效部分转成字符串。

        System.out.println(ip+":"+port+"--"+text);

        // 5，关闭资源。
        ds.close();
    }

}

