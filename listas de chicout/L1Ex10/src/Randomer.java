public class Randomer {
    public static int randInt(int min, int max){
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max-min)+1, min);
        return randomNum;
    }
}
