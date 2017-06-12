package caner;

public class Ucgen {

	public static void main(String[] args) {
		
		int i = 1;
		while (i<=3) {
			
			int j=3-i;
			while (j>0) {
				System.out.print(" ");
				j--;
			}
			int k=2*i-1;
			while (k>0) {
				System.out.print("*");
				k--;
			}
			
			System.out.println();
			i++;
		}
		
		
	}

}
