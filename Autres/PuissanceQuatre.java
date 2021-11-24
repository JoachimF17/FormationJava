import java.util.Scanner;

public class PuissanceQuatre
{
	public static void main(String[] args) 
	{
		//variables
		int input, i, j;
		boolean victoire = false;
		char tableau[][] = new char[6][7];
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Bienvenue dans ce Puissance 4 !");
		System.out.println("-------------------------------");
		System.out.println("Le jeu est simple, vous devez aligner 4 jetons de la meme couleur.");
		System.out.println("Vous pouvez les aligner horizontalement, verticalement ou en diagonale.");
		System.out.println("Entrez simplement le numero de la colonne dans laquelle vous voulez glisser le jeton au moment ou ce sera votre tour.");

		//initialisation du tableau
		for (i = 0;i<6 ; i++) 
		{
			for(j = 0; j<7; j++)
				tableau[i][j] = ' ';
		}

		//boucle qui tourne tant qu'on n'a pas gagne
		while(!victoire)
		{
			grille(tableau);

			System.out.print("Entrez le numero de la colonne : ");
			input = sc.nextInt();

			victoire = true;
		}
	}

	public static void grille(char[][] tab)
	{
		//variables locales
		int i, j;

		System.out.println("\n\n");

		for (i = 0;i<6 ; i++) 
		{
			for(j = 0; j<7; j++)
				System.out.print("| "+tab[i][j]+" ");

			System.out.println("|");
		}

		System.out.println("|---|---|---|---|---|---|---|");
		System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
		System.out.println("|___|___|___|___|___|___|___|");
	}
}