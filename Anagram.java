/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UsefulCode;

/**
 *
 * @author Roman Wang
 */
/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Anagram {
	
	public static String isAna(String a, String b){
		if(sorter(a).equals(sorter(b))){
			return "YES";
		}
		return "NO";
	}
	
	public static String sorter(String a){
		char[] chars = a.toCharArray();
		Arrays.sort(chars);
		return (new String(chars));
	}
	
    public static void main(String args[] ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String temp;
        for(int i = 0; i<N; i++){
        	temp = br.readLine();
        	System.out.println(isAna(temp.substring(0,temp.indexOf(" ")),temp.substring(temp.indexOf(" ")+1,temp.length())));
        }
    }
}

