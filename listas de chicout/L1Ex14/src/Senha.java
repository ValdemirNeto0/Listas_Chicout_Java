public class Senha {
    private int valor;

    public Senha(){
        super();
        this.valor = 0;
    }

    public Senha(int x){
        super();
        this.valor = x;
    }

    @Override
    public String toString(){
        return "Senha: "+getSenha();
    }

    public int getSenha(){
        return this.valor;
    }
    public void setSenha(int x){
        this.valor = x;
    }
}
