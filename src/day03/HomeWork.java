package day03;

public class HomeWork {
    //1.打印99乘法表2.打印等腰三角形
    public static void main(String[] args) {
        int i;
        int j;
        int s;
        for(i=1;i<10;i++){
            for(j=1;j<10;j++){
                System.out.print(i+"*"+j+"="+i*j+"   ");
            }
            System.out.println();
        }
        System.out.println("打印成功");
        for(i=1;i<9;i++){
            for(j=1;j<=9-i;j++){
                System.out.print(" ");
            }
            for(s=1;s<=2*i-1;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
