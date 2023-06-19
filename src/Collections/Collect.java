package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>i=new ArrayList<Integer>();
		i.add(10);
		i.add(15);
		List<Integer>a=new ArrayList();
		a.add(5);
		a.addAll(i);
		Collections.reverse(a);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		System.out.println(Collections.max(a));
		System.out.println(Collections.min(a));
		Collections.reverse(a);
		System.out.println(a);
		System.out.println(Collections.frequency(a,0));
		
		//a.remove(10);
//		System.out.println(a.size());
//System.out.println(a);
//for(int j:a) {
//	System.out.println(j);
//}
//        Iterator<Integer>k=a.iterator();
//        while(k.hasNext()){
//        	System.out.println(k.next());
//        }
       
        
	}

}
