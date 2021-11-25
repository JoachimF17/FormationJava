import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args) 
	{
		//variables
		int i, flag = 0;
		//objets
		Scanner sc = new Scanner(System.in);
		String[] s =  {"Bonjour", "Exercice", "Intervalle", "Tableau", "String", 
						"Programme", "Maximum", "Valeur", "Dimension", "Addition"};
		String compare = new String();

		//programme
		System.out.println("Recherche de texte");
		System.out.println("------------------");
		System.out.println("Entrez un mot, le programme verifie s'il se trouve dans la base de donnees");

		System.out.print("Entrez un mot : ");
		compare = sc.nextLine();

		compare = compare.trim(); //on supprime les espaces avant et apres par securite
		compare = compare.toLowerCase(); //on passe tout en minuscules, toujours par securite

		//boucle de comparaison
		for(i = 0; i<10 && flag == 0; i++)
		{
			s[i] = s[i].toLowerCase(); //on passe en minuscules pour la comparaison

			if(compare.equals(s[i])) //comparaison
				flag++; //si le flag augmente on sort de force de la boucle
		}

		//affichage
		if(flag == 0) //check du flag
			System.out.println("Le mot "+compare+" ne se trouve pas dans la base de donnees :-(");
		else
			System.out.println("Le mot "+compare+" se situe bien dans la base de donnes :-)");
	}
}