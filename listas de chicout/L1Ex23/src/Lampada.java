public class Lampada {
    private String tipo, cor, marca;
    private double voltagem, preco, potencia;
    private boolean status;
    @Override
    public String toString(){
        return "Tipo: "+getTipo()+" Cor: "+getCor()+" Marca: "+getMarca()+" Voltagem: "+getVoltagem()
        +" Preco: "+getPreco()+" Potencia: "+getPotencia()+" Status: "+isStatus();
    }
    public Lampada(){
        this.tipo = "Led";
        this.cor = "Amarela";
        this.marca = "Lorenzetti";
        this.voltagem = 110;
        this.preco = 30.0;
        this.potencia = 35;
        this.status = false;
    }
    public Lampada(String tipo, String cor, String marca, double voltagem, double preco, double potencia){
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
        this.potencia = potencia;
        this.status = false;
    }

    public void acender(){
        setStatus(true);
    }
    public void apagar(){
        setStatus(false);
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
