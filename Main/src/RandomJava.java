import java.util.Random;

public class RandomJava {

    public static void main(String[] args) throws Exception {
        
        Random Random = new Random();

        int x = Random.nextInt();
        boolean y = Random.nextBoolean();
        double z = Random.nextDouble();
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
