public class Conversor {
    private Temperatura temperatura;

    public void Conversoes(Temperatura temperatura){
        System.out.println("Temperatura em:\nCelcius: "+temperatura.getValor()+"\nKelvin: "+(temperatura.getValor()+273.15)+
        "\nRéaumur: "+(temperatura.getValor()*0.8)+"\nRankine: "+(temperatura.getValor()+459.67)+"\nFahrenheit: "+
        (temperatura.getValor()*1.8+32.0));
    }

    public Temperatura getTemeperatura(){
        return this.temperatura;
    }
    public void setTentativas(Temperatura x){
        this.temperatura = x;
    }
}
