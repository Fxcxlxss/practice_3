package lab3;
import java.util.Random;
import java.lang.Math;

public class lab31 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        double[] arrRandom = new double[a];
        double[] arrMath = new double[a];

        System.out.println("By Random");
        for (int i = 0; i < a; i++) {
            arrRandom[i] = rand.nextDouble(10);
            System.out.println(arrRandom[i]);
        }

        System.out.println("\nBy Math");
        for (int i = 0; i < a; i++) {
            arrMath[i] = Math.random();
            System.out.println(arrMath[i]);
        }
    }
}
