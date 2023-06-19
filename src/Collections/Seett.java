package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Seett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a=new ArrayList<String>();
		a.add("code");
		a.add("is");
		a.add("HOD");
		Set<String>b=new HashSet<>();
		b.addAll(a);
		b.add("code");
		System.out.println(b);
		System.out.println(b.size());
		for(String s:b) {
			System.out.println(s);
		}

	}

}
