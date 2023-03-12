import java.util.Scanner;

/**
 * 接收用户输入的邮箱名，获取邮箱的名字
 * 比如：cxy@163.com,输出cxy
 */
public class Substring {
    public static void main(String[] args) {
        System.out.println("请输入你的邮箱号:");
        String email = new Scanner(System.in).nextLine();
        String name = getName(email);
        System.out.println("邮箱名字是:"+name);
    }
    static String getName(String email){
        int index = email.indexOf("@");
        if(index ==-1)
            return "邮箱格式错误!";
        return email.substring(0,index);
    }
}
