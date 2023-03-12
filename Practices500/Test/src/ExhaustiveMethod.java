/**
 * 鸡兔同笼问题（穷举法）
 * 已知:鸡兔共35只,共94只脚,那么鸡和兔各几只?
 * 鸡  兔
 * 0   35
 * 1   34
 * 2   33
 * ...
 */
public class ExhaustiveMethod {
    public static void main(String[] args) {
        for (int j = 0,t=35; j <=35 ; j++,t--) {
            if(j*2+t*4 == 94){
                System.out.println("鸡:"+j+",兔"+t);
            }
        }
    }
}
