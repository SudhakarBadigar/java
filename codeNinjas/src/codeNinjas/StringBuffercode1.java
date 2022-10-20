package codeNinjas;

public class StringBuffercode1 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("");
		System.out.println(str);
		System.out.println(str.length());
		for(int i = 0;i<5;i++) {
			str.append((char)('a'+i));
		}
		System.out.println(str);
		System.out.println(str.length());
	}

}
