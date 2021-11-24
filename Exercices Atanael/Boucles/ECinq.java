import java.util.Scanner;
import java.lang.Math;

public class ECinq
{
	public static void main(String[] args) 
	{
		//variables
		int scoreUtil = 0, scoreOrdi = 0;
		int choixUtil = 0, choixOrdi = 0;
		float choixUtilF = 0;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Pierre Papier Ciseaux");
		System.out.println("---------------------");
		System.out.println("Jeu de pierre papier ciseaux, entrez la valeur correspondante à ce que vous souhaitez jouer.");
		System.out.println("(Rappel : Pierre < Papier < Ciseaux < Pierre < ...)");

		do //TODO: finir cette merde
		{
			do
			{
				System.out.print("Pierre (1) Papier (2) Ciseaux (3) : ");
				choixUtilF = sc.nextFloat();
			}while(choixUtilF < 1 || choixUtilF > 3 || choixUtilF%1 != 0);

			choixUtil = (int) choixUtil;
			choixOrdi = (int) ((Math.random()*3)+1);
			System.out.println(choixOrdi);

			scoreUtil++;
		}while(scoreUtil < 3 && scoreOrdi < 3);
	}
}