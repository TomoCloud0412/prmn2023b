package lectuer01;

public class Prac1 {

    public static void main(String[] args) {
        Gakuseki gaku = new Gakuseki();
        String gakusekin = gaku.inputgakuseki();
        gaku.judge(gakusekin);
    }
}
