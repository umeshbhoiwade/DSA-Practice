package DSA;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class revarr {
	
	
	static void rev(ArrayList<Integer> arr,int n) {
		int temp;
		int last=n-1;
		for(int i=0;i<n/2;i++) {
			temp=arr.get(i);
			arr.set(i, arr.get(last-i));
			arr.set(last-i, temp);
			
		}
		
	}
	static void revarr(int arr[]) {
		int temp;
		int s=0;
		int e=arr.length-1; 
		while(s<e) {
			temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
			
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array n");
		int n=sc.nextInt();
		ArrayList<Integer> array= new ArrayList<>() ;
		int arr[]=new int[n];
		System.out.println("Enter Elements in Array");
		for(int i=0;i<n;i++) {
//			array.add(sc.nextInt());
			arr[i]=sc.nextInt();
		}
		System.out.println("Here is  Array : "+Arrays.toString(arr));
//		rev(array,n);
		revarr(arr);
		System.out.println("Here is Reverse array : "+Arrays.toString(arr));
		
	}

}
