import java.util.Arrays;
import java.util.Random;

/**
 * 生成一个顺序数组,将这个数组的元素打乱顺序后输出
 * 对比Lottery.java
 */
public class SufferArray {
    public static void main(String[] args) {
        //调用f()方法，从方法获取一个int[]数组
        int[] a = f();
        //遍历打印数组数据
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n\n----------------");

        //把a数组，传递到 shuffle() 方法打乱顺序
        shuffle(a);
        //打印乱序后的数组
        System.out.println(Arrays.toString(a));
    }

    public static int[] f() {
        //新建int[]数组，长度5
        //再把它的内存地址存到变量 a
        int[] a = new int[5];
        //遍历访问5个位置，填入1,2,3,4,5
        for(int i=0; i<a.length; i++) {
            a[i] = i+1;
        }
        //返回数组，把数组返回到调用位置
        //本质是把数组地址返回去
        return a;
    }

    public static void shuffle(int[] a) {
        /*
         *        j
         * [4, 2, 3, 1, 5]
         *     i
         *
         * *) i循环遍历数组
         * *) 随机定位下标j与i交换
         */
        for (int i = 0; i < a.length; i++) {
            //随机下标j，范围：[0, a.length)
            int j = new Random().nextInt(a.length);
            int t = a[i];   //t=a[0]=1
            a[i] = a[j];    //a[0]=a[1] a[0]=2;
            a[j] = t;       //a[1]=1;
        }
    }
}
