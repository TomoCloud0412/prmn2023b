package lectuer01;

import java.util.Scanner;

public class Gakuseki_Scan {
    public String gakuseki ;
    public String pass;

    public void Gakuseki_scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your student number");
        gakuseki = scanner.next();
    }

    public void Pass_scan(){
        System.out.println("Input your pass");
        Scanner scanner = new Scanner(System.in);
        pass = scanner.next();
    }
}
