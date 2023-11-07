package lectuer01;

public class Login {
    public static void main(String[] args) {
        Gakuseki_Scan gs = new Gakuseki_Scan();
        Gakuseki_jugde gj = new Gakuseki_jugde();

        gs.Gakuseki_scan();
        gj.gakuseki_judge(gs.gakuseki);

        gs.Pass_scan();
        gj.pass_judge(gs.pass);
    }
}
