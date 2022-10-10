import java.util.Random;

public class GeradorNumero {
    private int num;

    public GeradorNumero() {
    }

    public int getNum() {
        return num;
    }
    public void setNum() {
        Random r = new Random();
        this.num = r.nextInt(1000 - 1) + 1;
    }
}
