
public class StarPattern3 {
	public static void main(String[] args) {
		int m, n, l;
		for (m = 0; m <=6; m++) 
		{
			for (n = 6 - m; n > 0; n--) 
			{
				System.out.print(" ");
			}
				for (n = 1; n <=2*m-1; n++) 
				{
					System.out.print("*");
				}
				System.out.println("");
		}

	}

}