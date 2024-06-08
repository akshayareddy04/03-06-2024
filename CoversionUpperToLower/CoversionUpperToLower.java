package Assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CoversionUpperToLower {

		public static void main(String[] args) {
			List<String> stringlist = new ArrayList<>();
			stringlist.add("bhanu");
			stringlist.add("sree");
			stringlist.add("ananya");		
			stringlist.add("manu");
			System.out.println(stringlist);
			
			List<String> Uppercase = stringlist.stream().map(String::toUpperCase).collect(Collectors.toList());
			System.out.println(Uppercase);
			
			List<String> Lowercase = stringlist.stream().map(String::toLowerCase).collect(Collectors.toList());
			System.out.println(Lowercase);
		}

	}

