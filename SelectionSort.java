package com.algorithms.main;

/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 23;
		a[1] = 28;
		a[2] = 45;
		a[3] = 56;
		a[4] = 3;
		a[5] = 26;
		a[6] = 57;
		a[7] = 12;
		a[8] = 18;
		a[9] = 19;

		int first = 0;
		int firstPosition = 0;

		for (int i = 0; i < 10; i++) {
			first = a[i];
			for (int j = i + 1; j < 10; j++) {
				if (a[j] < first) {
					first = a[j];
					firstPosition = j;

				}

			}
			if(first!=a[i]) {
			int temp = a[i];
			a[i] = first;
			a[firstPosition] = temp;
			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}

	}
}