import java.util.Arrays;

public class maopaoup {
    public static void main(String[] args){
        //冒泡排序升级版
        int arr[]={1,5,10,7,5,2,5,8,5,3,5,88,44,1,0,4,4,5,5,16,5,61,6,6,16,165,1,651,651,651,77,115,8,6,2,5,8,4,4,55,88,99,100,555,20,3};
        Long starttime=System.currentTimeMillis();
         Maopao(arr);
        Long endtime=System.currentTimeMillis();
        Maopao(arr);

        System.out.println("共用时"+ (endtime-starttime));
    }
    public static void Maopao(int arr[]){
        int text=0;
        boolean q;
        for (int j=0;j< arr.length-1;j++) {
            q=false;
            for (int a = 0; a < arr.length - 1 - j; a++) {
                if (arr[a] > arr[a + 1]) {
                    text = arr[a + 1];
                    arr[a + 1] = arr[a];
                    arr[a] = text;
                    q=true;
                }
            }
            if(q==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
