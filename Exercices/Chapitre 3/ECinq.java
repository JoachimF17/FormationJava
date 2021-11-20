import java.util.Scanner;

public class ECinq
{
	public static void main(String[] args)
	{
		//variables
		int input, tvaInt = 0;
		float tva = 1.00f, prix; //initialisation de tva obligatoire car le compilateur ne peut pas savoir qu'elle le sera d'office apres le switch
		boolean suite = true; //boolean pour simplifier l'ecriture du dernier "si"
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul d'un taux de TVA");
		System.out.println("-----------------------");
		System.out.println("Choisissez le taux en entrant le nombre correspondant");
		System.out.println("TVA 6% (1), TVA 12% (2), TVA 21% (3), TVA 0% (4), Sortie (0)");
		input = sc.nextInt();

		//switch pour attribuer la tva
		switch(input)
		{
			case 1:
				tvaInt = 6;
				break;
			case 2:
				tvaInt = 12;
				break;
			case 3:
				tvaInt = 21;
				break;
			case 4:
				break; //variable initialisee a 0 deja donc pas besoin de le refaire
			case 0:
				System.out.println("Au revoir !");
				suite = false;
				break;
			default:
				System.out.println("Choix non valide !");
				suite = false;
				break;
		}

		if(suite) //simple boolean au lieu de "input = 1" etc
		{
			tva = (float) (tvaInt+100)/100; //passage de la tva en float pour les calculs
			System.out.println("Entrez le montant a calculer");
			prix = sc.nextFloat();
			System.out.println("Prix (HTVA) = "+prix+" euros");
			System.out.println("Le taux de TVA = "+tvaInt+"%");
			System.out.println("Le montant de la TVA = "+(prix*(tva%1))+" euros");
			System.out.println("Prix (TVAC) = "+(prix*tva)+" euros");
		}
	}
}