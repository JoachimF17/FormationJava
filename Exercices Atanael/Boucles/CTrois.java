public class CTrois
{
	public static void main(String[] args) 
	{
		//variables
		int i;
		char cMin = (int) 'a'; //conversion en (int) pour recuperer la valeur de 'a' dans la table ascii
		char cMaj = (int) 'A'; //idem

		//programme
		for(i = 0; i<26; i++) //affichage majuscules
		{
			System.out.print(cMaj);
			cMaj++;
		}

		//retour a la ligne
		System.out.println("");

		for(i = 0; i<26; i++) //affichage minuscules
		{
			System.out.print(cMin);
			cMin++;
		}
	}
}