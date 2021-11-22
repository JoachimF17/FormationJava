import java.util.Scanner;

public class GSept
{
	public static void main(String[] args)
	{
		//variables
		int i, length;
		int longueurMot = 0;
		char[] charArray;
		//objets
		String texte = new String();
		String mot = new String();
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme d'inversion de mots");
		System.out.println("-----------------------------");
		System.out.println("Entrez un texte, le programme va inverser l'ordre des mots ");
		System.out.print("Entrez votre texte : ");
		texte = sc.nextLine();

		//la fonction trim() va supprimer les espaces en debut et fin de texte pour plus de clarte et economiser de la memoire
		texte = texte.trim();
		length = texte.length(); //on enregistre la longueur pour plus de lisibilite par la suite
		charArray = new char[length]; //tableau dans lequel on va stocker le texte au fur et a mesure, donc meme taille
		mot = "";

		//boucle qui va traverser le texte
		for(i = 0; i<length-2; i++)
		{
			if(texte.charAt(i) != ' ')
			{
				mot += texte.charAt(i);
				longueurMot++;
			}else
			{
				
			}
		}
	}
}