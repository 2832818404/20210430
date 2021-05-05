package eud.xcdq.b;

import eud.xcdq.a.Base;

/**
 * @author hongxiaozheng
 * @date 2021/4/30 9:19
 */
public class Example {
    public static void main(String[] args) {
        Base b = new Base();
        Subclass2 s1 = new Subclass2();
        Subclass2 s2 = new Subclass2();
        s1 = s2;

    }
}
