import java.util.Scanner;

public class AUn
{
	public static void main(String[] args)
	{
		//variables
		final int MAX = 30; //constante si on veut s'amuser a modifier le programme
		int cpt = 0, i;
		float input, total=0.0f;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme de calcul d'une moyenne");
		System.out.println("---------------------------------");
		System.out.println("Entrez "+MAX+" nombres au clavier, la moyenne des nombres entre 10 et 20 sera calculee.");

		for(i = 0; i<MAX; i++)
		{
			if(i == MAX-1) //pour affichage pluriel/singulier
				System.out.print("Entrez un nombre (1 restant) : ");
			else
				System.out.print("Entrez un nombre ("+(MAX-i)+" restants) : ");

			input = sc.nextFloat();

			if(input >= 10 && input <= 20)
			{
				total += input;
				cpt++;
			}
		}

		if(cpt > 0)
			System.out.println("La moyenne des nombres valides entres est : "+(total/cpt));
		else
			System.out.println("Vous n'avez entre aucun nombre valide.");
	}
}