package com.java.demo;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        for(int i=10;i<=40;i++) {
        	if(isPrime(i)) {
        		System.out.println("Prime numbers are "+i);
        		count++;
        	}
        	if(count==4) {
        		break;
        	}
        	
        }
        System.out.println("Number Prime numbers are "+count);
	}
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				
				return false;
			}
		}
		return true;
	}

}
