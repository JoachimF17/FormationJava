import java.util.Scanner;

public class CTrois
{
	public static void main(String[] args)
	{
		//variables
		int i, j;
		//objets
		String texteSource = new String();
		String texteRecherche = new String();
		String texteRemplace = new String();
		String sousTexte = new String();
		String nouveauTexte = new String();
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme de recherche de texte dans un texte");
		System.out.println("---------------------------------------------");
		System.out.println("Dans ce programme on vous demande d'entrer un texte, ensuite un extrait de texte, et enfin un texte de remplacement.");
		System.out.println("A la fin du programme, le nouveau texte apparaitra.");
		
		System.out.print("Entrez le texte source : ");
		texteSource = sc.nextLine();

		do //verifions que le texte de recherche n'est pas plus long que le texte source
		{
			System.out.print("Entrez le bout de texte a remplacer (il ne peut pas etre plus long que le texte source) : ");
			texteRecherche = sc.nextLine();
		}while(texteRecherche.length() > texteSource.length());

		System.out.print("Entrez le texte de remplacement : ");
		texteRemplace = sc.nextLine();
		
		//la fonction replaceAll() rend l'exercice completement futile
		nouveauTexte = texteSource.replaceAll(texteRecherche,texteRemplace); 

		System.out.println("Ancien texte : "+texteSource);
		System.out.println("Nouveau texte : "+nouveauTexte);
	}
}