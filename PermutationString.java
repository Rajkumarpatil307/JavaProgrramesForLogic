package com.javaparactice;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		for(int i=0;i<str.length();i++) {
			String str1=""+str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					str1+=str.charAt(j);
				}
			}
			System.out.println(str1);
		
		
			String str2=""+str.charAt(i);
			for(int j=str.length()-1;j>=0;j--) {
				if(str.charAt(i)!=str.charAt(j)) {
					str2+=str.charAt(j);
				}
			}
			System.out.println(str1);
		
		}
	}
}
