public class day2 {
    public static void main(String[] args){
//        \n:换行
        System.out.println("??????\n???????");
//        \t:产生空格
        System.out.println("???????????????\t???????");
//         \'=加一个单引号
        System.out.println("???????????????\'???????");
//     常量和变量:常量是不变的(在变量前面加 final如 final int num=1，)，变量会被随时改写,变化（如int num=1，在下一句就可以定义num=2执行）
//        final: 可以修饰类也可以修饰变量但是不可以修饰方法,修饰的类是不可以被继承的
       final int num=1; //此时是错误的，因为下面声明了num=2，改变了num的值，所以会报错。
        System.out.println(num);
//        num=2;
        System.out.println(num);
        //Switch语句
        int a=100;
        switch (a){
            case 100: //如果满足a=100这个条件则执行a++
                a++;
               break;  //跳出不执行下面的代码所以结果为101
            case 101:
                a--;
                break;//break:跳出
            default: //default:默认执行(如果以上条件都不满足则执行default的条件)
                a--;
        }
System.out.println(a);
        //循环
         while (1==1){ //while循环:如果1=1则执行下一步
             System.out.println(a++); //输出a+1
             if (a==1000){   //如果a=1000则输出123
                 System.out.println("123");
                 break; //跳出循环

             }
         }do {
            System.out.println("呵呵");
        }while (a!=1000);
    }
}
