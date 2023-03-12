import java.util.Scanner;

/**
 *接收用户输入的数字,判断在此范围内质数的个数
 */
public class PrimeNumber2 {
    public static void main(String[] args) {
        System.out.println("输入整数n，求n内质数的数量:");
        int n = new Scanner(System.in).nextInt();
        count(n);
    }

    public static void count(int n) {
        if(n<2) {
            System.out.println("没有质数");
            return;
        }
        if(n==2) {
            System.out.println("有1个质数");
            return;
        }
        //定义计数变量
        int count = 1;//已知有一个质数
        outer:   //从3到n寻找质数
        for(int i=3; i<=n ;i++) {
            //判断i是否是质数
            double max = 1+ Math.sqrt(i);
            for(int j=2; j<max; j++) {//在2到<max，找能把i整除的数
                if(i%j == 0) {//i被j整除，i不是质数
                    //跳到i++，继续判断下一个i值
                    continue outer;//跳到外部outer的位置
                }
            }
            //内层j循环结束，i是质数
            count++;
        }
        System.out.println(n+"内质数的数量："+count);
    }
}
