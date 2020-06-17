package day03;

public class HomeWork {
    //1.打印99乘法表2.打印等腰三角形
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<10;i++){
            for(j=1;j<10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
        System.out.println("打印成功");
    }
}
