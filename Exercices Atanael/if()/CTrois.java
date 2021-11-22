import java.util.Scanner;
import java.lang.Math;

public class CTrois
{
	public static void main(String[] args)
	{
		//variables
		int piece;

		//programme
		System.out.println("Pile ou face ?");
		System.out.println("--------------");
		piece = (int) (Math.random()*100);

		if(piece >50) //50 pour 50/50
		{
			System.out.println("C'est pile !");
		}else
		{
			System.out.println("C'est face !");
		}
	}
}