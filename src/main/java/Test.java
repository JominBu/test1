/**
 * Created with IntelliJ IDEA.
 * User: buxiaoming
 * Date: 2016/10/9
 * Time: 9:17
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        String[] a = new String[6];
        a[0]="1";
        a[1]="2";
        a[2]="3";
        String[] b = new String[3];
        b[0]="4";
        b[1]="5";
        b[2]="6";
        System.arraycopy(b, 0, a, 3, b.length);
        System.out.println(a[3]);

    }

}
