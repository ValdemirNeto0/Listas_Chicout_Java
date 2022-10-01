public class App {
    public static void main(String[] args) throws Exception {
        Apolice apolice1 = new Apolice();
        apolice1.calcularPremioApolice();
        apolice1.oferecerDesconto("Rio de Janeiro");
        System.out.println(apolice1);
        Apolice apolice2 = new Apolice("Jose", 26, 1500);
        apolice2.calcularPremioApolice();
        apolice2.oferecerDesconto("Belo Horizonte");
        System.out.println(apolice2);
    }
}