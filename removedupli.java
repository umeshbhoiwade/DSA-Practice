package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class removedupli {
	
	static ArrayList<Integer> remdupli(ArrayList<Integer> array) {
		ArrayList<Integer> ans=new ArrayList<>();
		for(int a:array) {
			if(!ans.contains(a)) {
				ans.add(a);
			}
			
		}
		return ans;
	}
	
	
	static ArrayList<Integer> remdupliwithoutnewlist(ArrayList<Integer> array) {
		
		for(int i=0;i<array.size()-1;i++) {
			for(int j=i+1;j<array.size()-1;j++) {
				if(array.get(i).equals(array.get(j))) {
					array.remove(j);
				}
			}
		}
		return array;
	}
	public static void main(String args[]) {
		int n;
		ArrayList<Integer> array=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of Array:");
		n=sc.nextInt();
		System.out.print("Enter Values in Array:");
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		
		
		
//		System.out.println("Array Without Duplicate is : "+remdupli(array));
		System.out.println("Array Without Duplicate is : "+remdupliwithoutnewlist(array));
		
	}
}
