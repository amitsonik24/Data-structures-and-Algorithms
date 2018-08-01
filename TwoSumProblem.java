package com.algorithms.main;

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] inputArray = new int[20];
		inputArray[0] = 0;
		inputArray[1] = 2;
		inputArray[2] = 6;
		inputArray[3] = 9;
		inputArray[4] = 13;
		inputArray[5] = 48;
		inputArray[6] = 54;
		inputArray[7] = 76;
		inputArray[8] = 94;
		inputArray[9] = 98;
		inputArray[10] = 2;
		inputArray[11] = 6;
		inputArray[12] = 13;
		inputArray[13] = 6;
		inputArray[14] = 77;
		inputArray[15] = 21;
		inputArray[16] = 17;
		inputArray[17] = 19;
		inputArray[18] = 21;
		inputArray[19] = 24;
        MergeSortAlgorithm sortObject= new MergeSortAlgorithm();
        int[] sortedArray=sortObject.mergeSort(inputArray);
        BinarySearch searchObject= new BinarySearch();
        int noOfPairs=0;
        for(int i=0;i<sortedArray.length-1;i++) {
        if(sortedArray[i]!=0) {
        	if(searchObject.binarySearch(sortedArray, 0, sortedArray.length-1, -sortedArray[i])!=-1) {
        		noOfPairs++;
        	}
        }
        }
        System.out.println("ACTUAL NUMBER OF PAIRS ARE: "+ noOfPairs/2);
	}

}
