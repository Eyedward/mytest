import java.util.Scanner;

/**
 * 接收用户输入的任意自然数,累计所有位数数字之和
 */
public class NaturalNumber {
    public static void main(String[] args) {
        System.out.println("输入要求和的自然数:");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        while(number != 0){

            sum = sum + (number % 10);

            number = number/10;
        }
        System.out.println(sum);
    }
}
