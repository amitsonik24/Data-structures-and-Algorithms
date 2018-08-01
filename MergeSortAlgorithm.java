package com.algorithms.main;

public class MergeSortAlgorithm {

	public int[] mergeSort(int[] inputArray) {
//		inputArray[0] = 0;
//		inputArray[1] = 2;
//		inputArray[2] = 6;
//		inputArray[3] = 9;
//		inputArray[4] = 13;
//		inputArray[5] = 48;
//		inputArray[6] = 54;
//		inputArray[7] = 76;
//		inputArray[8] = 94;
//		inputArray[9] = 98;
//		inputArray[10] = 32;
//		inputArray[11] = 29;
//		inputArray[12] = 31;
//		inputArray[13] = 6;
//		inputArray[14] = 77;
//		inputArray[15] = 21;
//		inputArray[16] = 17;
//		inputArray[17] = 19;
//		inputArray[18] = 21;
//		inputArray[19] = 24;
		int[] outputArray = null;
		try {
			outputArray = mergeSort(inputArray, 0, inputArray.length-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(int i=0;i<outputArray.length;i++) {
//			System.out.println(outputArray[i]);
//		}
        return outputArray;
	
	}

	private int[] mergeSort(int[] inputArray, int beginIndex, int endIndex) throws Exception {

		int middleIndex = (beginIndex + endIndex) / 2;
		int[] sortedArray1 = null;
		int[] sortedArray2=null;
		if(beginIndex+1!=endIndex && middleIndex+1!=endIndex) {
		sortedArray1 = mergeSort(inputArray, beginIndex, middleIndex);
		sortedArray2 = mergeSort(inputArray, middleIndex + 1, endIndex);
		}
		else if (beginIndex+1==endIndex){
			sortedArray1=new int[1];
			sortedArray2=new int[1];
			sortedArray1[0]=inputArray[beginIndex];
			sortedArray2[0]=inputArray[endIndex];
			
		}
		else {
			sortedArray1 = mergeSort(inputArray, beginIndex, middleIndex);
			sortedArray2=new int[1];
			sortedArray2[0] = inputArray[endIndex];
		}
		
		int[] outputArray=null;
		if(sortedArray1!=null && sortedArray2 !=null) {
		outputArray=merge(sortedArray1, sortedArray2);
		}
		else {
			throw new Exception("Array is null!");
		}

		return outputArray;
	}

	private int[] merge(int[] sortedArray1, int[] sortedArray2) {
		int[] mergedArray = new int[sortedArray1.length+sortedArray2.length];
		int counter = 0;
		int counterOfSortedArray1 = 0;
		int counterOfSortedArray2 = 0;

		while (counter < mergedArray.length) {
			if (counterOfSortedArray1 < sortedArray1.length && counterOfSortedArray2 < sortedArray2.length) {
				if (sortedArray1[counterOfSortedArray1] < sortedArray2[counterOfSortedArray2]) {
					mergedArray[counter] = sortedArray1[counterOfSortedArray1];
					counterOfSortedArray1++;
					counter++;
				} else {
					mergedArray[counter] = sortedArray2[counterOfSortedArray2];
					counterOfSortedArray2++;
					counter++;
				}
			} else if (counterOfSortedArray1 >= sortedArray1.length) {
				mergedArray[counter] = sortedArray2[counterOfSortedArray2];
				counterOfSortedArray2++;
				counter++;
			} else {
				mergedArray[counter] = sortedArray1[counterOfSortedArray1];
				counterOfSortedArray1++;
				counter++;
			}

		}
		return mergedArray;

	}

}
