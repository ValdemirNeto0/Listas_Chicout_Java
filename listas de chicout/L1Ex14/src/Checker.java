import java.util.Scanner;
public class Checker {
    private int tentativas, ValorDigitado, JogarNovamente;
    private Scanner scanner;

    public Checker(){
        this.scanner = new Scanner(System.in);
        this.tentativas = 5;
    }

    public int Checkar(Senha senha){
        if(senha.getSenha() > 100 || senha.getSenha() < 0){
            System.out.println("A senha digitada nao faz parte do intervalo permitido!");
            return 1;
        }else{
            if(tentativas > 0){
                System.out.println("Chute a senha: ");
                setValorDigitado(scanner.nextInt());
                if(getValorDigitado()+1 == senha.getSenha() || getValorDigitado()-1 == senha.getSenha()){
                    System.out.println("TA QUENTE!!!");
                    setTentativas(1);
                    Checkar(senha);
                    return 1;
                }else{
                    if(getValorDigitado() > senha.getSenha()){
                        System.out.println("Valor digitado eh maior que a senha!");
                        tentativas -= 1;
                        Checkar(senha);
                        return 1;
                    }else if(getValorDigitado() < senha.getSenha()){
                        System.out.println("Valor digitado eh menor que a senha!");
                        tentativas -= 1;
                        Checkar(senha);
                        return 1;
                    }else{
                        System.out.println("Voce Acertou a senha!!!\n\nDeseja jogar novamente?");
                        setJogarNovamente(scanner.nextInt());
                        if(this.JogarNovamente == 1){
                            Checker checker = new Checker();
                            checker.Checkar(senha);
                            return 1;
                        }else{
                            return 1;
                        }
                    }
                }
            }else{
                System.out.println("Voce perdeu, tente novamente depois!\n\nDeseja jogar novamente?");
                setJogarNovamente(scanner.nextInt());
                if(this.JogarNovamente == 1){
                    Checker checker = new Checker();
                    checker.Checkar(senha);
                    return 1;
                }else{
                    return 1;
                }
            }
        }
    }

    public int getTentativas(){
        return this.tentativas;
    }
    public void setTentativas(int x){
        this.tentativas = x;
    }
    public int getValorDigitado(){
        return this.ValorDigitado;
    }
    public void setValorDigitado(int x){
        this.ValorDigitado = x;
    }
    public int getJogarNovamente(){
        return this.JogarNovamente;
    }
    public void setJogarNovamente(int x){
        this.JogarNovamente = x;
    }
}
