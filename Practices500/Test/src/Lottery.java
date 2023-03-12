import java.util.Arrays;
import java.util.Random;

/**
 * 需求：体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，1-16号共16个蓝色球中选出一个作为中奖号码，请实现这个需求
 * 对比 SufferArray.java
 */
public class Lottery {
    public static void main(String[] args) {
        //准备两个号码数组
        int[] red = getArray(33);
        int[] blue = getArray(16);
        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));
        //选择红球
        int[] reds = selectRed(red);
        //选择蓝球
        int blues = selectBlue(blue);
        System.out.println("红球:"+Arrays.toString(reds));
        System.out.println("蓝球:"+blues);
    }

    //准备数组的方法
    private static int[] getArray(int n){
        int[] a = new int[n];
        //遍历数组
        for (int i = 0; i < n; i++) {
            a[i] = i+1;
        }
        //返回数组
        return a;
    }

    //选择红球
    private static int[] selectRed(int[] red){
        for (int i = 0; i < 6; i++) {

            int j = i + new Random().nextInt(red.length - i);

            int t = red[i];
            red[i] = red[j];
            red[j] = t;
        }
        return Arrays.copyOf(red,6);
    }

    //选择蓝球
    private static int selectBlue(int[] blue){
        return blue[new Random().nextInt(16)];
    }
}
