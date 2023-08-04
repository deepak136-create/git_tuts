
public class Pattern {

		public static void main(String[] args) {
			for(int i=1;i<=7;i++) {
				for(int j=i;j<=7;j++) {
					System.out.print(" ");
					
					 /* just two patterns enough for any pattern increasing and decreasing triangle
					 * inc-1 <=n  1-i dec 1-n i- <=n
					 * hill pattern nested for loop
						 * 	       **
							      ****
							     ******
							    ********
							   **********
							  ************
							 **************

					 * 
					 */
					
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();

			}

		}

	}

