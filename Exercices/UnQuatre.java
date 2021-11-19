public class UnQuatre
{
	public static void main(String[] args)
	{
		int a, b, c, temp;

		a = 2;
		b = 7;
		c = 5;

		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);

		temp = a;
		a = b;
		b = c;
		c = temp;

		System.out.println("Permutation...");

		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
	}
}