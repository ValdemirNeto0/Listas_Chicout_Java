import java.util.Scanner;
public class TUI {
    private int txtSenha;
    private Scanner scanner;
    private Senha senha;
    private Checker checker;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.checker = new Checker();
    }

    public void printTUI(){
        System.out.println("Digite a senha (Considere um valor entre 0 e 100): ");
        setTxtSenha(scanner.nextInt());
    }

    public void solve(){
        this.senha = new Senha(txtSenha);
        checker.Checkar(senha);
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setTxtSenha(int v1){
        this.txtSenha = v1;
    }
    public int getTxtSenha(){
        return this.txtSenha;
    }

    public void setSenha(Senha senha){
        this.senha = senha;
    }
    public Senha getSenha(){
        return this.senha;
    }
}
