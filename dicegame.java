import java.util.Random;
import java.util.Scanner;

public class dicegame{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name? ");
	String c = sc.nextLine();
	System.out.println("Hello, " + c + "!");
	System.out.println("Rolling dice...");

	Random random = new Random();

	int a = random.nextInt(6) + 1;
	int b = random.nextInt(6) + 1;

	System.out.println("Die 1: " + a);
	System.out.println("Die 2: " + b);
	System.out.println("Total value: " + (a + b));


	    if(7 < (a + b)){
	    System.out.println(c +  " won!");
	}
	else{
	    System.out.println(c +  " lost.");
	}
	sc.close();
    }
}
