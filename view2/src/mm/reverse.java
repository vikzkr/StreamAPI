package mm;

import java.util.Collections;

public class reverse {
	
	public static void main(String[] args) {
		
		
		String r  = "vikas mishra";
		char[] ch = r.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = ch.length-1; i >= 0; i--) {
			sb.append(ch[i]);
				
		}
		
		System.out.println(sb.toString());
		
	
		new StringBuilder(r).reverse().toString()	;
		}

}
