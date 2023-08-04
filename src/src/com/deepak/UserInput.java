package com.deepak;

/*public class UserInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter a number");
		
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			n=Integer.parseInt(br.readLine());
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		finally {
			br.close();

		}
		System.out.println(n);
		
	}

}
public class UserInput {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter a number");
		
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) 
		{
			n=Integer.parseInt(br.readLine());//with resource remove finally 
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		System.out.println(n);
		
	}
	
}*/
// Exception handling using user defined exception
public class UserInput {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int i,j;
		i=8;
		j=9;
		
		try {
			int k=i/j;
			if(k==0) {
				throw new TeluskoException("This is not possible");
			}
			System.out.println(k);


			
		} catch (TeluskoException e) {
			System.out.println("Error "+ e.getMessage());

			// TODO: handle exception
		}
	
}
}
