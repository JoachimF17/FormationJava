import java.util.Scanner;
import java.lang.Math;

public class CTrois
{
	public static void main(String[] args)
	{
		//variables
		final int MAX = 100;
		final int MIN = 1;
		float input;
		int rand;
		boolean trouve = false;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Bienvenue dans ce jeu de decouverte d'un nombre");
		System.out.println("-----------------------------------------------");
		System.out.println("Entrez un nombre entier au clavier compris entre "+MIN+" et "+MAX+
							" et le programme vous indiquera si le nombre recherche est plus petit ou plus grand.");
		
		/* Initialisation du chiffre aleatoire
		 * La fonction Math.random() renvoie un float entre 0 et 1 (non compris), on multiplie donc par 100 ((MAX-MIN)+1) pour
		 * 		renvoyer un chiffre entre 0 et 99
		 * On utilise ensuie le (int) pour passer en int et "+ MIN" (donc + 1) pour passer de 0-99 a 1-100
		*/
		rand = MIN + (int)(Math.random() * ((MAX - MIN)+1));

		do
		{
			do //verification que le nombre est entier
			{
				System.out.print("Entrez un nombre entier entre "+MIN+" et "+MAX+" : ");
				input = sc.nextFloat();
			}while(input%1 != 0);

			//condition de victoire
			if(input == rand)
			{
				System.out.println("C'est gagne, le chiffre etait bien "+rand);
				trouve = true;
			}else
			{
				if(input>rand) //plus petit ou plus grand
					System.out.println("Le nombre recherche est plus petit");
				else
					System.out.println("Le nombre recherche est plus grand");				
			}
		}while(!trouve);
	}
}