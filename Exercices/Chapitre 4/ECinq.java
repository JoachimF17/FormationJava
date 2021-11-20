import java.util.Scanner;

public class ECinq
{
	public static void main(String[] args)
	{
		//variables
		float input;
		int inputToInt, facto = 1, i = 0;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul de la factorielle d'un nombre");
		System.out.println("------------------------------------");
		System.out.println("Entrez un nombre entier positif, le programme vous donnera sa factorielle");
		System.out.print("Entrez un entier positif : ");
		input = sc.nextFloat(); //input en tant que float au cas ou il entre un nombre a virgule

		//boucle pour s'assurer qu'il entre un entier positif
		while(input < 0 || input%1 != 0)
		{
			System.out.print("Entrez un entier positif : ");
			input = sc.nextFloat();
		}

		inputToInt = (int) input; //on passe l'input en int pour le calcul

		//boucle de calcul
		while(i < input)
		{
			i++;
			facto *= i;
		}

		//affichage de fin de programme
		System.out.println("La factorielle de "+inputToInt+" est "+facto);
	}
}