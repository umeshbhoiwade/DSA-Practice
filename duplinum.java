package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class duplinum {
	public static void main (String args[]) {
		int[] arr= {1,12,4,12,1};
		ArrayList<Integer> array=new ArrayList<>();
		ArrayList<Integer> unique=new ArrayList<>();
		ArrayList<Integer> dupli=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(!unique.contains(arr[i])) {
				unique.add(arr[i]);
			}
			else {
				dupli.add(arr[i]);
			}
		}
		
		
		System.out.println("Unique array : "+unique);
		System.out.println("Duplicate  array : "+dupli);
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				array.add(arr[i]);
			}
		}
		System.out.println("Duplicate Element : "+array);
	}
}
