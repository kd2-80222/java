
public class StarPattern2 {

	public static void main(String[] args) {
		int m, n, l;
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

	}

}