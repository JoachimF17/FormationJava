import java.util.Scanner;
import java.lang.Math;

public class ECinq
{
	public static void main(String[] args) 
	{
		//variables
		int lignes, colonnes, max, min, somme, i, j;
		int[][] tab;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul lignes et colonnes");
		System.out.println("-------------------------");
		System.out.println("On va vous afficher le max, min, moyenne de chaque ligne et colonne d'une matrice.");

		System.out.print("Entrez le nombre de lignes : ");
		lignes = sc.nextInt();
		System.out.print("Entrez le nombre de colonnes : ");
		colonnes = sc.nextInt();

		tab = new int[lignes][colonnes];

		//initialisation de toutes les cases a 1
		for(i = 0; i < lignes; i++)
		{
			for(j = 0; j < colonnes; j++)
				tab[i][j] = (int) (Math.random() * 100)+1;
		}

		//affichage de la matrice + affichage max/min/moyenne sur la meme ligne
		for(i = 0; i < lignes; i++)
		{
			max = tab[i][0];
			min = tab[i][0];
			somme = 0;

			for(j = 0; j < colonnes; j++)
			{
				System.out.print(tab[i][j]+" ");
				somme += tab[i][j];

				if(tab[i][j] > max)
					max = tab[i][j];
				else if(tab[i][j] < min)
					min = tab[i][j];
			}

			System.out.println(" ; max = "+max+" ; min = "+min+" ; moyenne = "+((float)somme / (float)colonnes)+" ");
		}

		for(i = 0; i < colonnes; i++)
		{
			max = tab[0][i];
			min = tab[0][i];
			somme = 0;

			for(j = 0; j < lignes; j++)
			{
				somme += tab[j][i];

				if(tab[j][i] > max)
					max = tab[j][i];
				else if(tab[j][i] < min)
					min = tab[j][i];
			}

			System.out.println("Colonne "+(i+1)+" : max = "+max+" ; min = "+min+" ; moyenne = "+((float)somme / (float)lignes)+" ");
		}
	}
}