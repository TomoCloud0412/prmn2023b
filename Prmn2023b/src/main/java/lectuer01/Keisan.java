package lectuer01;

import java.util.Scanner;

public class Keisan {
    public int[] num;

    public Keisan(){
        num = new int[5];
    }

    public void scan(){
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            System.out.print("数字"+(i+1)+"つ目" );
            num[i] = scan.nextInt();
            System.out.println("");
        }
    }

    public int sum(){
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++){
            sum += num[i];
        }
        return sum;
    }

    public void judge(int sum){
        System.out.println("合計値：" + sum );
        if (sum >= 100){
            System.out.println("great!!");
        } else if (sum >=50) {
            System.out.println("big!");
        }else {
            System.out.println("small");
        }
    }
}
