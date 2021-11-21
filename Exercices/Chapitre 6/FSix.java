import java.util.Scanner;

public class FSix
{
	public static void main(String[] args)
	{
		//variables
		int i;
		char temp;
		char[] charArray;
		//objets
		String texteSource = new String();
		//String texteRemplace = new String();
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme d'inversion d'un texte");
		System.out.println("--------------------------------");
		System.out.println("Entrez un texte, celui-ci vous sera renvoye apres avoir inverse toutes les lettres");
		System.out.print("Entrez le texte a inverser : ");
		texteSource = sc.nextLine();

		//on passe le string en tableau de char pour pouvoir inverser caractere par caractere
		charArray = new char[texteSource.length()];
		charArray = texteSource.toCharArray();

		for(i = 0; i<(texteSource.length()/2); i++)
		{
			j = texteSource.length()-i-1;
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}

		//on repasse le tableau de char en string
		texteSource = String.valueOf(charArray);

		//affichage
		System.out.println("Texte inverse : "+texteSource);
	}
}