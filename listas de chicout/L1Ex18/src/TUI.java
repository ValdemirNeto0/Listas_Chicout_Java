import java.util.Scanner;
public class TUI {
    private Scanner scanner;
    private Pessoa pessoa;
    private Calculador cal;
    private int diaN, mesN, anoN;
    private String txtNome;
    private double altura;
    

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.cal = new Calculador();
    }

    public void printTUI(){
        System.out.println("Digite seu nome: ");
        setTxtNome(scanner.nextLine());
        System.out.println("Digite seu dia de nascimento: ");
        setDiaN(scanner.nextInt());
        System.out.println("Digite seu mes de nascimento: ");
        setMesN(scanner.nextInt());
        System.out.println("Digite ano de nascimento: ");
        setAnoN(scanner.nextInt());
        System.out.println("Digite sua altura: ");
        setAltura(scanner.nextDouble());
    }

    public void solve(){
        pessoa = new Pessoa(txtNome,diaN,mesN,anoN,altura);
        pessoa.setIdade(cal.CalculoIdade(pessoa));
    }

    public void printResults(){
        System.out.println(pessoa);
    }

    public void tui(){
        printTUI();
        solve();
        printResults();
    }

    public Scanner getScanner(){
        return this.scanner;
    }
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }
    public int getDiaN(){
        return this.diaN;
    }
    public void setDiaN(int diaN){
        this.diaN = diaN;
    }
    public int getMesN(){
        return this.mesN;
    }
    public void setMesN(int mesN){
        this.mesN = mesN;
    }
    public int getAnoN(){
        return this.anoN;
    }
    public void setAnoN(int anoN){
        this.anoN = anoN;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public String getTxtNome(){
        return this.txtNome;
    }
    public void setTxtNome(String nome){
        this.txtNome = nome;
    }
}
