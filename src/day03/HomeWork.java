package day03;

public class HomeWork {
    //1.打印等腰三角形
    //2.求100以内所有质数的和
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int s=0;

        for(int i=2;i<100;i++){
            boolean real=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    real=false;
                    break;
                }
            }
            if(real){
                s=s+i;
                System.out.println(i);
            }
        }
        System.out.println(s);
    }
}
