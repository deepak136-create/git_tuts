package deepak.patterns;

public class Stars {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7+1-i;j++) {
				System.out.print(" x");
				}
			System.out.println(" ");	
			}

	}
}

/*
		 *
		 x1 1 i,j 
		 x x 
		 x x x 
		 x x x x 
		 x x x x x 
		 x x x x x x 
		 x x x x x x x17
 */
