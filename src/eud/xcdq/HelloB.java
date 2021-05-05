package eud.xcdq;

/**
 * @author hongxiaozheng
 * @date 2021/4/30 8:48
 */
public class HelloB extends HelloA{
    static {
        System.out.println("static B");
    }
    {
        System.out.println("I`m B class");
    }

    public HelloB(){
        System.out.println("hello B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
