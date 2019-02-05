package viikko04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListojenKertaus {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(100);
		array.add(99);

		LinkedList<Integer> linked = new LinkedList<Integer>();
		
		List<Integer> mikaVaan = linked;
		
		List<Integer> numerot = List.of(100, 99);

	}
}
