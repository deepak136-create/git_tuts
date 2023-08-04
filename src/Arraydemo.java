import java.util.Iterator;

public class Arraydemo {
	public static void main(String[] args) {
		/*int nums[]=new int[4];//int nums[]={1,2,3,4}
		nums[0]=0;
		nums[1]=1;
		nums[2]=2;
		nums[3]=3;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
		}*/
		//we can create array of objects student 1 ,student2 ;;student s[]={s1,s2}
		int a[]= {1,0,0,0};
		
		int b[]= {0,1,0,0};
		int c[]= {0,0,1,0};
		int d[]= {0,0,0,1};
		int e[][]= {
				 {1,0,0,0},
				 {0,1,0,0},
				 {0,0,1,0},
				 {0,0,0,1}

		};
		for (int i = 0; i < e.length; i++) {
			System.out.println();

			for (int j = 0; j < e[i].length; j++) {
				System.out.print(e[i][j]+"\t");
			}
			System.out.println();
			
		}
		for(int k[]:e) {
			System.out.println();
			for (int l:k) {
				
				System.out.print(l+"\t");
				
			}
			System.out.println();//enhanced for loop
		}
		
	}

}
