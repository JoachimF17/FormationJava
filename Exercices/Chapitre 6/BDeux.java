import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args)
	{
		//variables
		int i, posFirst = 0, posLast = 0, cpt=0;
		//objets
		String texteSource = new String();
		String texteRecherche = new String();
		String sousTexte = new String();
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme de recherche de texte dans un texte");
		System.out.println("---------------------------------------------");
		System.out.println("Dans ce programme on vous demande d'entrer un texte, ensuite un extrait de texte.");
		System.out.println("A la fin du programme, il vous sera indique combien de fois le bout de texte se situe dans le texte original, et la position de la premiere et derniere occurrence.");
		
		System.out.print("Entrez le texte source : ");
		texteSource = sc.nextLine();
		System.out.print("Entrez le texte a rechercher : ");
		texteRecherche = sc.nextLine();

		//verifions d'abord que le texte de recherche n'est pas plus long que le texte source
		if(texteRecherche.length() > texteSource.length())
			System.out.println("Le texte recherche est plus long que le texte source, impossible par definition de le retrouver.");
		else
		{
			for(i = 0; i<=(texteSource.length()-texteRecherche.length()); i++) //on soustrait les longueurs pour eviter le depassement
			{
				//on soustrait un texte de la longueur du texte recherche au texte source par soucis de clarte
				sousTexte = texteSource.substring(i, i+texteRecherche.length());

				//comparaison du texte soustrait avec le texte recherche
				if(texteRecherche.equals(sousTexte)) //fonction equals() remplace le == pour un string
				{
					cpt++;
					posLast = i+1; //+1 parce qu'on commence a zero
					if(posFirst == 0)
						posFirst = i+1; //idem
				}
			}

			if(cpt == 0) //si le texte n'apparait pas aucune raison d'afficher le resultat
				System.out.println("Le bout de texte ne se situe pas dans le texte source.");
			else
			{
				System.out.println("Premiere position de votre bout de texte dans le texte source : a partir du "+posFirst+"eme/er caractere");
				System.out.println("Derniere position de votre bout de texte dans le texte source : a partir du "+posLast+"eme/er caractere");
				System.out.println("Nombre de fois ou votre bout de texte est present dans le texte source : "+cpt);
			}
		}
	}
}