import java.util.Scanner;

public class DQuatre
{
	public static void main(String[] args) 
	{
		//variables
		int i, input;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Table de multiplication");
		System.out.println("-----------------------");
		System.out.println("Entrez un nombre, sa table de multiplication (1-10) vous sera rendue.");
		System.out.print("Entrez un nombre : ");
		input = sc.nextInt();

		//affichage
		for (i = 1; i<=10; i++) 
			System.out.println(input+"*"+i+"="+input*i);
	}
}