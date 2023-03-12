import java.util.Scanner;

/**
 * 接收用户输入的3个整数,并将它们的最大值作为结果输出
 */
public class MaxValue {
    public static void main(String[] args) {
        System.out.println("请输入整数a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入整数b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入整数c:");
        int c = new Scanner(System.in).nextInt();

        int max = a>b?a:b;
        max = max > c ? max : c;

        int min = a < b ? (a<c?a:c) : (b<c?b:c);
        System.out.println("三个数中最大数为:"+max);
        System.out.println("三个数中最小数为:"+min);
    }
}
