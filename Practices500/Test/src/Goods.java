import java.util.Scanner;

/**
 *设计并完成一个简单的商品录入系统，可以实现：菜单显示、商品信息展示、商品信息录入、商品信息查询、退出的功能
 */
public class Goods {

    //成员变量
    static String[] names = {"iPhoneXS","华为 Mate 20 pro","小米X","vivo NEX","oppo Find"};
    static double[] prices = {8999,5399,2399,4399,3999};
    static int[] numbers =  {50,20,80,120,90};

    public static void main(String[] args) {
        outer:
        while(true){
            int c = menu();
            switch(c){
                case 1:
                    f1();
                    break;
                case 2:
                    f2();
                    break;
                case 3:
                    f3();
                    break;
                case 4:
                    f4();
                    break;
                case 5:
                    break outer;
            }
        }
    }
    public static int menu(){
        System.out.println("----------------------");
        System.out.println("1. 商品列表");
        System.out.println("2. 商品录入");
        System.out.println("3. 商品查询");
        System.out.println("4. 统计信息");
        System.out.println("5. 退出");
        System.out.println("----------------------");
        System.out.print("选择：> ");
        return new Scanner(System.in).nextInt();
    }

    /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
           0     1    2
         1. 名称：xx，价格：xx，数量：xx
       */
    public static void f1(){
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            double price = prices[i];
            int number = numbers[i];
            System.out.println((i+1)+".名称:"+name+".价格:"+price+".数量:"+number);
        }
    }

    /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
          0     1    2
      */
    private static void f2(){
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println("录入第"+(i+1)+"件商品:");
            System.out.println("名称:");
            String name = new Scanner(System.in).nextLine();
            System.out.println("价格:");
            double price = new Scanner(System.in).nextDouble();
            System.out.println("数量:");
            int number = new Scanner(System.in).nextInt();
            names[i] = name;
            prices[i] = price;
            numbers[i] = number;
        }
        f1();
    }
    
     /*
         names
         ["A", "B", "C"]
         price
         [2,    8,    3]
         numbers
         [200,  300,  180]
          0     1    2
        字符串，比价是否相等，要用equals()方法
        a = "aaa"
        b = "aaa"
        a.equals(b)
       */
    private static void f3(){
        System.out.print("输入查询的商品名：");
        String n = new Scanner(System.in).nextLine();
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            // n 和 names[i] 相等
            if(n.equals(names[i])) {
                String name = names[i];
                double price = prices[i];
                int number = numbers[i];
                System.out.println(
                        (i+1)+". 名称："+name+"，价格："+price+"，数量："+number);
                return;
            }
        }
        //循环结束，所有商品都比较完，没有找到
        System.out.println("找不到商品");
    }
    private static void f4(){
        //商品总价，单价均价，最高单价，最高总价
        double spzj = 0;//商品总价
        double djzj = 0;//单价总价
        double zgdj = 0;//最高单价
        double zgzj = 0;//最高总价
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            spzj += prices[i] * numbers[i];
            djzj += prices[i];
            //数组中，找到更大的值
            if(prices[i] > zgdj) {
                zgdj = prices[i];//更大值存到这个变量
            }
            if(prices[i]*numbers[i] > zgzj) {
                zgzj = prices[i]*numbers[i];
            }
        }
        System.out.println("商品总价："+spzj);
        System.out.println("单价均价："+(djzj/names.length));
        System.out.println("最高单价："+zgdj);
        System.out.println("最高总价："+zgzj);
    }
}
