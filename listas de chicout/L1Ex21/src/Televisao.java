public class Televisao {
    private int volume, canal;

    public Televisao(){
        this.volume = 0;
        this.canal = 0;
    }
    public Televisao(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString(){
        return "Canal: "+getCanal()+" Volume: "+getVolume();
    }
}
