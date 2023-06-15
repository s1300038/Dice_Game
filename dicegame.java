import java.util.Random;

public class dicegame{
    public static void main(String[] args){
	System.out.println("Rolling dice...");

	Random random = new Random();

	int a = random.nextInt(6) + 1;
	int b = random.nextInt(6) + 1;
	int d = a + b;

	System.out.println("Die 1: " + a);
	System.out.println("Die 2: " + b);
	System.out.println("Total value: " + d);
    }
}
