import java.util.Scanner;

public class DQuatre
{
	public static void main(String[] args)
	{
		//variables
		float input, lastInput; 
		int posPremierePetite = 0, posDernierePetite = 0, plusGrandeSerie = 0, plusPetiteSerie = 0,
			posPremiereGrande = 0, posDerniereGrande = 0, cptGrande = 0, cptPetite = 0, 
			cptSerieActuelle = 0, cptSeries = 0;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme Min Max de luxe");
		System.out.println("-------------------------");
		System.out.println("Vous allez entrez plusieurs nombres, nous allons analyser les suites croissantes de nombres entres.");
		System.out.println("En fin de programme, on vous renverra la plus grande suite, la plus petite suite, leurs positions, et le nombre d'occurrences.");
		System.out.print("Entrez un nombre (100 pour arreter le programme) : ");
		input = sc.nextFloat();

		//condition initiale pour verifier que l'utilisateur ne rentre pas 100
		if(input != 100)
		{
			lastInput = input; //on passe l'input actuel dans une autre variable pour comparer avec le prochain input
			System.out.print("Entrez un nombre (100 pour arreter le programme) : ");
			input = sc.nextFloat();

			//boucle tant que l'utilisateur n'entre pas 100
			while(input != 100)
			{
				if(input > lastInput) //si la serie est croissante on verie notre grande serie
				{
					if(cptSerieActuelle == 0) //indique qu'on demarre une nouvelle serie
						cptSeries++;

					cptSerieActuelle++; //vu que la serie est croissante, on incremente sa valeur

					if(cptSerieActuelle >= plusGrandeSerie) //comparaison pour savoir si notre serie actuelle est plus grande que la plus grande serie enregistree
					{
						if(cptSerieActuelle > plusGrandeSerie)
						{
							plusGrandeSerie = cptSerieActuelle;
							posPremiereGrande = cptSeries;
							posDerniereGrande = cptSeries;
							cptGrande = 1;
						}else
						{
							cptGrande++;
							posDerniereGrande = cptSeries;
						}
					}
				}else //si la serie n'est plus croissante on verifie notre petite
				{
					if(cptSerieActuelle <= plusPetiteSerie)
					{
						if(cptSerieActuelle < plusPetiteSerie)
						{
							plusPetiteSerie = cptSerieActuelle;
							posPremierePetite = cptSeries;
							posDernierePetite = cptSeries;
							cptPetite = 1;
						}else
						{
							cptPetite++;
							posDernierePetite = cptSeries;
						}
					}

					cptSerieActuelle = 0; //vu que la serie n'est plus croissante on remet a zero en prevision de la prochaine serie
				}

				if(cptSeries == 1) //si c'est notre premiere serie on initialise la plus petite serie en fonction
				{
					plusPetiteSerie = plusGrandeSerie;
					posPremierePetite = 1;
					posDernierePetite = 1;
					cptPetite = 1;
				}

				lastInput = input; //a nouveau on passe le dernier input dans une autre variable en vue de la prochaine comparaison
				System.out.print("Entrez un nombre (100 pour arreter le programme) : ");
				input = sc.nextFloat();	
			}
		}

		System.out.println("Vous avez entre 100, fin du programme");

		if(cptSeries > 0)
		{
			if(cptSerieActuelle <= plusPetiteSerie && cptSerieActuelle > 0) //verification si on arrete le programme dans une suite croissante plus petite que celle enregistree
			{
				if(cptSerieActuelle < plusPetiteSerie)
				{
					plusPetiteSerie = cptSerieActuelle;
					posPremierePetite = cptSeries;
					posDernierePetite = cptSeries;
					cptPetite = 1;
				}else
				{
					if(cptSeries>1) //securite pour ne pas renvoyer un mauvais resultat si c'est notre premiere serie
						cptPetite++;

					posDernierePetite = cptSeries;
				}
			}

			//affichage des differentes donnees
			System.out.println("Plus grande serie croissante : "+plusGrandeSerie);
			System.out.println("Nombre d'occurrences de cette serie : "+cptGrande);
			System.out.println("La premiere fois qu'on a rencontre cette serie etait lors de notre "+posPremiereGrande+"eme/ere serie croissante");
			System.out.println("La derniere fois qu'on a rencontre cette serie etait lors de notre "+posDerniereGrande+"eme/ere serie croissante");
			System.out.println("Plus petite serie croissante : "+plusPetiteSerie);
			System.out.println("Nombre d'occurrences de cette serie : "+cptPetite);
			System.out.println("La premiere fois qu'on a rencontre cette serie etait lors de notre "+posPremierePetite+"eme/ere serie croissante");
			System.out.println("La derniere fois qu'on a rencontre cette serie etait lors de notre "+posDernierePetite+"eme/ere serie croissante");
			System.out.println("Nombre de series croissantes au total : "+cptSeries);
		}else
			System.out.println("Vous n'avez entre aucune serie croissante.");
	}
}