import java.util.Scanner;
import java.lang.Math;

public class CTrois
{
	public static void main(String[] args)
	{
		//variables
		float entree, mod;
		int somme, centimes, check;
		boolean pieceCinquante = false;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Distribution de billets");
		System.out.println("-----------------------");
		System.out.print("Entrez la somme a decomposer : ");
		entree = sc.nextFloat();

		//On dissocie les centimes des centaines et on passe le tout en int
		centimes = (int) (((entree%1)+0.001f)*100);
		somme = (int) entree;

		//on arrondit les dizaines de centimes a l'unite superieure
		centimes--; //securite si on est a .x0, on n'a alors pas besoin d'arrondir
		centimes /= 10;
		centimes++;
		
		//condition pour savoir si on doit donner une piece de 50 a la fin
		if(centimes%2 != 0 && centimes <80)
		{
			pieceCinquante = true;
			if(centimes+1 >= 5) //si on a plus de 50cts dans la somme on peut retirer 50cts
				centimes-=5;
			else //sinon on ajoute 50 et retire 1 du total
			{
				centimes+=5;
				somme-=1;
			}
		}

		//condition billets de 100
		if(somme>=100)
		{
			if(somme>=200)
				System.out.println((somme/100)+" billets de 100 euros");
			else
				System.out.println("1 billet de 100 euros");

			somme %=100; //soustraction des billets de 100
		}

		//condition billets de 50
		if(somme>=50)
		{
			System.out.println("1 billet de 50 euros");
			somme-=50; //soustraction du billet de 50
		}

		//condition billets de 20
		if(somme>=20)
		{
			if(somme>=40)
				System.out.println((somme/20)+" billets de 20 euros");
			else
				System.out.println("1 billet de 20 euros");

			somme %=20; //soustraction des billets de 20
		}

		//condition billets de 5
		if(somme>=5)
		{
			if(somme>=10)
				System.out.println((somme/5)+" billets de 5 euros");
			else
				System.out.println("1 billet de 5 euros");

			somme %=5; //soustraction des billets de 5
		}

		//condition pieces de 2
		if(somme>=2)
		{
			if(somme>=4)
				System.out.println("2 pieces de 2 euros");
			else
				System.out.println("1 piece de 2 euros");

			somme %=2; //soustraction des pieces de 2
		}

		//condition piece de 1
		if(somme>=1)
		{
			System.out.println("1 piece de 1 euro");

			somme-=1; //soustraction de la piece de 1
		}

		//verif piece de 50
		if(pieceCinquante)
			System.out.println("1 piece de 50 centimes");

		//verif pieces de 20
		if(centimes>=2)
		{
			if(centimes>2)
			{
				if(centimes%2 != 0)
					System.out.println(((centimes/2)+1)+" pieces de 20 centimes"); /*+1 parce qu'on donnera toujours une
																				piece en plus pour ne pas "voler" le client*/
				else
					System.out.println((centimes/2)+" pieces de 20 centimes");
			}
			else
				System.out.println("1 piece de 20 centimes");
		}
	}
}