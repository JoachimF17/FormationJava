import java.util.Scanner;

public class INeuf
{
	public static void main(String[] args) 
	{
		//variables
		char check;
		int i, j, count=0;
		int stringLength;
		//objets
		Scanner sc = new Scanner(System.in);
		String s = new String();

		//programme
		System.out.println("Comptage de lettres");
		System.out.println("-------------------");
		System.out.println("Entrez un texte, le programme comptera les differentes lettres.");
		System.out.print("Entrez un texte : ");
		s = sc.nextLine();

		s = s.trim(); //on supprime les espaces en debut et fin pour economiser du temps de travail
		s = s.toUpperCase(); //on passe tout en maj pour ne check que les maj
		stringLength = s.length(); //on passe la lg du tableau en int par soucis de clarte

		for(i = (int)'A'; i<((int)'A')+26; i++) //on initialise i a la valeur de A, jusqu'a la valeur de Z
		{
			for(j = 0; j<stringLength; j++)
			{
				if(s.codePointAt(j) == i) //on incremente si on trouve le caractere
					count++;
			}

			if(count > 0) //fin de boucle on check si on a trouve un cractere
			{
				check = (char) i; //on passe le char pour affichage
				System.out.println("Votre texte contient "+count+" fois la lettre "+check); //affichage
				count = 0; //remise a zero pour le prochain tour de boucle
			}
		}
	}
}