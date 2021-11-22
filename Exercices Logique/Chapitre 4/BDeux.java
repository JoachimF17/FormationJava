import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args)
	{
		//variables
		float input, total = 0.0f;
		int cpt = 0;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme de calcul d'une moyenne");
		System.out.println("---------------------------------");
		System.out.println("Entrez des nombres au clavier, la moyenne sera calculee a la fin du programme (entrez 100 pour arreter le programme)");
		System.out.println("Entrez un nombre (100 pour arreter le programme) : ");
		input = sc.nextFloat(); //float pour permettre les chiffres a virgule

		//boucle qui tourne tant que l'utilisateur ne rentre pas 100
		while(input != 100)
		{
			total+=input;
			cpt++;
			System.out.println("Entrez un nombre (100 pour arreter le programme) : ");
			input = sc.nextFloat();
		}

		System.out.println("Vous avez entre 100, fin du programme");

		if(cpt == 0) //on verifie qu'on est au moins une fois entres dans la boucle
			System.out.println("Au revoir !");
		else
			System.out.println("Moyenne des nombres entres au clavier = "+(total/cpt));
	}
}