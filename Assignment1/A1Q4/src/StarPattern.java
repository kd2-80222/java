public class StarPattern {

	public static void main(String[] args) {
		int i, j, m, n, l;
		for (m = 1; m <=6; m++) 
		{
			for (n = 6 - m; n > 0; n--) 
			{
				System.out.print(" ");
			}
				for (l = 1; l <=m; l++) 
				{
					System.out.print(" *");
				}
				System.out.println(" ");
		}

		for(i=9;i>0;i--)
		{
			for(j=i;j<9;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<2*(i-1);j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}