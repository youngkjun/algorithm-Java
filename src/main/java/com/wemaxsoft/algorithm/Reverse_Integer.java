package com.wemaxsoft.algorithm;

public class Reverse_Integer {
	
	/*
	 * https://leetcode.com/problems/reverse-integer/
	 */

	public static void main(String[] args) {
		Reverse_Integer test = new Reverse_Integer();
		
		int result = 0;
		
		result = test.reverse(1534236469);
		System.out.println(result);
		
		result = test.reverse(-2147483648);
		System.out.println(result);
	}
	
	public int reverse(int x) {
		if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;
        
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = x * -1;
        }
        long result = 0;
        int m = 0;
        
        do {
            m = x % 10;
            x = x / 10;
            
            result = result * 10 + m;
        } while(x > 0);
        
        if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) result = 0;
        
        return (int) result * sign;
    }
}
