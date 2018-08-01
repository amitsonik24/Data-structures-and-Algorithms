package com.algorithms.main;


/**
 * Write a description of class bubblesorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bubblesorting {

	public static void main(String[] args) {
	    int [] A=new int[10];
	    A[0]=5;
	    A[1]=3;
	    A[2]=8;
	    A[3]=4;
	    A[4]=9;
	    A[5]=2;
	    A[6]=1;
	    A[7]=12;
	    A[8]=90;
	    A[9]=15;
	    int i,j,tmp;
	    for(i=0;i<10;i++)
	    for(j=0;j<9-i-1;j++)
	    {
	        if(A[j]>A[j+1])
	        {
	            tmp=A[j];
	            A[j]=A[j+1];
	            A[j+1]=tmp;
            }
	       }
	       System.out.println("Array in asceding order is-->");
	       for(i=0;i<10;i++)
	       System.out.print(A[i]+"\n");
	   }
}

