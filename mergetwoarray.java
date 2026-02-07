package DSA;

import java.util.ArrayList;

import java.util.Collections;

public class mergetwoarray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int n=(arr1.length<arr2.length)?arr2.length:arr1.length;
		
		ArrayList<Integer> mergedArray=new ArrayList<>();
		for(int i=0;i<n;i++) {
			mergedArray.add(arr1[i]);
			mergedArray.add(arr2[i]);
		}
		Collections.sort(mergedArray);
		
		System.out.println("Merged Array : "+mergedArray);
		
	}
}
