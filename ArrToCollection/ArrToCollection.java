package Assign2;
import java.util.*;
public class ArrToCollection {

		public static void main(String[] args) {
			String names[] = {"Chikky", "Rinnu", "frooty", "param"};
			System.out.println(Arrays.toString(names));
			List<String> namesList = new ArrayList<>(Arrays.asList(names));
			namesList.add("kanni");
			namesList.add(4,"nikha");
			System.out.println(namesList);
			
			ListIterator ltr = namesList.listIterator();
			
			while(ltr.hasNext()) {
				Object ob = ltr.next();
				System.out.println(ob);
			}
		}

	}
