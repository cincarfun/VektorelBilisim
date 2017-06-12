package caner;

import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] dizi = new int[5];
		int i=0;
		do {
			System.out.println("sayý gir");
			dizi[i]=scan.nextInt();
			i++;
		} while (i<dizi.length);
		int j=dizi.length-1;
		while (j>=0) {
			System.out.println(dizi[j]+ " ");
			j--;
		}
		
		
	}

}
