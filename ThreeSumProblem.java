package com.algorithms.main;

import java.util.ArrayList;

public class ThreeSumProblem {
	public static void main(String[] args) {
		int[] inputArray = new int[20];
		inputArray[0] = 1;
		inputArray[1] = 3;
		inputArray[2] = -4;
		inputArray[3] = 5;
		inputArray[4] = -6;
		inputArray[5] = 48;
		inputArray[6] = 54;
		inputArray[7] = 76;
		inputArray[8] = 94;
		inputArray[9] = 98;
		inputArray[10] = -2;
		inputArray[11] = 61;
		inputArray[12] = -15;
		inputArray[13] = 69;
		inputArray[14] = 77;
		inputArray[15] = 21;
		inputArray[16] = 17;
		inputArray[17] = 19;
		inputArray[18] = 21;
		inputArray[19] = 24;
		MergeSortAlgorithm sortObject = new MergeSortAlgorithm();
		int[] sortedArray = sortObject.mergeSort(inputArray);
		BinarySearch searchObject = new BinarySearch();
		ArrayList<Integer> multiList= new ArrayList<Integer>();
		int noOfTriplets = 0;
		for (int i = 0; i < sortedArray.length - 1; i++) {
			for (int j = 0; j < sortedArray.length - 1; j++) {
				if (i != j) {
					if ((sortedArray[i] + sortedArray[j]) != 0) {
						if (searchObject.binarySearch(sortedArray, 0, sortedArray.length - 1,
								-(sortedArray[i] + sortedArray[j])) != -1) {
							if(!multiList.contains(sortedArray[i]*sortedArray[j]*(-(sortedArray[i]+sortedArray[j])))) {
								multiList.add(sortedArray[i]*sortedArray[j]*(-(sortedArray[i]+sortedArray[j])));
								System.out.println("FOUND!");
								System.out.println(sortedArray[i]+","+sortedArray[j]+","+(-(sortedArray[i]+sortedArray[j])));
								noOfTriplets++;

							}
						}
					}

				}
			}
		}
		System.out.println("ACTUAL NUMBER OF TRIPLETS ARE: " + noOfTriplets);
	}
}
