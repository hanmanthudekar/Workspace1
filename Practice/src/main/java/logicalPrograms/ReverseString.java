package logicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "I am Hanmant";
		String []words = str.split(" ");
		
		String line="";
		for(String w:words) {
			String rev="";
			for(int i=w.length()-1;i>=0;i--) {
				rev = rev + w.charAt(i);
			}
			line = line +rev+" ";
		}
		System.out.println(line);
	}
}
