
import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        while(true) {
            try {  //try break 语句:捕获报错并输出catch里面的内容
                System.out.println("----------计算机程序----------");
                System.out.println("-----------1、启动-----------");
                System.out.println("-----------2、结束-----------");
                Scanner a=new Scanner(System.in);
                int b=a.nextInt();
                if(b==1) {
                    System.out.println("请输入第一个数。");
                    Scanner i=new Scanner(System.in);
                    int j=i.nextInt();
                    System.out.println("请输入第二个数。");
                    Scanner m=new Scanner(System.in);
                    int n=m.nextInt();
                    System.out.print("两个数相加=");
                    System.out.println(j+n);
                    System.out.print("两个数相减=");
                    System.out.println(j-n);
                    System.out.print("两个数相乘=");
                    System.out.println(j*n);
                    System.out.print("两个数相除=");
                    System.out.println(j/n);
                }else if(b==2){
                    System.out.println("好，你可以退出了！下次见！");
                }else {
                    System.out.println("你输入的数据非法！");
                    break;
                }
            }catch (Exception asdfghjk){
                System.out.println(1213213);
            }
        }
    }
}

