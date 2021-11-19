import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args)
	{
		//variables
		int a, b;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Comparaison entre deux nombres");
		System.out.println("------------------------------");
		System.out.println("Entrez un premier nombre");
		a = sc.nextInt();
		System.out.println("Entrez un second nombre");
		b = sc.nextInt();

		//condition
		if(a>b)
			System.out.println("Le nombre "+a+" est plus grand que le nombre "+b);
		else
		{
			if(a<b)
				System.out.println("Le nombre "+a+" est plus petit que le nombre "+b);
			else
				System.out.println("Le nombre "+a+" est egal au nombre "+b);
		}
	}
}