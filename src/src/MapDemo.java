import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		
			Map<String, String> map=new HashMap<>();//instead of hash map we can use hash table it is synchronised so it is thread safe
			map.put("myname", "navin");
			map.put("actor", "john");
			map.put("ceo", "melisa");
			//if a key used multiple time it mean to update the value
			//value may repeat but key should not
			System.out.println(map.get("myname"));
			System.out.println(map);//sequence is not following hash map and hash set follow hash code
			//key set gives set of keys we can store in set
			Set<String> keys=map.keySet();
			for (String key : keys) {
				System.out.println(key +"<===> "+map.get(key));
			}
	}

}
 