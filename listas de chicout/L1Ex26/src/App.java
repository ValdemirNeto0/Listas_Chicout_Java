public class App {
    public static void main(String[] args) throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        int sequenciaDesejada = 9;
        for (int x=0; x<sequenciaDesejada; x++){
            System.out.println(fibonacci.fibonacci(x));}
    }
}