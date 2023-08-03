class Casiox{
	int num1;
	int num2;
	String oper;
	
	public Casiox() {
		num1=0;
		num2=0;
		oper="nothing";
		System.out.println("hi");
	}
	public Casiox(int i) {
		num1=i;
		num2=0;
		oper="nothing";
		System.out.println("nice");
	}
	public Casiox(int i,int j) {
		num1=i;
		num2=j;
		oper="nothing";
		System.out.println("ok");
	}
	public Casiox(int i,int j,String op) {
		num1=i;
		num2=j;
		oper=op;
		System.out.println("hello");
	}
	
}


public class Consructeroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casiox x=new Casiox(2,3,"fine");//based on constructer calling it verifies and calls the constructer based on the parameter used
		
	}

}
