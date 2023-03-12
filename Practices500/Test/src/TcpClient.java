import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//需求:客户端给服务器端发送一个数据
public class TcpClient {
    public static void main(String[] args) throws Exception {
        //创建客户端socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),10002);

        OutputStream out = socket.getOutputStream();//获取了socket流中的输出流对象
        out.write("tcp演示，哥们又来了".getBytes());
        socket.close();
    }
}
