public class Apolice {
    private String nomeDoSegurado;
    private int idade;
    private double valorPremio;

    public String toString(){
        return "Nome do Segurado: "+getNomeDoSegurado()+" Idade: "+getIdade()+" Valor do Premio: "+getValorPremio();
    }

    public Apolice(){
        this.nomeDoSegurado = "Fulano";
        this.idade = 18;
        this.valorPremio = 1000;
    }
    public Apolice(String nome, int idade, double valorPremio){
        this.nomeDoSegurado = nome;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public void calcularPremioApolice(){
        if(idade >=18 && idade <= 25){
            valorPremio+=(valorPremio*20)/100;
        }else if(idade > 25 && idade <= 36){
            valorPremio+=(valorPremio*15)/100;
        }else if(idade > 36){
            valorPremio+=(valorPremio*10)/100;
        }
    }

    public void oferecerDesconto(String cidade){
        switch(cidade){
            case "Curitiba":valorPremio -= (valorPremio*20)/100;break;
            case "Rio de Janeiro":valorPremio -= (valorPremio*15)/100;break;
            case "Sao Paulo":valorPremio -= (valorPremio*10)/100;break;
            case "Belo Horizonte":valorPremio -= (valorPremio*5)/100;break;
            default:System.out.println("Cidade nao encontrada!");break;
        }
    }

    public String getNomeDoSegurado(){
        return nomeDoSegurado;
    }
    public void setNomeDoSegurado(String nome){
        this.nomeDoSegurado = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getValorPremio(){
        return valorPremio;
    }
    public void setValorPremio(double valorPremio){
        this.valorPremio = valorPremio;
    }
}
