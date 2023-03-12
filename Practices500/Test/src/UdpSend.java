import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 1.DatagramSocket. 封装了 udp 传输协议的 socket 对象
 * 2.因为数据包中包含的信息较多，为了操作这些信息方便，也一样会将其封装成对象。
 * 这个数据包对象就是：DatagramPacket.通过这个对象中的方法，就可以获取到数据包中的各种信息。
 */
public class UdpSend {
    public static void main(String[] args)throws Exception {
        // 1，建立 udp 的 socket 服务。
        DatagramSocket ds = new DatagramSocket(8888);//指定发送端口，不指定系统会随机分配。

        // 2，明确要发送的具体数据。
        String text = "udp 传输演示 哥们来了";
        byte[] buf = text.getBytes();

        // 3，将数据封装成了数据包。
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10000);

        // 4，用 socket 服务的 send 方法将数据包发送出去。
        ds.send(dp);

        // 5，关闭资源。
        ds.close();
    }
}
