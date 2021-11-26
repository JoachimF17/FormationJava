import java.util.Scanner;
import java.lang.Math;

public class CTrois
{
	public static void main(String[] args) 
	{
		//variables
		int[] array = new int[10];
		int[] cptArray = new int[10];
		int input, i, j, cptEssais = 0, temp, check, trouve = 0;
		//objets
		Scanner sc = new Scanner(System.in);
		//programme
		System.out.println("Plus ou moins 10x");
		System.out.println("-----------------");
		System.out.println("Le programme a genere 10 nombres de 1 a 100, dans l'ordre.");
		System.out.println("Vous devez deviner les nombres, on vous donne les infos (plus ou moins etc).");
		System.out.println("Le programme vous indiquera 'proche' lorsque vous etes a moins de 5 de la valeur.");

		//boucle de generation des nombres aleatoires
		for(i = 0; i<10; i++)
			array[i] = (int) (Math.random() * 100)+1;

		//initialisation du tableau des tentatives a zero
		for(i = 0; i<10; i++)
			cptArray[i] = 0;

		//boucle de tri
		for(i = 9; i>=1; i--)
		{
			for(j = 0; j<i; j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		//on sort de la boucle quand on trouve le 10eme nombre
		while(trouve<10)
		{
			System.out.print("Entrez un nombre (1-100) : ");
			input = sc.nextInt();
			cptEssais++; //incrementation du compteur d'essais apres chaque saisie

			for(i = 0; i<10; i++)
			{
				if(cptArray[i] != 0) //vu qu'on initialise a 0, si diff de 0 alors on l'a deja trouve donc pas besoin de faire les operations dans la condition suivante
					System.out.println("Indice "+(i+1)+" : Trouve");
				else if(input == array[i])
				{
					System.out.println("Indice "+(i+1)+" : Trouve");
					cptArray[i] = cptEssais+1; //on enregistre le compteur d'essais, +1 en protection pour les doublons
					cptEssais = 0; //on le remet a 0
					trouve++; //on n'oublie pas l'incrementation de nos nombres trouves
				}else if((input < array[i] && input+5 > array[i]) || (input > array[i] && input-5 < array[i]))
					System.out.println("Indice "+(i+1)+" : Proche");
				else if(input > array[i])
					System.out.println("Indice "+(i+1)+" : Superieur");
				else
					System.out.println("Indice "+(i+1)+" : Inferieur");
			}
		}

		//si on a 2 nombres identiques, les 2 seront consideres comme "trouve" mais dans le compteur d'essais la deuxième valeur sera a zero
		//cette boucle permet de verifier les egalites, et si egalite alors on associe le compteur d'essais a celui de l'autre valeur
		for(i = 0; i<9; i++)
		{
			if(array[i] == array[i+1])
				cptArray[i+1] = cptArray[i];
		}

		//boucle d'affichage
		for(i = 0; i<10; i++) //cptArray -1 vu qu'on a +1 au moment ou on a trouve le bon nombre (ligne 57)
			System.out.println("Il vous a fallu "+(cptArray[i]-1)+" tentative(s) pour trouver la valeur de l'indice "+(i+1)+" qui etait "+array[i]);
	}
}