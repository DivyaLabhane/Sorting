import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(52);
		list.add(45);
		list.add(67);
		
		System.out.println("Brfore Sorting : " + list);
		
		Collections.sort(list, (i,j)-> i>j ? -1:1);
		
		System.out.println("After sorting : " + list);
	}
}
