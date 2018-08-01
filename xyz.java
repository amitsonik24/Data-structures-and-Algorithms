package com.algorithms.main;

class xyz{
public static void main(String[] args){
    int[]a=new int[5];
    a[0]=1;
    a[1]=2;
    a[2]=3;
    a[3]=4;
    a[4]=5;
    int n=7;
    int lower=0;
    int upper=4;
    int middle=0;
    boolean flag=false;
    while(lower<=upper){
        middle=(upper+lower)/2;
        if(a[middle]==n){
            flag=true;
            break;
        }
        else if(n>a[middle]){
            lower=middle+1;
        }
        else{
        upper=middle-1;
    }
        
}


if(flag==true){
        
        System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }
}
}
    
   