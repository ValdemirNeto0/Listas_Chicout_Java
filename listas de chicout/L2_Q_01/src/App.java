import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraInterface calculadora = new CalculadoraInterface();
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}