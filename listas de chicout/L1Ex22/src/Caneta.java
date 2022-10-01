public class Caneta {
    String marca, cor;
    double tamanho;

    public Caneta(){
        this.marca = "Bic";
        this.cor = "Azul";
        this.tamanho = 0.2;
    }
    public Caneta(String marca, String cor, double tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Marca: "+getMarca()+" Cor: "+getCor()+" Tamanho: "+getTamanho();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    
}
