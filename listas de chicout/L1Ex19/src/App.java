public class App {
    public static void main(String[] args) throws Exception {
        Agenda a = new Agenda();
        a.armazenaPessoa("Neto", 1, 1.80);
        a.armazenaPessoa("Alice", 2, 1.80);
        a.armazenaPessoa("Hendrick", 3, 1.80);
        a.imprimeAgenda();
        System.out.println("\n");
        a.removePessoa("Neto");
        a.imprimeAgenda();
        System.out.println("Buscando Neto: ");
        System.out.println(a.buscaPessoa("Neto"));
        System.out.println("Buscando Alice");
        System.out.println(a.buscaPessoa("Alice"));
        System.out.println("Buscando a segunda pessoa da Agenda");
        System.out.println(a.imprimePessoa(1));
    }
}
