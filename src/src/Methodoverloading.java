
class Casio{
	public void add(int i, int j) {
		System.out.println(i+j);
	}

	public void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
		
	}

	public void add(float d, float e) {
		System.out.println(d+e);
		
	}
}
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio a=new Casio();
		a.add(5,5);
		a.add(1, 2,3);
		a.add(4.5f,10.5f);

	}

}
