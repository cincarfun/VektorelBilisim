package caner;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] dizi = new int[5];
		int i = 0;
		while (i < 5) {
			System.out.println("sayý giriniz");
			dizi[i] = scan.nextInt();
			i++;
		}

		int k = 0;
		int temp = 0;
		while (k < dizi.length) {
			int j = k + 1;
			while (j < dizi.length) {
				if (dizi[k] > dizi[j]) {
					temp = dizi[k];
					dizi[k]=dizi[j];
					dizi[j] = temp;

				}
				j++;
			}
			k++;
		}

		for (int j = 0; j < dizi.length; j++) {
			System.out.println(dizi[j] + " ");
		}

	}

}
