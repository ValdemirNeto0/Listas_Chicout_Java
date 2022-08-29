public class Pessoa {
    private int genero;
    private double altura;

    public Pessoa(){
        this.genero = 1;
        this.altura = 1.65;
    }
    public Pessoa(int genero, double altura){
        this.genero = genero;
        this.altura = altura;
    }

    @Override
    public String toString(){
        if(getGenero() == 1){
            return "Genero: Masculino   Altura: "+getAltura();
        }else{
            return "Genero: Feminino   Altura: "+getAltura();
        }
    }

    public int getGenero(){
        return this.genero;
    }
    public void setGenero(int genero){
        this.genero = genero;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setGenero(double altura){
        this.altura = altura;
    }
}
