import java.util.Scanner;

public class DQuatre
{
	public static void main(String[] args) 
	{
		//variables
		int taille;
		int[][] tab;
		int i, j;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Affichage d'une matrice carree avec diagonales modifiees");
		System.out.println("--------------------------------------------------------");
		System.out.println("Le programme va afficher une matrice carree.");
		System.out.println("Les valeurs de la premiere diagonale seront initialisees a 1, celles de la deuxieme a 2.");
		System.out.println("Le reste des cases sera initialise a 0.");
		System.out.print("Entrez la taille du carre : ");
		taille = sc.nextInt();

		tab = new int[taille][taille]; //on initialise le tableau maintenant qu'on connait la taille

		//initialisation de toutes les cases a 1
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				tab[i][j] = 0;
		}

		//passage des diagonales
		for(i = 0; i < taille; i++)
		{
			tab[i][i] = 1;
			tab[taille-i-1][i] = 2;
		}

		//affichage
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				System.out.print(tab[i][j]+" ");

			System.out.println("");
		}
	}
}