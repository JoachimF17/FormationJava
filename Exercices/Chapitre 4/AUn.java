import java.util.Scanner;

public class AUn
{
	public static void main(String[] args)
	{
		//variables
		float input;
		int inputToInt;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.print("Entrez un nombre entier entre 0 et 4 : ");
		input = sc.nextFloat(); //float pour eviter un crash si on entre un chiffre a virgule dans un nextInt()

		//boucle de verification
		while(input<0 || input>4 || input%1 != 0)
		{
			System.out.print("Mauvais chiffre, entrez un nombre entier entre 0 et 4 : ");
			input = sc.nextFloat();
		}

		inputToInt = (int) input; // on passe le resultat en int pour l'affichage (4 au lieu de 4.0)
		System.out.print("Vous avez entré "+inputToInt+" ce qui repond aux conditions de ce programme. Au revoir !");
	}
}