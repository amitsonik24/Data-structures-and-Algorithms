package com.algorithms.main;

public class BubbleSort {

	public static void main(String[] args) {

		boolean flag=true;
		int[] a= new int[8];
		a[0] = 23;
		a[1] = 28;
		a[2] = 45;
		a[3] = 56;
		a[4] = 3;
		a[5] = 26;
		a[6] = 57;
		a[7] = 12;
		int noOfSwaps=0;
		while(flag) {
			
		for(int i=0;i<7;i++) {
		if(a[i]>a[i+1]) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			noOfSwaps++;
		}
		
		}
		if(noOfSwaps==0) {
			flag=false;
			break;
		}
		else {
			noOfSwaps=0;
		}
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println(a[i]);
		}
		
	}

}
