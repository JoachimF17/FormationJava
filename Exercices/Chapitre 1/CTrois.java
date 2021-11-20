public class UnTrois
{
	public static void main(String[] args)
	{
		//variables
		int a, b, temp;

		//programme
		a = 2;
		b = 7;

		System.out.println("a = "+a+"\nb = "+b);

		//inversion
		temp = a;
		a = b;
		b = temp;

		System.out.println("Permutation...");

		System.out.println("a = "+a+"\nb = "+b);
	}
}