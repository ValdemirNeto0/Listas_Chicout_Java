public class IntervaloTempo {
    private int Minimo, Maximo;

    public IntervaloTempo(){
        super();
        this.Minimo = 0;
        this.Maximo = 2;
    }

    public IntervaloTempo(int x, int y){
        super();
        this.Minimo = x;
        this.Maximo = y;
    }

    @Override
    public String toString(){
        return "Minimo: "+this.Minimo+" Maximo: "+this.Maximo;
    }

    public int getMinimo(){
        return this.Minimo;
    }
    public void setMinimo(int x){
        this.Minimo = x;
    }
    public int getMaximo(){
        return this.Maximo;
    }
    public void setMaximo(int x){
        this.Maximo = x;
    }
}
