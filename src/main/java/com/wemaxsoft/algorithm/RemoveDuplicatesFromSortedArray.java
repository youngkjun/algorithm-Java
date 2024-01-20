package com.wemaxsoft.algorithm;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = new int[]{1,1,2};
		
		RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
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
