/*class Hi{
	public void show() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{ Thread.sleep(1000);}catch (Exception e) {}//it may throw exception so we are using catch
		}
	}
}
class Hello{
	public void show() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try{ Thread.sleep(1000);}catch (Exception e) {}

		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.show();
		obj2.show();
	}

}
class Hi extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{ Thread.sleep(1000);}catch (Exception e) {}//it may throw exception so we are using catch
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try{ Thread.sleep(1000);}catch (Exception e) {}

		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.start();
		try{ Thread.sleep(10);}catch (Exception e) {}
		obj2.start();
	}

}
//using interfaces
//
 * remove hi class and use anonymous class
 *runnable is functional interface so use() -> instead of new runnable
//using the object only once so do in thread in new thread() runnable use implemnts instead of extends
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(() ->
				 {
					for(int i=1;i<=5;i++) {
						System.out.println("Hi");
						try{ Thread.sleep(1000);}catch (Exception e) {}//it may throw exception so we are using catch
					}
				});
		Thread t2=new Thread(()->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try{ Thread.sleep(1000);}catch (Exception e) {}

			}
		
	});
		t1.start();
		try{ Thread.sleep(10);}catch (Exception e) {}
		t2.start();
	}

}*/
//deal with alive checks thread state and join waits for thread to complete
//might cause an error use throws exception
public class ThreadDemo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(() ->
				 {
					for(int i=1;i<=5;i++) {
						System.out.println("Hi -"+Thread.currentThread().getPriority());
						try{ Thread.sleep(1000);}catch (Exception e) {}//it may throw exception so we are using catch
					}
				},"t1");
		Thread t2=new Thread(()->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello ->"+Thread.currentThread().getPriority());
				try{ Thread.sleep(1000);}catch (Exception e) {}

			}
		
	},"t2");//change thread name using setname
		//instead of set name we can rename in the thread object only
		//t1.setName("t1");
		//t2.setName("t2");
		System.out.println(t1.getPriority());

		//t1.setPriority(1);//insad of priority number we can use min and max
		//t2.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try{ Thread.sleep(10);}catch (Exception e) {}
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("bye");

	}

}



