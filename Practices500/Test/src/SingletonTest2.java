public class SingletonTest2 {
    String name;

    private SingletonTest2(){};
    private static SingletonTest2 singletonTest2 = null;
    //使用双重锁定的方式
    public static SingletonTest2 getInstance(){
        if (singletonTest2 == null){
            synchronized (SingletonTest2.class){
                if (singletonTest2 == null){
                    singletonTest2 = new SingletonTest2();
                }
            }
        }
        return singletonTest2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println("the name is :"+name);
    }
}
