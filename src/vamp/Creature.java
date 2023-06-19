package vamp;

import java.util.ArrayList;
import java.util.List;

public class Creature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> w=new ArrayList<String>();
		w.add("hi");
		w.add("hello");
		List<String>e=new ArrayList<String>();
		e.add("for");
		w.addAll(e);
        System.out.println(w.size());
        System.out.println(w);
        for(int i=0;i<w.size();i++) {
        	System.out.println(w.get(i));
        }
        System.out.println("for each loop");
        for(String j:w) {
        	//System.out.println("for each loop");
        	System.out.println(j);
        	
        }
       w.remove(2);
      System.out.println(w.listIterator());
     

	}

}
