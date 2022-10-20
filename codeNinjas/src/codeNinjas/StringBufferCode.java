package codeNinjas;

public class StringBufferCode {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		str.setCharAt(2, 'z');
		System.out.println(str);
		System.out.println("Length before append:"+ str.length());
		str.append("def");
		System.out.println(str +" \n"+"Length after append:"+str.length());
		
		System.out.println(".........................");
		String s = new String("d");
		//String s = "d";
		System.out.println(s.length());
		for (int i=0;i<5;i++) {
			s=s+'z';
			System.out.println(s);
		}
		System.out.println(s.length());
	}

}
