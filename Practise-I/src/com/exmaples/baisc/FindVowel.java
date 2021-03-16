package com.exmaples.baisc;
import java.util.*;
public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a char: ");
		boolean isVowel = false;	
		Scanner obj = new Scanner(System.in);
		char vow = obj.next().charAt(0);
		obj.close();

		switch(vow) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel  = true;

		}
		if(isVowel == true) {
			System.out.println(vow+" is a vowel");
		}

		else {
			if((vow>='a'&&vow<='z')||(vow>='A'&&vow<='Z'))
				System.out.println(vow + " is a consonant");

			else
				System.out.println("Input is not an alphabet");
		}
	}

}
