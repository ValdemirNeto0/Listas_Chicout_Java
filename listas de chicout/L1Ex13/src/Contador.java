public class Contador {
    private int soma=0, quantNum=0, quantNumImpares=0;

    public void Contar(IntervaloTempo intervalo){
        if(intervalo.getMinimo() < intervalo.getMaximo()){
            for(int x=intervalo.getMinimo(); x<=intervalo.getMaximo(); x++){
                soma += x;
                quantNum += 1;
                if(x%2 == 1){
                    quantNumImpares +=1;
                    System.out.println("Impar!");
                } else{
                    System.out.println("Par!");
                }
            }
        }
        System.out.println("Soma dos valores: "+getSoma()+" Quantida de numeros: "+getQuantNum()+" Quantidade de Impares: "+getQuantNumImpares());
    }

    public int getSoma(){
        return this.soma;
    }
    public void setSoma(int x){
        this.soma = x;
    }
    public int getQuantNum(){
        return this.quantNum;
    }
    public void setQuantNum(int x){
        this.quantNum = x;
    }
    public int getQuantNumImpares(){
        return this.quantNumImpares;
    }
    public void setQuantNumImpares(int x){
        this.quantNumImpares = x;
    }
}
