package lectuer01;

public class Prac2 {
    public static void main(String[] args) {
        Keisan keisan = new Keisan();
        keisan.scan();
        int sum = keisan.sum();
        keisan.judge(sum);
    }
}
