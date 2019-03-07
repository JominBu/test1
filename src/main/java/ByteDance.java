
/**
 * Created with IntelliJ IDEA.
 *
 * @author buxiaoming
 * Date: 2019-03-04
 * Time: 15:51
 */
public class ByteDance {

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(waterVolume(arr));
    }


    /**
     *
     有一组不同高度的台阶，有一个整数数组表示，数组中每个数是台阶的高度，当开始下雨了（雨水足够多）台阶之间的水坑会积水多少呢？
     如下图，可以表示为数组[0,1,0,2,1,0,1,3,2,1,2,1]，返回积水量6。
     https://blog.csdn.net/Thomas0713/article/details/83051990
     */

    public static int waterVolume(int[] arr) {
        int arrLen = arr.length;
        int arrMax = 0;
        int arrMaxPos = 0;
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] > arrMax) {
                arrMax = arr[i];
                arrMaxPos = i;
            }
        }
        int arrMaxLeft = 0;
        int arrMaxRight = 0;
        int volumes = 0;
        for (int i = 0; i < arrMaxPos; i++) {
            if (arrMaxLeft < arr[i]) {
                arrMaxLeft = arr[i];
            } else {
                volumes += arrMaxLeft - arr[i];
            }
        }
        for (int i = arrLen-1; i > arrMaxPos; i--) {
            if (arrMaxRight < arr[i]) {
                arrMaxRight = arr[i];
            } else {
                volumes += arrMaxRight - arr[i];
            }
        }
        return volumes;
    }

}
