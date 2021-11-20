import java.util.Scanner;

public class AUn
{
	public static void main(String[] args)
	{
		//variables
		float a, b;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul d'une equation du premier degre ax+b = 0");
		System.out.println("-----------------------------------------------");
		System.out.println("Entrez la valeur de a : ");
		a = sc.nextFloat();
		System.out.println("Entrez la valeur de b : ");
		b = sc.nextFloat();

		//condition
		if(a==0)
		{
			if(b==0) // si a et b = 0, x peut prendre n'importe quelle valeur et le resultat sera toujours 0
				System.out.println("Toutes les valeurs de x sont possibles");
			else //si seulement a = 0, le calcul est impossible car -b/a implique une div par zero
				System.out.println("Calculer la valeur de x demande une division par 0, operation impossible");
			
		}else
			System.out.println("La valeur de x est : "+(-b/a));
	}
}