package com.algorithms.main;

/**
 * Hello world!
 *
 */
public class GcdEuclid 
{
    public static void main( String[] args )
    {
       int number1=200;
       int number2=150;
       System.out.println("The GCD of the two numbers is: " + gcd(number1,number2));
       
    }


public static int gcd(int number1, int number2){
	
	if(number1==0||number2==0){
		if(number1==0&number2==0){
			return 0;
		}
		else{
			return (number1==0?number2:number1);
		}
	}
	else{
		if(number1>number2){
			int remainder= number1%number2;
			return gcd(number2,remainder);
		}
		else if(number1<number2){
			int remainder= number2%number1;
			return gcd(number1,remainder);
		}
		else{
			return number1;
		}
	}
	
}

}
