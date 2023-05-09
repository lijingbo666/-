import java.util.Scanner;

public class day1 {
     public static void main(String[] args) {
         System.out.println("=========程序开始==========");
         System.out.println("选择需要的操作:1,执行程序  2，退出");
         Scanner a = new Scanner(System.in);
         int input = a.nextInt();

         while (true) {
             try {

                 if (input == 1) {
                     System.out.println("请选择这个世界上最漂亮的人");
                     System.out.println("章若楠   刘亦菲   赵今麦  李京博 ");
                     Scanner B = new Scanner(System.in);
                     String beauty = B.nextLine();
                     if ("章若楠".equals(beauty)) {
                         System.out.println("==========你是傻逼，世界上谁最好看你不知道？===========");
                     } else if ("刘亦菲".equals(beauty)) {
                         System.out.println("==================再给你一次机会好好说，不然把你电脑炸了==============");

                     } else if ("赵今麦".equals(beauty)) {
                         System.out.println("===============世界上最好看的人姓李================");
                     } else if ("张诗文".equals(beauty)) {
                         System.out.println("知道就好");
                     }

                 } else if (input == 2) {
                     System.out.println("小小的程序都不敢执行，废物");
                     break;
                 } else {
                     System.out.println("你在这输nm呢");
                     break;
                 }
             } catch (Exception e) {
                 System.out.println("你在这输入nm呢");
             }

         }
     }
}
