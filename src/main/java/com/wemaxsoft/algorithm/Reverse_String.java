package com.wemaxsoft.algorithm;

public class Reverse_String {

	/*
	 * https://leetcode.com/problems/reverse-string
	 */
	
	public static void main(String[] args) {
		Reverse_String test = new Reverse_String();
		char[] s = new char[]{'H','a','n','n','a','h'};
		test.reverseString(s);
		
		System.out.println(s);
	}
	
	public void reverseString(char[] s) {
        int leng = s.length;
        int half = leng / 2;
        
        for (int i=0; i<half; i++) {
            char a = s[i];
            char b = s[s.length - i - 1];
            s[i] = b;
            s[s.length - i - 1] = a;
        }
    }
}
