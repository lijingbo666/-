
import java.util.Scanner;
public class day3 {
    public static void main(String args[]) {
        while(true) {
            System.out.println("输入你想计算的年份！");
            try {
                Scanner a=new Scanner(System.in);
                int b=a.nextInt();
                if(b%4==0) {
                    System.out.println("该年是闰年。");
                }else if (b%4==1){
                    System.out.println("该年不是闰年！！！，最近的闰年是"+(b++));


                } else if (b%4==3) {
                    System.out.println("该年不是闰年！！！，最近的闰年是"+(b++));
                }else if (b%4==2) {
                    System.out.println("该年不是闰年！！！，最近的闰年是"+(b+2));
                }
            }catch(Exception e) {
                System.out.println("你输入的数据非法！！！！！");
            }
        }
    }
//输入年份，计算该年是不是闰年




}
