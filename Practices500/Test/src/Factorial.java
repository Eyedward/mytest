import java.util.Scanner;

/**
 * 需求:接收用户输入的数字,计算该数字的阶乘结果
 * 已知:负数不可以有阶乘,0的阶乘结果是1,
 * 5 ! = 5 x 4 x 3 x 2 x 1
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.print("输入整数，求阶乘：");
        int n = new Scanner(System.in).nextInt();
        //调用f()方法，把n的值传递到f()方法，求阶乘
        long factorial = f(n);
        System.out.println(n + "的阶乘：" + factorial);
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        /*
         * r = 5
         * i
         * 4, r=r*i
         * 3, r=r*i
         * 2, r=r*i
         * 1, r=r*i
         */
        //for(int i=n-1; i>=1; i--) {
        //    r *= i;
        //}
        else{
            return n * f(n - 1);
        }
    }
}
