import java.util.Scanner;
public class TUI {
    private Scanner scanner;
    public Pessoa pessoas[];
    public Calculador cal;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.cal = new Calculador();
    }

    public void printTUI(){
    }

    public void solve(){
        pessoas = new Pessoa[4];
        cal.Calculo(pessoas);
    }

    public void tui(){
        printTUI();
        solve();
    }

    public Scanner getScanner(){
        return this.scanner;
    }
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }
}
