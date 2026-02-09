package DSA;

import java.util.Arrays;

public class movezeroend {
	
	
	public static void main(String args[] ) {
		int[] arr= {1,0,2,1,0};
		int count=0;

//		OPTION 1
		
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				int temp;
//				if(arr[i]==0) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		
//		OPTION 2
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length-1) {
			arr[count]=0;
			count++;
		}
		
		System.out.println("New Array : "+Arrays.toString(arr));
	}
}
