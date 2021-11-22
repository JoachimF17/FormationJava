import java.util.Scanner;

public class DQuatre
{
	public static void main(String[] args)
	{
		//variables
		int input;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Pair ou impair ?");
		System.out.println("----------------");
		System.out.println("Entrez un nombre entier, le programme vous dira s'il est pair ou impair.");
		System.out.print("Entrez un nombre entier : ");

		input = sc.nextInt();

		if(input%2 == 0)
		{
			System.out.println(input+" est un nombre pair !");
		}else
		{
			System.out.println(input+" est un nombre impair !");
		}
	}
}