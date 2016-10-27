import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: buxiaoming
 * Date: 2016/10/9
 * Time: 9:17
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
//        String[] a = new String[6];
//        a[0]="1";
//        a[1]="2";
//        a[2]="3";
//        String[] b = new String[3];
//        b[0]="4";
//        b[1]="5";
//        b[2]="6";
//        System.arraycopy(b, 0, a, 3, b.length);
//        System.out.println(a[3]);

        List<Integer> list = new ArrayList<Integer>();
        List<String> list1 = new ArrayList<String>();
        for(int i=1; i < 10; i++) {
            for (int j=1; j < 10; j++){
                for (int n=1; n < 10; n++){
                    int a = i + j + n;
                    int b = i * j * n;
                    if (a == 24) {
                        Integer[] ints = new Integer[3];
                        ints[0] = i;
                        ints[1] = j;
                        ints[2] = n;
                        Arrays.sort(ints);
                        String s = ints[0]+""+ints[1]+""+ints[2];
                        if (!list1.contains(s)) {
                            list1.add(s);
                            System.out.println("加：" + i+" "+j+" "+n);
                        }
                    }

                    if (b == 24) {
                        if (!list.contains(a)) {
                            list.add(a);
                            System.out.println("乘：" + i+" "+j+" "+n);
                        }
                    }
                }
            }
        }

    }

}
