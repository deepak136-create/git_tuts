import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud  implements Comparable<Stud>{

		int rollno,marks;
		String name;
		public Stud(int rollno,String name ,int marks) {
			super();
			this.rollno = rollno;
			this.marks = marks;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
		}
		
		public int compareTo(Stud s) {
			//return marks>s.marks?1:-1;
			return name.length()>s.name.length()?1:-1;
		}
}

public class CollectionDemo {

	public static void main(String[] args) {

		//List values=new ArrayList(); //using in creting list
		//use generics to support a specific type
		//List<Integer> values=new ArrayList<>(); //mutable
		//collection does not work with index numbers
		/*values.add(404);//Integer v=new Integer(4) type is object
		values.add(678);
		values.add(907);
		values.add(265);*/
		//values.add(0,"8"); //it causes error so use advanced for loop
		
		//values.add(0,"8"); //it causes error because it is not a integer 
		//Iterator it=values.iterator(); // use iterTOR AND collection first
		//System.out.println(it.next());
		//if we use beyond limit then it gives error
		//while(it.hasNext()) {
		//System.out.println(it.next());
		//}
	
	/*
	 * for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));		
	}
		
	 */
		//we can use comparator for sorting on our own
		/*Comparator<Integer> c=new Comparator<Integer>()
				{
			public int compare(Integer i,Integer j) {
				//return i%10>j%10?1 -1
				if(i%10>j%10) 
					return 1;//swap elements
						
				else 
					return -1;// dont swap elements
			}
		};*/
		//Comparator<Integer> c=(i,j) ->i%10>j%10?1:-1;
				
		
		/*
		Collections.sort(values,(i,j) ->i%10>j%10?1:-1);
		//Collections.reverse(values);
		//Collections.shuffle(values);
		for (Integer o : values) {
			System.out.println(o);
		}*/
		List<Stud> studs=new ArrayList<>(); 
		studs.add(new Stud(23,"le",61));  
		studs.add(new Stud(24,"gani",47));  
		studs.add(new Stud(26,"mahesh",46));  
		studs.add(new Stud(25,"ram",84));
		//Collections.sort(studs);//when objects needs to be compared then comparable is used
		Collections.sort(studs,(i,j)->i.marks>j.marks ?1:-1);//using comparable object we can override  
		for (Stud s: studs) {
			System.out.println(s);
			
		}
	}
	

}
