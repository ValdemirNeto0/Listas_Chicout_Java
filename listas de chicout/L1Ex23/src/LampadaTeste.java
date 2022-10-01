public class LampadaTeste {
    public void teste(){
        Lampada l1 = new Lampada(), l2 = new Lampada("Florescente", "Branca", "Sei la", 110, 50, 45);
        System.out.println(l1);System.out.println(l2);
        if(l1.getPotencia() > l2.getPotencia()){
            System.out.println("Lampada 1 = "+l1.getPotencia()+" tem mais potencia que a lampada 2 = "+l2.getPotencia());
        }else{
            System.out.println("Lampada 2 = "+l2.getPotencia()+" tem mais potencia que a lampada 1 = "+l1.getPotencia());
        }

        if(l1.getPreco() > l2.getPreco()){
            System.out.println("Lampada 1 = "+l1.getPreco()+" eh mais cara que a lampada 2 = "+l2.getPreco());
        }else{
            System.out.println("Lampada 2 = "+l2.getPreco()+" eh mais cara que a lampada 1 = "+l1.getPreco());
        }
    }
}
