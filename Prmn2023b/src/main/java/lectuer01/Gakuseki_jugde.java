package lectuer01;

public class Gakuseki_jugde {

    public int value;


    public void gakuseki_judge(String gakuseki){
        Gakuseki_Pass gakusekiPass = new Gakuseki_Pass();

        for (int i = 0 ; i < 5 ; i++){
            if (gakuseki.equals(gakusekiPass.student[i][0])){
                value = i;
                return;
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }

    public void pass_judge(String pass){
        Gakuseki_Pass gakusekiPass = new Gakuseki_Pass();


            if (pass.equals(gakusekiPass.student[value][1])){
                System.out.println("ログイン完了");
                return;
            }

        System.out.println("不正アクセス");
        System.exit(0);
    }
}
