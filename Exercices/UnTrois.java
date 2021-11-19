public class UnTrois
{
	public static void main(String[] args)
	{
		int a, b, temp;

		a = 2;
		b = 7;

		System.out.println("a = "+a+"\nb = "+b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("Permutation...");

		System.out.println("a = "+a+"\nb = "+b);
	}
}