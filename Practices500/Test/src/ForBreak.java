/**
 * 多次生成随机数,并打印第一次出现大于0.999 时的次数与生成的随机数
 */
public class ForBreak {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            double d = Math.random();
            if (d > 0.999) {
                System.out.println("第" + i + "次产生了目标值,值为:" + d);
                break;
            }
        }
    }
}