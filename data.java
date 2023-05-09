/**
 * 举例：二分查找数组A{1，8，50，78，66，666，6666}，
 *   输入数字A，查找是否存在，如果存在返回下标，不存在提示数组内未用户查找数据。
 *   目的：查找数字-1在哪个位置。
 *   方法：mid = (left + right) / 2
 *   二分查找第一轮：mid = (0 + 6) / 2 = 3, -1 < A[mid], 往左边查找。
 *   二分查找第二轮：mid = (0 + mid -1) / 2 = 1, -1 < A[mid], 往左边查找。
 *   二分查找第三轮：mid = (0 + mid -1) / 2 = 0, -1 < A[mid], 往左边查找。
 *   二分查找第四轮：left=0, right=-1 结束。
 **/
    /*
       一、定义一些可事先想到的变量。
     *     1. 待查找的数组：arr[]
     *     2. 待查找的数据: findValue
     *     3. 二分法查找的左右边界：left right
     *     4. 整个方法的名字：myBinary
     * 二、myBinary方法解释
     *     1. int: 如果查到待查找数据则返回索引，未找到返回-1.
     *     2. 判断待查找数据findValue与中值arr[mid]
     *     3. 如果findValue > arr[mid], 说明待查找数据在右边。
     *     4. 如果findValue < arr[mid], 说明待查找数据在左边。
     *     5. 如果findValue == arr[mid], 说明待查找数据已找到。
     *     6. 结束条件：（1）数据已找到则停止。（2）left > right 代表无该数据，同样停止。
     **/public class data {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int findvalue=15;
        int result=erfenchazhao(arr,findvalue,0,arr.length-1);
        System.out.println("查找值为:"+findvalue+",待查找数据在数据中的位置为:"+(result==-1?"未找到该数字":result));
    }
    public static int erfenchazhao(int arr[],int findvalue,int left,int right ) {
         int mid=(left+right)/2;
         int midvalue=arr[mid];
         if (left > right){
             return -1;
         }
         if (findvalue==midvalue){
             return mid;
         }
         if (findvalue<midvalue){
             return erfenchazhao(arr,findvalue,left,mid-1);
         }
         if (findvalue>midvalue){
             return erfenchazhao(arr,findvalue,mid+1,right);
         }
         return 1;
    }
}
