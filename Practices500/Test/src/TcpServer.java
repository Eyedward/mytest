import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(10002);//建立服务端的socket服务

        Socket socket = serverSocket.accept();//获取客户端对象

        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip+".....connected");

        // 可以通过获取到的 socket 对象中的 socket 流和具体的客户端进行通讯。
        InputStream in = socket.getInputStream();//读取客户端的数据，使用客户端对象的socket读取流
        byte[] buf = new byte[1024];
        int len = in.read(buf);

        String text = new String(buf,0,len);//将字节数组中的有效部分转成字符串。
        System.out.println(text);

        // 如果通讯结束，关闭资源。注意：要先关客户端，再关服务端。
        socket.close();
        serverSocket.close();
    }
}
