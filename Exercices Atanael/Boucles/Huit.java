import java.util.Scanner;

public class Huit
{
	public static void main(String[] args)
	{
		//objets
		Scanner sc = new Scanner(System.in);
		String s = new String();

		//programme
		System.out.println("Remplacement de caractere");
		System.out.println("-------------------------");
		System.out.println("Entrez un texte, tous les espaces seront remplaces par des '|'");
		System.out.print("Entrez un texte : ");
		s = sc.nextLine();

		System.out.println("\nTexte d'origine : "+s);

		//yolo
		s = s.replaceAll(" ", "|");

		System.out.println("Texte modifie : "+s);
	}
}