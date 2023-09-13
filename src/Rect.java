import java.util.Random;

public class Rect {

    int wig, len;

    Random ran = new Random();
    public Rect() {
        wig = ran.nextInt(1, 99);
        len = ran.nextInt(1, 99);
    }

    static int getPerim(int a, int b){
        return a*b;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "wig=" + wig +
                ", len=" + len +
                '}';
    }
}
