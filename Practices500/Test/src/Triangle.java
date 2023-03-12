import java.util.Scanner;

/**
 * 需求:接收用户输入的行数,打印对应的全三角形
 *     *
 *    ***
 *   *****
 *  *******
 */
public class Triangle {
    public static void main(String[] args) {
        //1.提示并接收用户输入的行数:
        System.out.println("请输入您要打印星星的行数:");
        int n = new Scanner(System.in).nextInt();

        //2.开始打印图形
        //2.1外层循环控制打印的行数 i的取值范围:[1,n],一共n行
        for(int i=1;i<=n;i++){
            //2.2内层循环1
            //控制每行打印空格的个数 j的取值范围:[0,n-i),即1 2 3...
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //2.3内层循环2
            //控制每行打印星星的个数 k的取值范围:[1,2*i-1],即1 3 5 ...
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            //2.4打印完本行所有内容后添加换行
            System.out.println();
        }
    }
}
