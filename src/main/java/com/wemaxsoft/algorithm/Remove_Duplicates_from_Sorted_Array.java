package com.wemaxsoft.algorithm;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {

	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
	 */
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,1,2};
		
		Remove_Duplicates_from_Sorted_Array test = new Remove_Duplicates_from_Sorted_Array();
		int k = test.removeDuplicates(nums);
		
		int[] newNums = new int[k];
		for (int i=0; i<k; i++) {
			newNums[i] = nums[i];
		}
		
        System.out.println(Arrays.toString(newNums));
	}
	
	public int removeDuplicates(int[] nums) {
		int k = 0;
        int p1 = 0;
        int p2 = 1;
        
        while (p2 < nums.length) {
            int a = nums[p1];
            int b = nums[p2];
            
            if (a != b) {
                nums[++p1] = b;
                k++;
            }
            
            p2++;
        }
        
        k++;
        
        return k;
    }

}
