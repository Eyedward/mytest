public class SingletonTest1 {
    public static void main(String[] args) {

        SingletonTest2 instance = SingletonTest2.getInstance();
        instance.setName("jason");

        SingletonTest2 instance1 = SingletonTest2.getInstance();
        instance1.setName("0988");

        instance.printInfo();
        instance1.printInfo();

        if(instance == instance1){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }
    }
}
