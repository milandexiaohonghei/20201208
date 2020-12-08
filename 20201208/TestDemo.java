import java.util.Arrays;


public class TestDemo {


    /**
     * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
     *     示例 1：
     *     输入：[1,2,5,9,5,9,5,5,5]
     *     输出：5
     *     示例 2：
     *     输入：[3,2]
     *     输出：-1
     *     示例 3：
     *     输入：[2,2,1,1,1,2,2]
     *     输出：2
     */

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,9,5,9,5,5,5};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr){
        int len = arr.length;
        for(int i = 0;i<len/2;i++){
            for(int j = i+len/2; j < len;j++ ){
                if(arr[i] == arr[j]){
                    return arr[i];
                }else{
                    break;
                }
            }
        }
        return -1;

    }



    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main5(String[] args) {
        int[] num = new int[100];
        for(int i = 0;i<num.length;i++){
            num[i] = i;
        }
        String newnum = Arrays.toString(num);
        System.out.println(newnum);
    }





    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void main4(String[] args) {
        int[] num = new int[]{1,3,5,7,9,11};
        print(num);
    }
    public static void print(int[] num){
        for(int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }


    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void main3(String[] args) {
        int[] num = new int[]{1,3,5,7,9,11};
        mul(num);
        String newnum = Arrays.toString(num);
        System.out.println(newnum);

    }

    public static void mul(int[] num){
        for(int x:num){
            x*=2;
        }
    }




   //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.

    public static void main2(String[] args) {
        int[] num = new int[]{1,3,5,7,9,11};
        System.out.println(sum(num));
    }

    public static int sum(int[] num){
        int count = 0;
        for(int x:num){
            count += x;
        }
        return count;
    }



    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static void main1(String[] args) {

        double[] num = new double[]{1,3,5,7,9,11,13};
        System.out.println(avg(num));
    }
    public static double avg(double[] num){
        double count = 0;
        for(double x:num){
            count += x;
        }
        count = count/num.length;
        return count;
    }
}
