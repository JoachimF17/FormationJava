import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args)
	{
		//variables
		float a, b, temp;
		int aToInt, i;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul de la somme des nombres entre deux nombres");
		System.out.println("-------------------------------------------------");
		System.out.println("Vous allez entrer deux nombres entiers au clavier, le programme va calculer la somme des nombres compris entre ces deux nombres");
		System.out.print("Entrez un premier nombre entier : ");
		a = sc.nextFloat();

		while(a%1 != 0) //verification qu'il entre un entier
		{
			System.out.print("Entrez un premier nombre entier : ");
			a = sc.nextFloat();
		}
		
		System.out.print("Entrez un second nombre entier : ");
		b = sc.nextFloat();

		while(b%1 != 0) //verification qu'il entre un entier
		{
			System.out.print("Entrez un second nombre entier : ");
			b = sc.nextFloat();
		}

		if(a > b) //inversion pour s'assurer de partir du chiffre le plus bas
		{
			temp = a;
			a = b;
			b = temp;
		}
		
		aToInt = (int) a; //on passe le nombre en int pour l'affichage (4 au lieu de 4.0)

		if(a != b)
		{
			for(i = aToInt+1; i <= b; i++) //a+1 pour qu'il commence l'addition au chiffre suivant
				aToInt+=i; //on ajoute la valeur de i jusqu'a b (inclus)

			System.out.println("La somme des nombres est : "+aToInt);
		}else
		{
			System.out.println("Les deux nombres sont egaux, le resultat est d'office "+aToInt);
		}
	}
}