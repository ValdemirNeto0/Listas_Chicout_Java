public class Advinhador {
    private GeradorNumero gerador;
    private int num = 0, ultimatentativa = 0, sitcor = 0;

    public Advinhador() {
        setGeradorNumero(new GeradorNumero());
        getGeradorNumero().setNum();
    }

    public String situacao() {
        int now = 0, before = 0;
        now = getNum() - getGeradorNumero().getNum();
        before = getUltimatentativa() - getGeradorNumero().getNum();
        if (getNum() == getGeradorNumero().getNum()) {
            setUltimatentativa(getNum());
            setSitcor(1);
            return "Correto!";
        } else if (Math.abs(now) < Math.abs(before)) {
            setUltimatentativa(getNum());
            setSitcor(2);
            return "Mais perto!";
        } else if (Math.abs(now) > Math.abs(before)) {
            setUltimatentativa(getNum());
            setSitcor(3);
            return "Mais longe!";
        }
        return null;
    }

    public GeradorNumero getGeradorNumero() {
        return gerador;
    }

    public void setGeradorNumero(GeradorNumero gerador) {
        this.gerador = gerador;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getUltimatentativa() {
        return ultimatentativa;
    }
    public void setUltimatentativa(int ultimatentativa) {
        this.ultimatentativa = ultimatentativa;
    }

    public int getSitcor() {
        return sitcor;
    }
    public void setSitcor(int sitcor) {
        this.sitcor = sitcor;
    }
}
