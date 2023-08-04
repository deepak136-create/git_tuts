
class Counter{
	int count;
	
	public synchronized void increment() {
		count++; //only one thread can use the method
	}
}
public class Syncdemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		Thread t1=new Thread(new  Runnable() {
			
		
			
			public void run() {
				for(int i=1;i<=1000;i++) {
				  	c.increment();

			}
			
			}
		});
		/*
		 * without method
		 * Thread t1=new Thread(()-> {
			
		
			
			
				for(int i=1;i<=1000;i++) {
					c.increment();

			}
			
			
		});
		
		 */
		Thread t2=new Thread(new  Runnable() {
			
			
			
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
					
				}
				
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		//c.increment();
		System.out.println("Count "+c.count);
	} 

}
