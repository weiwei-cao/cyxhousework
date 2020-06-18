package secondhomework.cyx;

import java.util.Arrays;
import java.util.Scanner;

/*
* 从键盘输入8个整数存放在一个数组中
* 然后将奇数和偶数分别存入到两个不同的数组中
* 并按奇数偶数交替的顺序输出这两个数组中的所有数据
* 先交替输出,如果奇数个数多,则在输出剩下的奇数
*
* 提示要求:
* 定义一个数组存储从键盘输入的8个整数,先判断这8个数中奇数和偶数的个数
* 才能定义存储奇数和偶数的数组的长度
* 把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法
*  */
public class Test {
    private static int two;
    private static int one;
    public static void main(String[] args) {
        int a[]=new int[8];
        for(int i=0;i<8;i++){
            System.out.println("请输入第"+i+"个数:");
            Scanner sc=new Scanner(System.in);
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                two++;
            }
            else
                one++;
        }
        int[] atwo=new int[two];
        int[] aone=new int[one];
        int p=0,q=0;
        for(int i=0;i<8;i++){
            if(a[i]%2==0){
                atwo[p]=a[i];
                p++;
            }else{
                aone[q]=a[i];
                q++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(atwo));
        System.out.println(Arrays.toString(aone));

        if(two>one){
            for(int i=0;i<aone.length-1;i++){
                System.out.print(aone[i]+" "+atwo[i]);
            }
            for(int i=aone.length;i<atwo.length;i++){
                System.out.print(atwo[i]);
            }
            System.out.println();
        }else{
            for(int i=0;i<atwo.length-1;i++){
                System.out.print(atwo[i]+" "+aone[i]);
            }
            for(int i=atwo.length;i<aone.length;i++){
                System.out.println(aone[i]);
            }
        }
    }

}
