package lectuer01;

import java.util.Scanner;

public class Gakuseki {

    public String gakuseki;

    public String inputgakuseki(){

        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入手してください");
        gakuseki = scan.next();
        return gakuseki;

    }

    public void judge(String gakuseki){
        String number = "B2001000";
        if (number.equals(gakuseki)) {
            System.out.println("Complete!!");
        }else{
            System.out.println("error!!");
        }
    }
}
