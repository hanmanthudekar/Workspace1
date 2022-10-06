package logicalPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		for(int i=1;i<1000;i++) {
			int b;
			int c=0;
			int d=i;
			while(d>0) {
				b = d%10;//1,7,3
				c = b*b*b+ c;//1//
				d = d/10;
			}
			if(i==c) {
				System.out.println(i);
			}	
		}
	}
}
