public class Temperatura {
    private float valor;

    public Temperatura(){
        super();
        this.valor = 0;
    }

    public Temperatura(float x){
        super();
        this.valor = x;
    }

    @Override
    public String toString(){
        return "Temperatura: "+getValor();
    }

    public float getValor(){
        return this.valor;
    }
    public void setValor(float x){
        this.valor = x;
    }
}
