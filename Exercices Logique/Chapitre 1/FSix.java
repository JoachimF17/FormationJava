import java.util.Scanner;

public class UnSix
{
	public static void main(String[] args)
	{
		//variables
		float a, b, c;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul de la moyenne de trois nombres");
		System.out.println("-------------------------------------");
		System.out.print("Entrez un premier nombre : ");
		a = sc.nextFloat();
		System.out.print("Entrez un deuxieme nombre : ");
		b = sc.nextFloat();
		System.out.print("Entrez un troisieme nombre : ");
		c = sc.nextFloat();

		System.out.println("Moyenne des 3 nombres = "+((a+b+c)/3));
	}
}