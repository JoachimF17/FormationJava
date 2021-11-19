import java.util.Scanner;

public class DQuatre
{
	public static void main(String[] args)
	{
		//variables
		int a, b, c, temp;
		char signe1, signe2;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Programme de comparaison entre 3 nombres");
		System.out.println("----------------------------------------");
		System.out.print("Entrez le premier nombre : ");
		a = sc.nextInt();
		System.out.print("Entrez le deuxieme nombre : ");
		b = sc.nextInt();
		System.out.print("Entrez le dernier nombre : ");
		c = sc.nextInt();

		//conditions
		if(a>b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		if(b>=c)
		{
			temp = b;
			b = c;
			c = temp;

			if(a>b)
			{
				temp = a;
				a = b;
				b = temp;
			}
		}

		/************
		on place le signe comme caractere pour economiser des "si" inutiles vu que les
		chiffres sont dans l'ordre, ils n'y a plus qu'une seule condition à verifier, l'egalite
		************/
		if(a==b)
			signe1 = '=';
		else
			signe1 = '<';

		if(b==c)
			signe2 = '=';
		else
			signe2 = '<';

		//fonction d'affichage
		System.out.println(a+" "+signe1+" "+b+" "+signe2+" "+c);
	}
}