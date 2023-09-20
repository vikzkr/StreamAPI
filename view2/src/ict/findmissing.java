package ict;

import java.util.Arrays;
import java.util.Optional;

public class findmissing {
	
	public static void main(String[] args) {
		 int[] inputArray = {1, 2, 4, 6, 7,6, 9};
		Optional<Integer> max =  Arrays.stream(inputArray).mapToObj(Integer::valueOf).max(((i,j) -> i>j?1:i<j?-1:0));
		int maxNumber = max.get();
		boolean[] missingArray = new boolean[maxNumber+1];
		for (int num : inputArray) {
			missingArray[num] = true;
		}
		for (int k = 1; k <= maxNumber; k++) {
			
			if(missingArray[k]==false)
			{
				System.out.println(k);
			}
			
		}
	}

}
