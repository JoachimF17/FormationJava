import java.util.Scanner;

public class UnCinq
{
	public static void main(String[] args)
	{
		final float PI = 3.1415f;
		float rayon;
		Scanner sc = new Scanner(System.in);

		System.out.println("Calcul de la circonference d'un cercle");
		System.out.println("--------------------------------------");
		System.out.println("Entrez la valeur du rayon : ");
		rayon = sc.nextFloat();
		System.out.println("Circonference d'un cercle de "+rayon+" de rayon = "+(2*PI*rayon));
	}
}