package caner;

import java.util.Scanner;

public class Ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("ilk sayý?");
		int sayi1 = scan.nextInt();

		System.out.println("ikinci sayý?");
		int sayi2 = scan.nextInt();

		if (sayi1 > sayi2) {
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
		}

		while (sayi1 <= sayi2) {
			if (sayi1 % 2 == 0)
				System.out.println(sayi1 + " ");
			sayi1++;

		}
	}

}
