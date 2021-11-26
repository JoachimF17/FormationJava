import java.util.Scanner;
import java.lang.Math;

class FSix
{
	public static void main(String[] args) 
	{
		//variables
		int i, j, taille;
		int[][] tab;
		int[][] tab2;
		int[][] tabCompare;
		//objets
		Scanner sc = new Scanner(System.in);
		//programme
		System.out.println("Calcul sur deux matrices carrees");
		System.out.println("--------------------------------");
		System.out.println("Choisissez la taille d'une matrice, le programme va generer 2 matrices carrees de cette taille.");
		System.out.println("Il vous rendra ensuite les additions, soustractions et multiplications de chaque case.");
		
		System.out.print("Entrez la taille de la matrice : ");
		taille = sc.nextInt();
		
		//on passe la taille dans les differentes tableaux
		tab = new int[taille][taille];
		tab2 = new int[taille][taille];
		tabCompare = new int[taille][taille];
		
		//on genere les nombres aleatoires dans les matrices
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
			{
				tab[i][j] = (int) (Math.random() * 100)+1;
				tab2[i][j] = (int) (Math.random() * 100)+1;
			}
		}
		
		//affichage premiere matrice
		System.out.println("Premiere matrice : ");
		
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				System.out.print(tab[i][j]+" ");

			System.out.println("");
		}
		
		//affichage deuxieme matrice
		System.out.println("Deuxieme matrice : ");
		
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				System.out.print(tab2[i][j]+" ");

			System.out.println("");
		}
		
		//addition des deux matrices
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				tabCompare[i][j] = tab[i][j] + tab2[i][j];
		}
		
		//affichage addition
		System.out.println("Addition : ");
		
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				System.out.print(tabCompare[i][j]+" ");

			System.out.println("");
		}
		
		//soustraction des deux matrices
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				tabCompare[i][j] = tab[i][j] - tab2[i][j];
		}
		
		//affichage soustraction
		System.out.println("Soustraction : ");
		
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				System.out.print(tabCompare[i][j]+" ");

			System.out.println("");
		}
		
		//multiplication des deux matrices
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				tabCompare[i][j] = tab[i][j] * tab2[i][j];
		}
		
		//affichage multiplication
		System.out.println("Multiplication : ");
		
		for(i = 0; i < taille; i++)
		{
			for(j = 0; j < taille; j++)
				System.out.print(tabCompare[i][j]+" ");

			System.out.println("");
		}
	}
}