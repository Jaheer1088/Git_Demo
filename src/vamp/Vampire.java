package vamp;

public class Vampire {
	public static void main(String[]args) {
		String s="nobody alive";
		int count=1001;
		char ch=s.toUpperCase().charAt(2);
//		String ch=s.toUpperCase();
//		String ch1=ch.substring(0,3);
		//char c=ch.charAt(0);
		//String ch1=Character.toString(ch);
		 String ch1=ch+Integer.toString(++count);
		if(s.endsWith("e")) {
		System.out.println(ch1);
		}
		else {
			System.out.println("error");
		}
		//String ID=Character.toString(ch);
		//System.out.print(c);
	// ID=ID+count;
	//count++;
//		System.out.print(ID);
//		System.out.println(s.contains("alive"));
	}

}
