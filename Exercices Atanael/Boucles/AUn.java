import java.util.Scanner;

public class AUn
{
	public static void main(String[] args) 
	{
		//variables
		int annee;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Test annee bissextile");
		System.out.println("---------------------");
		System.out.println("Entrez une annee, jusqu'a trouver une annee bissextile");

		System.out.print("Entrez une annee : ");
		annee = sc.nextInt();

		while(annee%4 != 0 || (annee%100 == 0 && annee%400 != 0))
		{
			System.out.print("Pas bissextile, entrez une annee : ");
			annee = sc.nextInt();
		}

		System.out.println(annee+" est bien une annee bissextile !");
	}
}