public class App {
    public static void main(String[] args) throws Exception {
        Ponto3D p1 = new Ponto3D(), p2 = new Ponto3D(2, 3, 4);
        System.out.println("Dados os pontos 1: "+p1+ " e o ponto 2: "+p2);
        System.out.println("Distancia entre  os pontos: "+GeometryUtils.distanciaEntrePontos(p1, p2));
    }
}