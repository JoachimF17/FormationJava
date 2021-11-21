import java.util.Scanner;
import java.lang.Math;

public class CTrois
{
	public static void main(String[] args)
	{
		//variables
		float entree;
		int somme, centimes, check;
		boolean pieceCinquante = false;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Distribution de billets");
		System.out.println("-----------------------");
		System.out.print("Entrez la somme a decomposer");
		entree = sc.nextFloat();
		
		/*********
		 * initialisation de la variable "check" pour verifier si on doit supprimer 50 centimes de la somme
		 * Vu qu'il n'y a pas de pieces de 10 centimes, il peut y avoir des problemes pour decomposer la somme, 
		 * retirer 50 centimes de la somme de base permet de regler preventivement ces problemes
		**********/
		check = Math.round(((entree%1)+0.051f)*10); //+0.051f pour arrondir à l'unite superieure et limiter des excedants supplementaires

		//condition pour savoir si on doit donner une piece de 50 a la fin
		if(check%2 != 0 && check <8)
		{
			pieceCinquante = true;
			entree-=0.50f; //on soustrait fictivement les 50 centimes de la somme
		}

		//On dissocie les centimes des centaines et on passe le tout en int
		centimes = (int) (((entree%1)+0.001f)*100);
		somme = (int) entree;

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
				System.out.println((somme/20)+" billets de 20");
			else
				System.out.println("1 billet de 20");

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
		if(centimes>=20)
		{
			if(centimes>20)
				System.out.println(((centimes/20)+1)+" pieces de 20 centimes"); /*+1 parce qu'on donnera toujours une
																				piece en plus pour ne pas "voler" le client*/
			else
				System.out.println("1 piece de 20 centimes");
		}
	}
}