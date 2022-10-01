public class Ponto3D {
    private double x,y,z;

    public Ponto3D(double x, double y, double z){
        super();setX(x);setY(y);setZ(z);
    }
    public Ponto3D(){
        super();setX(0);setY(0);setZ(0);
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + ", z=" + z +"]";
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
}
