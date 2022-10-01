public class ControleRemoto{
    private Televisao tv;

    public ControleRemoto(){
        this.tv = new Televisao();
    }
    public ControleRemoto(int canal, int volume){
        this.tv = new Televisao(volume, canal);
    }

    public void aumentarVolume(){
        tv.setVolume(tv.getVolume()+1);
    }
    public void diminuirVolume(){
        tv.setVolume(tv.getVolume()-1);
    }

    public void aumentarCanal(){
        tv.setCanal(tv.getCanal()+1);
    }
    public void diminuirCanal(){
        tv.setCanal(tv.getCanal()-1);
    }
    public void escolherCanal(int canal){
        tv.setCanal(canal);
    }

    public void statusTv(){
        System.out.println(tv);
    }
}
