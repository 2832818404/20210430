package eud.xcdq;

/**
 * @author hongxiaozheng
 * @date 2021/4/30 11:28
 */
public class c {
    public static void main(String[] args) {
        int  a=100 , b = 100;
        System.out.println( a == b );

        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d );

        boolean isReboot1 = true;
        Boolean isReboot2 = new Boolean("1");
        System.out.println( isReboot1 ==  isReboot2 );

        /*boolean isReboot1 = true;
        Boolean isReboot2 = new Boolean(true);
        System.out.println( isReboot1 ==  isReboot2 );*/
    }
}
