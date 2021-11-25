import java.util.Scanner;

public class AUn
{
	public static void main(String[] args) 
	{
		//variables
		float somme = 0, max, min;
		int i;
		float[] array = new float[10];
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Min max tableau");
		System.out.println("---------------");
		System.out.println("Entrez 10 nombres, on vous donnera le max, le min, la somme et la moyenne");

		//boucle d'initialisation
		for(i = 0; i<10; i++)
		{
			if(i == 10) //if() pour affichage (restant au singulier a 1)
				System.out.print("Entrez un nombre (1 restant) : ");
			else
				System.out.print("Entrez un nombre ("+(10-i)+" restants) : ");

			array[i] = sc.nextFloat();
			somme+=array[i]; //on ajoute directement a la somme
		}

		//definitions du max et min
		max = array[0];
		min = array[0];

		//boucle de comparaison
		for(i = 1; i<10; i++)
		{
			if(array[i] > max)
				max = array[i];
			else if(array[i] < min)
				min = array[i];
		}

		//affichage
		if(max%1 == 0) //on verifie si il est entier pour un affichage plus propre (5 au lieu de 5.0)
			System.out.println("Nombre max = "+((int)max));
		else
			System.out.println("Nombre max = "+max);

		if(min%1 == 0) //idem
			System.out.println("Nombre min = "+((int)min));
		else
			System.out.println("Nombre min = "+min);

		if(somme%1 == 0) //idem
			System.out.println("Somme des nombres = "+((int)somme));
		else
			System.out.println("Somme des nombres = "+somme);

		System.out.println("Moyenne des nombres = "+(somme/10));
	}
}