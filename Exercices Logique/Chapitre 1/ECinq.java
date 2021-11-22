import java.util.Scanner;

public class UnCinq
{
	public static void main(String[] args)
	{
		//variables
		final float PI = 3.1415f; //constante pi (toujours en MAJ)
		float rayon;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul de la circonference d'un cercle");
		System.out.println("--------------------------------------");
		System.out.print("Entrez la valeur du rayon : ");
		rayon = sc.nextFloat();
		System.out.println("Circonference d'un cercle de "+rayon+" de rayon = "+(2*PI*rayon));
	}
}