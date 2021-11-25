import java.util.Scanner;

public class CTrois
{
	public static void main(String[] args)
	{
		//variables
		float input, max = 0.0f, min = 0.0f; //initialisation uniquement pour eviter des pb compilateur si on entre directement 100
		int cpt = 0, posFirstMax = 0, posFirstMin = 0, posLastMax = 0, posLastMin = 0, cptMax = 0, cptMin = 0; //idem ici
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme Min Max");
		System.out.println("-----------------");
		System.out.println("Entrez des nombres au clavier, a la fin du programme certaines informations vous seront donnees.");
		System.out.println("La plus grande et plus petite valeur entree, la position a laquelle vous les avez entrees pour la premiere fois, le nombre de fois que vous les avez entrees.");
		System.out.print("Entrez un nombre (100 pour quitter le programme) : ");
		input = sc.nextFloat();

		//condition pour initialiser les valeurs lors de la premiere entree
		if(input != 100)
		{
			cptMax++;
			cptMin++;
			cpt++;
			max = input;
			min = input;
			posFirstMax = cpt;
			posFirstMin = cpt;
			posLastMax = cpt;
			posLastMin = cpt;
			
			System.out.print("Entrez un nombre (100 pour quitter le programme) : ");
			input = sc.nextFloat();

			//boucle qui tourne tant que l'utilisateur n'entre pas 100
			while(input != 100)
			{
				cpt++;

				//condition pour le max
				if(input >= max)
				{
					if(input == max)
					{
						cptMax++;
						posLastMax = cpt;
					}
					else
					{
						max = input;
						cptMax = 1;
						posFirstMax = cpt;
					}
				}

				//condition pour le min
				if(input <= min)
				{
					if(input == min)
					{
						cptMin++;
						posLastMin = cpt;
					}
					else
					{
						min = input;
						cptMin = 1;
						posFirstMin = cpt;
					}
				}

				//nouvelle entree utilisateur
				System.out.print("Entrez un nombre (100 pour quitter le programme) : ");
				input = sc.nextFloat();
			}
		}

		System.out.println("Vous avez entre 100, fin du programme");

		//condition pour voir si on est entre dans la boucle, sinon aucun interet d'afficher le resultat
		if(cpt > 0)
		{
			System.out.println("Max = "+max);
			System.out.println("Min = "+min);
			System.out.println("Nombre de fois ou vous avez entre le max = "+cptMax);
			System.out.println("Nombre de fois ou vous avez entre le min = "+cptMin);
			System.out.println("Position du premier max = "+posFirstMax);
			System.out.println("Position du premier min = "+posFirstMin);
			System.out.println("Position du dernier max = "+posLastMax);
			System.out.println("Position du dernier min = "+posLastMin);
		}
	}
}