/**************
 * NON RESOLU *
***************/

import java.util.Scanner;

public class ECinq
{
	public static void main(String[] args)
	{
		//variables
		int firstDay,firstDayAffichage, firstMonth, firstYear, lastDay, lastDayAffichage, 
			lastMonth, lastYear, lastYearAffichage, temp, ecart = -1;
		//objets
		Scanner sc = new Scanner(System.in);

		//programme
		System.out.println("Calcul de dates");
		System.out.println("---------------");
		System.out.println("Entrez deux dates au clavier, le programme vous dira combien de jours les separent.");

		System.out.println("Entrez la premiere date : ");
		System.out.print("Jour : ");
		firstDay = sc.nextInt();
		System.out.print("Mois : ");
		firstMonth = sc.nextInt();
		System.out.print("Annee : ");
		firstYear = sc.nextInt();

		System.out.println("Entrez la deuxieme date : ");
		System.out.print("Jour : ");
		lastDay = sc.nextInt();
		System.out.print("Mois : ");
		lastMonth = sc.nextInt();
		System.out.print("Annee : ");
		lastYear = sc.nextInt();

		//verifions d'abord quelle date est la plus ancienne, on s'assure que ce soit toujours la meme pour faciliter le calcul
		if(firstYear >= lastYear)
		{
			if(firstYear > lastYear)
			{
				temp = lastYear;
				lastYear = firstYear;
				firstYear = temp;
				temp = lastMonth;
				lastMonth = firstMonth;
				firstMonth = temp;
				temp = lastDay;
				lastDay = firstDay;
				firstDay = temp;
			}else
			{
				if(firstMonth >= lastMonth)
				{
					if(firstMonth > lastMonth)
					{
						temp = lastMonth;
						lastMonth = firstMonth;
						firstMonth = temp;
						temp = lastDay;
						lastDay = firstDay;
						firstDay = temp;
					}else //si on a le meme mois et la meme annee, le calcul est simple, c'est la difference de jours
					{
						ecart = lastDay - firstDay;
						temp=ecart*ecart; //au carre puis racine carre pour remettre au positif peu importe l'ordre
						if(ecart != 0) //on evite quand meme de diviser par zero si les dates sont identiques
							ecart=temp/ecart;
					}
				}
			}
		}

		//on passe les valeurs qui seront modifiees pour faciliter l'affichage en fin de programme
		lastDayAffichage = lastDay;
		firstDayAffichage = firstDay;
		lastYearAffichage = lastYear;

		//maintenant le calcul
		if(ecart == -1) //verif qu'on a pas trouve l'ecart dans le if() precedent
		{
			//switch pour trouver le nombre de jours ecoules sur l'annee complete
			switch(lastMonth)
			{
				case 2:
					lastDay+=31;
					break;
				case 3:
					lastDay+=31+28;
					break;
				case 4:
					lastDay+=31+28+31;
					break;
				case 5:
					lastDay+=31+28+31+30;
					break;
				case 6:
					lastDay+=31+28+31+30+31;
					break;
				case 7:
					lastDay+=31+28+31+30+31+30;
					break;
				case 8:
					lastDay+=31+28+31+30+31+30+31;
					break;
				case 9:
					lastDay+=31+28+31+30+31+30+31+31;
					break;
				case 10:
					lastDay+=31+28+31+30+31+30+31+31+30;
					break;
				case 11:
					lastDay+=31+28+31+30+31+30+31+31+30+31;
					break;
				case 12:
					lastDay+=31+28+31+30+31+30+31+31+30+31+30;
					break;
			}

			//ajustement si annee bissextile et on est apres le mois de fevrier
			if(lastMonth > 2 && (lastYear%4 == 0 && lastYear%100 != 0 || lastYear%400 == 0))
				lastDay++;

			//idem
			switch(firstMonth)
			{
				case 2:
					firstDay+=31;
					break;
				case 3:
					firstDay+=31+28;
					break;
				case 4:
					firstDay+=31+28+31;
					break;
				case 5:
					firstDay+=31+28+31+30;
					break;
				case 6:
					firstDay+=31+28+31+30+31;
					break;
				case 7:
					firstDay+=31+28+31+30+31+30;
					break;
				case 8:
					firstDay+=31+28+31+30+31+30+31;
					break;
				case 9:
					firstDay+=31+28+31+30+31+30+31+31;
					break;
				case 10:
					firstDay+=31+28+31+30+31+30+31+31+30;
					break;
				case 11:
					firstDay+=31+28+31+30+31+30+31+31+30+31;
					break;
				case 12:
					firstDay+=31+28+31+30+31+30+31+31+30+31+30;
					break;
			}

			//idem
			if(firstMonth > 2 && (firstYear%4 == 0 && firstYear%100 != 0 || firstYear%400 == 0))
				firstDay++;

			//ajustement si la date annee posterieure est anterieure au niveau jour/mois
			if(lastDay < firstDay)
			{
				lastDay-=365;
				lastYear+=1;
			}

			//on ajoute l'annee au total des jours (.25 pour les annees bissextiles)
			lastDay+=(lastYear*365.25);
			firstDay+=(firstYear*365.25);

			//on calcule la difference
			ecart = lastDay-firstDay;

			//rectifications selon qu'on part ou arrive a une annee bissextile
			if(lastYear%4 == 0 && lastYear%100 != 0 || lastYear%400 == 0)
				ecart--;
			if(firstYear%4 == 0 && firstYear%100 != 0 || firstYear%400 == 0)
				ecart++;
		}

		//affichage
		System.out.println("Il y a "+ecart+" jour(s) entre le "+firstDayAffichage+"/"+firstMonth+"/"+firstYear+
							" et le "+lastDayAffichage+"/"+lastMonth+"/"+lastYearAffichage);
	}
}