import java.util.Scanner;

public class JDix
{
	public static void main(String[] args) 
	{
		//variables
		char[] array;
		int charAt;
		int stringLength;
		int decalage;
		int i;
		//objets
		Scanner sc = new Scanner(System.in);
		String s = new String();

		//programme
		System.out.println("Implementation de la Methode Cesar");
		System.out.println("----------------------------------");
		System.out.println("Entrez un mot, puis un nombre, toutes les lettres du mot seront avancees dans l'alphabet de la valeur du nombre.");
		System.out.print("Entrez le mot : ");
		s = sc.nextLine();
		System.out.print("Entrez le nombre : ");
		decalage = sc.nextInt();

		stringLength = s.length(); //on passe la lg du tableau en int par soucis de clarte
		array = new char[stringLength]; 
		array = s.toCharArray(); //passage en tableau de caracteres pour modifier la valeur

		for(i = 0; i < stringLength; i++)
		{
			charAt = (int) array[i];

			charAt+=decalage; //on devrait mettre une condition pour depassement de memoire mais flemme

			array[i] = (char) charAt;
		}

		s = String.valueOf(array); //on repasse le tableau en string pour affichage

		//affichage
		System.out.println(s);
	}
}