package deepak.oops;
class Calculator{//super parent 
	public int add(int i,int j) {
		return i+j;
	}
}
class Calculatoradv extends Calculator{ //sub child
	public int sub(int i,int j) {
		return i-j;
	}
}
class Calculatorvadv extends Calculatoradv{
	public int mul(int i,int j) {
		return i*j;
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		
	
	Calculatorvadv c1=new Calculatorvadv();
	int result1=c1.add(4, 5);
	int result2=c1.sub(4, 5);
	int result3=c1.mul(4,5);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}
}
