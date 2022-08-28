import java.util.Scanner;
public class Contador {
    private Scanner scanner = new Scanner(System.in);
    private String  txtnome;
    private float txtsalario;

    public void PopularPrintar(Funcionario[] func){
        for(int n=0; n<func.length; n++){
            System.out.println("Digite o nome do funcionario: ");
            txtnome = scanner.nextLine();
            System.out.println("Digite o salario do funcionario: ");
            txtsalario = scanner.nextFloat();
            func[n] = new Funcionario(txtnome, txtsalario);
        }
        for(int n=0; n<func.length; n++){
            System.out.println(func[n]);
        }
    }

    public String getTxtNome(){
        return txtnome;
    }
    public void setTxtNome(String x){
        this.txtnome = x;
    }
    public float getTxtSalario(){
        return txtsalario;
    }
    public void setTxtSalario(float x){
        this.txtsalario = x;
    }
}
