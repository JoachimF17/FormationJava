public class UnDeux
{
	public static void main(String[] args)
	{
		//declaration variables locales
		float a, b, c, d, e, res;

		//programme
		//premiere ligne
		a=150;
		b=92;
		res=a-b;

		System.out.println(a+" - "+b+" = "+res);
		//fin premiere ligne

		//deuxieme ligne
		a=89;
		b=18;
		c=25;
		d=2;
		e=13;
		res = (a-b) + (c*d) - e;

		System.out.println("( "+a+" - "+b+" ) + ( "+c+" * "+d+" - "+e+" ) = "+res);
		//fin deuxieme ligne

		//troisieme ligne
		a=15;
		b=3;
		c=2;
		res = (a*b)/c;

		System.out.println("( "+a+" * "+b+" ) / "+c+" = "+res);
		//fin troisieme ligne

		//quatrieme ligne
		res = a/(b*c);

		System.out.println(a+" / ( "+c+" * "+b+" ) = "+res);
		//fin quatrieme ligne

		//cinquieme ligne
		res = (a+b)/c;

		System.out.println("( "+a+" + "+b+" ) / "+c+" = "+res);
		//fin cinquieme ligne

		//sixieme ligne
		res = (a/c)+b;

		System.out.println("( "+a+" / "+c+" ) + "+b+" = "+res);
		//fin sixieme ligne
	}
}