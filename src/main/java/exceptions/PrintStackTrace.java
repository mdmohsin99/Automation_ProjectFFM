package exceptions;

public class PrintStackTrace {

	
	
	public static void main(String[] args) {
		
		try {
		int a, b, c;
		a=10;
		b=0;
		c=a/b;
		System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
