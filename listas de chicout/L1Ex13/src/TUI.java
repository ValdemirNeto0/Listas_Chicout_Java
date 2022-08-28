import java.util.Scanner;
public class TUI {
    private int txtV1,txtV2;
    private Scanner scanner;
    private IntervaloTempo intervalo;
    private Contador contador;

    public TUI(){
        this.scanner = new Scanner(System.in);
        this.contador = new Contador();
    }

    public void printTUI(){
        System.out.println("Digite o valor  minimo do intervalo: ");
        setTxtV1(scanner.nextInt());
        System.out.println("Digite o valor  maximo do intervalo: ");
        setTxtV2(scanner.nextInt());
        this.intervalo = new IntervaloTempo(txtV1, txtV2);
    }

    public void solve(){
        contador.Contar(intervalo);
    }

    public void tui(){
        printTUI();
        solve();
    }

    public void setTxtV1(int v1){
        this.txtV1 = v1;
    }
    public int getTxtV1(){
        return this.txtV1;
    }
    public void setTxtV2(int v2){
        this.txtV2 = v2;
    }
    public int getTxtV2(){
        return this.txtV2;
    }
    public void setIntervalo(IntervaloTempo intervalo){
        this.intervalo = intervalo;
    }
    public IntervaloTempo Intervalo(){
        return this.intervalo;
    }
}
