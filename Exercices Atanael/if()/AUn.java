import java.util.Scanner;

public class AUn
{
	public static void main(String[] args)
	{
		//variables
		int input;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Jour de la semaine");
		System.out.println("------------------");
		System.out.println("Entrez un chiffre de 1 a 7, le jour de la semaine correspondant vous sera rendu.");
		System.out.print("Entrez un chiffre : ");
		input = sc.nextInt();

		switch(input)
		{
			case 1:
				System.out.println("Nous sommes lundi");			
				break;
			case 2:
				System.out.println("Nous sommes mardi");
				break;
			case 3:
				System.out.println("Nous sommes mercredi");
				break;
			case 4:
				System.out.println("Nous sommes jeudi");
				break;
			case 5:
				System.out.println("Nous sommes vendredi");
				break;
			case 6:
				System.out.println("Nous sommes samedi");
				break;
			case 7:
				System.out.println("Nous sommes dimanche");			
				break;
			default:
				System.out.println("Input invalide");
				break;
		}
	}
}