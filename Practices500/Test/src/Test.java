import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        /**
         *文本文件的写入和追加内容
         */
        FileWriter fileWriter = new FileWriter("demo.txt");
        fileWriter.write("abcdefg");
        fileWriter.flush();
        fileWriter.close();

        //内容追加
        FileWriter fileWriter1 = new FileWriter("demo.txt",true);
        //输出换行符
        fileWriter1.write("\r\n");
        //输出追加内容
        fileWriter1.write("hello");
        fileWriter1.close();

        /**
         * 文本文件的读取
         */
        //读取数据的第一种方式
        FileReader fr1 = new FileReader("demo.txt");
        int ch = 0;
        while((ch = fr1.read())!= -1) { //条件是没有读到结尾
            System.out.println(ch);//字符在底层存储的时候就是存储的数值。即字符对应的ASCII码
            //System.out.print((char)ch); //调用读取流的 read 方法，读取一个字符。
            //read()方法一次读一个字节的二进制数据—是 int 型的！
        }
        fr1.close();
        System.out.println();

        //读取数据的第二种方式
        FileReader fr2 = new FileReader("demo.txt");
        //因为要使用 read(char[])方法，将读取到字符存入数组。所以要创建一个字符数组，一般数组的长度都是 1024 的整数倍。
        char[] buf = new char[1024];//读取的字符数组长度是 1024
        int len = 0;
        while(( len=fr2.read(buf)) != -1) {
            System.out.println(new String(buf,0,len));//将 char 类型的数据从 0 到len 转换成 String
        }
        fr2.close();

        /**
         * BufferedWriter(将流和缓冲区结合)：是给字符输出流提高效率用的，那就意味着，
         * 缓冲区对象建立时，必须要先有流对象。明确要提高具体的流对象的效率
         */

        FileWriter fw = new FileWriter("buffered.txt");
        BufferedWriter bw = new BufferedWriter(fw);//让缓冲区和指定流相关联。
        for(int x=0; x<4; x++){
            bw.write(x+":abc");
            bw.newLine(); //写入一个换行符，这个换行符可以依据平台的不同写入不同的换行符。
            bw.flush();//对缓冲区进行刷新，可以让数据到目的地中。
        }
        bw.close();//关闭缓冲区，其实就是在关闭具体的流。

        System.out.println("-----");

        /**
         * BufferedReader
         */

        //InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"gbk");
        FileReader fr = new FileReader("buffered.txt");
        BufferedReader buffer = new BufferedReader(fr);
        String line1 = null;
        while((line1=buffer.readLine())!=null){ //readLine 方法返回的时候是不带换行符的。String 类型
            System.out.println(line1);
        }
        buffer.close();
        System.out.println("-----");

        /**
         * 读取键盘输入转换流输出到控制台
         */
        System.out.println("在键盘输入字符:");
        //读取键盘录入
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        //将读取到的从键盘输入的字节转化成字符存在流中，并将其放入缓冲区
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));//输出到控制台
        String line2 = null;
        while((line2=bufr.readLine())!=null){
            if("over".equals(line2))
                break;
            bufw.write(line2.toUpperCase());//将输入的字符转成大写字符输出
            bufw.newLine();//换行
            bufw.flush();
        }
        bufw.close();
        bufr.close();
    }
}
