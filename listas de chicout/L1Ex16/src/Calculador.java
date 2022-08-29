import java.util.Scanner;
public class Calculador {
    private double MaiorAltura, MenorAltura, MediaAlturaH, txtAltura;
    private int contH, contM, txtGenero;
    private Scanner scanner;

    public void Calculo(Pessoa[] pessoas){
        this.scanner = new Scanner(System.in);
        MaiorAltura = 0;
        MenorAltura = 999;
        MediaAlturaH = 0;
        contH = 0;
        contM = 0;
        for(int x=0; x<pessoas.length; x++){
            System.out.println("Digite o genero (1-M 2-F): ");
            setTxtGenero(scanner.nextInt());
            System.out.println("Digite a altura: ");
            setTxtAltura(scanner.nextFloat());
            pessoas[x]  = new Pessoa(txtGenero,txtAltura);
            if(pessoas[x].getAltura() > MaiorAltura){
                MaiorAltura = pessoas[x].getAltura();
            }
            if(pessoas[x].getAltura() < MenorAltura){
                MenorAltura = pessoas[x].getAltura();
            }
            if(pessoas[x].getGenero() == 1){
                contH += 1;
                MediaAlturaH += pessoas[x].getAltura();
            }else{{
                contM += 1;
            }}
        }
        System.out.println("Maior Altura: "+(float)getMaiorAltura()+" Menor Altura: "+(float)getMenorAltura()+" Media das Alturas: "+
        (float)(getMediaAlturaH()/contH)+" Numero de Mulheres: "+getContM());
    }

    public double getMaiorAltura(){
        return this.MaiorAltura;
    }
    public void setMaiorAltura(double x){
        this.MaiorAltura = x;
    }
    public double getMenorAltura(){
        return this.MenorAltura;
    }
    public void setMenorAltura(double x){
        this.MenorAltura = x;
    }
    public double getMediaAlturaH(){
        return this.MediaAlturaH;
    }
    public void setMediaAlturaH(double x){
        this.MediaAlturaH = x;
    }
    public int getContH(){
        return this.contH;
    }
    public void setContH(int x){
        this.contH = x;
    }
    public int getContM(){
        return this.contM;
    }
    public void setContM(int x){
        this.contM = x;
    }
    public int getTxtGenero(){
        return this.txtGenero;
    }
    public void setTxtGenero(int x){
        this.txtGenero = x;
    }
    public double getTxtAltura(){
        return this.txtAltura;
    }
    public void setTxtAltura(double x){
        this.txtAltura = x;
    }
}
