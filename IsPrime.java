/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class IsPrime {
	public static String isPrime(int i){
		if(i==1){
			return "Not Prime";
		}
		if(i==2){
			return "Prime";
		}
		for(int k = 2; k*k<=i; k++){
			if(i%k==0){
				return "Not Prime";
			}
		}
		return "Prime";	
	}
    public static void main(String args[] ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        System.out.println(isPrime(N));
        
        /*
        finding the error
        for(int i = 1; i<=100; i++){
        	System.out.println(i+" "+isPrime(i));
        }
        */
    }
}
