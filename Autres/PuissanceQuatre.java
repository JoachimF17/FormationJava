import java.util.Scanner;

public class PuissanceQuatre
{
	public static void main(String[] args) 
	{
		//variables
		int inputToInt, i, j;
		float input;
		boolean victoire = false;
		boolean draw = false;
		int rouge = 0;
		int tab[][] = new int[6][7];
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
				tab[i][j] = -1; //initialise a -1 et on entrera 0 (jaune) ou 1 (rouge) en jouant
		}

		//boucle qui tourne tant qu'on n'a pas gagne ou pas partie nulle
		while(!victoire && !draw)
		{
			grille(tab);
			
			/* La variable "rouge" peut prendre 2 valeurs, 0 ou 1
			 * Lorsqu'elle vaut 1, c'est le tour de Rouge de jouer. Si 0, tour de Jaune.
			 * On la switch d'office a chaque tour de boucle */
			
			if(rouge == 1)
			{
				rouge--;
				System.out.println("Au tour de Jaune de jouer");
			}
			else
			{
				rouge++;
				System.out.println("Au tour de Rouge de jouer");
			}

			do //boucle de verification de saisie
			{
				System.out.print("Entrez le numero de la colonne : ");
				input = sc.nextFloat(); //float au cas ou il fait le guignol
				inputToInt = (int) input;
			}while(inputToInt < 1 || inputToInt > 7 || tab[0][inputToInt-1] >= 0);
			
			for(i = 0; i < 6; i++)
			{
				if(i < 5 && tab[i+1][inputToInt-1] >= 0)
				{
					tab[i][inputToInt-1] = rouge;
					i = 6;
				}
				else if(i == 5)
					tab[5][inputToInt-1] = rouge;
			}
			
			//on check la condition de victoire en faisant appel a la fonction
			victoire = conditionsDeVictoire(tab);
			
			//on passe draw a true pour faciliter la verification
			draw = true;
			
			//verif de partie nulle, la variable sera false des qu'on ne trouve pas de jeton en haut du tableau (index i 0)
			for(i = 0; i < 7 && draw; i++)
			{
				if(tab[0][i] == -1)
					draw = false;
			}
		}
		//sortie de boucle
		
		grille(tab);
		
		//check pour voir qui a gagne (ou nulle)
		if(draw)
			System.out.println("Partie nulle !");
		else if(rouge == 1) //si on a fini sur un pion rouge, d'office victoire de rouge
			System.out.println("Victoire de Rouge !");
		else
			System.out.println("Victoire de Jaune !");
		
		System.out.println("\n\n");
	}

	//fonction d'affichage du tableau
	public static void grille(int[][] tab)
	{
		//variables locales
		int i, j;

		System.out.println("\n\n");

		for (i = 0;i<6 ; i++) 
		{
			for(j = 0; j<7; j++)
			{
				if(tab[i][j] == -1)
					System.out.print("|   ");
				else if(tab[i][j] == 0)
					System.out.print("| J ");
				else
					System.out.print("| R ");
			}

			System.out.println("|");
		}
		
		//pour la mise en style
		System.out.println("|---|---|---|---|---|---|---|");
		System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
		System.out.println("|___|___|___|___|___|___|___|");
	}
	
	//check des conditions de victoire
	public static boolean conditionsDeVictoire(int[][] tab)
	{
		boolean check = false;
		int i, j;
		
		//check vertical
		for(i = 0; i < 7 && !check; i++)
		{
			for(j = 0; j < 3; j++)
			{
				if(tab[j][i] >= 0 && tab[j][i] == tab[j+1][i] && tab[j][i] == tab[j+2][i] && tab[j][i] == tab[j+3][i])
					check = true;
			}
		}
		
		//check horizontal
		for(i = 0; i < 6 && !check; i++)
		{
			for(j = 0; j < 4; j++)
			{
				if(tab[i][j] >= 0 && tab[i][j] == tab[i][j+1] && tab[i][j] == tab[i][j+2] && tab[i][j] == tab[i][j+3])
					check = true;
			}
		}
		
		//check oblique
		for(i = 0; i < 3 && !check; i++)
		{
			for(j = 0; j < 4; j++)
			{
				if(tab[i][j] >= 0 && tab[i][j] == tab[i+1][j+1] && tab[i][j] == tab[i+2][j+2] && tab[i][j] == tab[i+3][j+3])
					check = true; //sens haut-gauche -> bas-droite
				if(tab[i][6-j] >= 0 && tab[i][6-j] == tab[i+1][6-j-1] && tab[i][6-j] == tab[i+2][6-j-2] && tab[i][6-j] == tab[i+3][6-j-3])
					check = true; //sens haut-droite -> bas-gauche
			}
		}
				
		return check;
	}
}







































