public class UnQuatre
{
	public static void main(String[] args)
	{
		//variables
		int a, b, c, temp;

		//programme
		a = 2;
		b = 7;
		c = 5;

		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);

		//inversion
		temp = a;
		a = b;
		b = c;
		c = temp;

		System.out.println("Permutation...");

		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
	}
}