import java.util.Scanner;

public class BDeux
{
	public static void main(String[] args)
	{
		//variables
		int input;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Annee bissextile");
		System.out.println("----------------");
		System.out.println("Entrez une annee, le programme vous dira si celle-ci est bissextile ou non.");
		System.out.print("Entrez une annee : ");
		input = sc.nextInt();

		if(input%4 == 0 && input%100 != 0 || input%400 == 0)
		{
			System.out.println("L'annee "+input+" est bissextile");
		}else
		{
			System.out.println("L'annee "+input+" n'est pas bissextile");
		}
	}
}