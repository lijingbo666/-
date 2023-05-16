import java.util.Arrays;

public class maopao {
    public static void main(String[] args) {
        int arr[]={3,9,50,10,20};
        maopaoFirst(arr);
    }

    public static void maopaoFirst(int arr[]){
        int text=0;
        for(int j=0;j<arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    text = arr[i + 1]; //arr[i+1]的值给text现在arr[i+1]是空位置
                    arr[i + 1] = arr[i];//然后把arr[i]的值给arr[i+1]现在arr[i]是空位置
                    arr[i] = text;//把text的值给arr[i]
                }
            }
        }
        System.out.println("第一波排序结果为");
        System.out.println(Arrays.toString(arr));//数组转化成字符串的形式输出出来，要不然返回的是一个内存地址
    }
}


