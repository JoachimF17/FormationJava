import java.util.Scanner;

public class AUn
{
	public static void main(String[] args)
	{
		//variables
		int i, posFirst = 0, posLast = 0, cpt=0;
		char caractere;
		//objets
		String texte = new String();
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme de recherche d'un caractere dans un texte");
		System.out.println("---------------------------------------------------");
		System.out.println("Dans ce programme on vous demande d'entrer un texte, ensuite un caractere.");
		System.out.println("A la fin du programme, il vous sera indique combien de fois le caractere se situe dans le texte, et la position de la premiere et derniere occurrence.");
		
		System.out.print("Saisissez le texte : ");
		texte = sc.nextLine();
		System.out.print("Saisissez le caractere a rechercher dans le texte : ");
		caractere = sc.next().charAt(0); //ne prend en compte que le premier caract au cas ou l'utilisateur raconte sa life

		//boucle qui va passer sur chaque caractere du texte
		for(i = 0; i<texte.length(); i++)
		{
			//verification du caract
			if(caractere == texte.charAt(i))
			{
				cpt++;
				posLast = i+1; //+1 parce qu'on demarre a zero
				if(posFirst == 0)
					posFirst = i+1; //idem
			}
		}

		if(cpt == 0) //si on n'a pas trouve son caractere
			System.out.println("Ce caractere ne se trouve pas dans le texte.");
		else
		{
			System.out.println("Premiere position du caractere dans le texte : "+posFirst);
			System.out.println("Derniere position du caractere dans le texte : "+posLast);
			System.out.println("Nombre de fois ou le caractere apparait : "+cpt);
		}
	}
}