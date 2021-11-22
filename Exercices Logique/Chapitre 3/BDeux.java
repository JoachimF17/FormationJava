import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args)
	{
		//variables
		float a, b;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Comparaison entre deux nombres");
		System.out.println("------------------------------");
		System.out.print("Entrez un premier nombre");
		a = sc.nextFloat();
		System.out.print("Entrez un second nombre");
		b = sc.nextFloat();

		//condition
		if(a>b)
			System.out.println("Le nombre "+a+" est plus grand que le nombre "+b);
		else
		{
			if(a<b)
				System.out.println("Le nombre "+a+" est plus petit que le nombre "+b);
			else //si ni plus grand ni plus petit alors d'office egal
				System.out.println("Le nombre "+a+" est egal au nombre "+b);
		}
	}
}