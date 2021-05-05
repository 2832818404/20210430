package eud.xcdq.a;

/**
 * @author hongxiaozheng
 * @date 2021/4/30 9:13
 */
public class DoSub {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(((Sub)b).getFields());
    }
}
