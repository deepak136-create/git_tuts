import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set <Integer> value=new TreeSet<>();
		System.out.println(value.add(578));
		System.out.println(value.add(685));
		System.out.println(value.add(7));
		System.out.println(value.add(7));//while printing not following sequence so use tree set instead of tree set
		for (Integer i : value) {
			System.out.println(i);
			
		}
}
}
