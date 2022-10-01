public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto controle = new ControleRemoto();
        controle.aumentarVolume();
        controle.statusTv();
        controle.aumentarCanal();
        controle.statusTv();
        controle.diminuirVolume();
        controle.statusTv();
        controle.diminuirCanal();
        controle.statusTv();
    }
}