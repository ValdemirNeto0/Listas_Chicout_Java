import java.util.Scanner;
public class TUI {
    private int txtQuantFunc;
    private Scanner scanner;
    public Funcionario funcionarios[];
    public Contador cont;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.cont = new Contador();
    }

    public void printTUI(){
        System.out.println("Digite a quantidade de funcionarios: ");
        setTxtQuantFunc(scanner.nextInt());
    }

    public void solve(){
        Funcionario funcionarios[] = new Funcionario[txtQuantFunc];
        cont.PopularPrintar(funcionarios);
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setTxtQuantFunc(int x){
        this.txtQuantFunc = x;
    }
    public int getTxtTemperatura(){
        return this.txtQuantFunc;
    }

    public void setFunc(int x){
        this.funcionarios = new Funcionario[x];
    }
    public Funcionario[] getSenha(){
        return this.funcionarios;
    }
}
