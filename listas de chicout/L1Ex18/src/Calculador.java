import java.util.Scanner;
public class Calculador {
    private Scanner scanner;
    private int diaA, mesA, anoA, idade;

    public int CalculoIdade(Pessoa pessoa){
        this.scanner = new Scanner(System.in);
        System.out.println("\n\nDigite o dia atual: ");
        setDiaA(scanner.nextInt());
        System.out.println("Digite o mes atual: ");
        setMesA(scanner.nextInt());
        System.out.println("Digite o ano atual: ");
        setAnoA(scanner.nextInt());
        int mes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(pessoa.getDiaN() > diaA){
            diaA = diaA+mes[pessoa.getMesN()-1];
            mesA = mesA-1;
        }
        if(pessoa.getMesN() > mesA){
            anoA = anoA-1;
            mesA = mesA+12;
        }
        idade = anoA-pessoa.getAnoN();
        return idade;
    }

    public int getDiaA(){
        return this.diaA;
    }
    public void setDiaA(int x){
        this.diaA = x;
    }
    public int getMesA(){
        return this.mesA;
    }
    public void setMesA(int x){
        this.mesA = x;
    }
    public int getAnoA(){
        return this.diaA;
    }
    public void setAnoA(int x){
        this.anoA = x;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int x){
        this.idade = x;
    }
}
