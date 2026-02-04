package DSA;

import java.util.ArrayList;

public class besttimetosellbuystock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,4,3,5,6,2};
		ArrayList<Integer> ansarray=new ArrayList<>();
		int minPrice=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minPrice) {
				minPrice=arr[i];
			}
			if(arr[i]-minPrice>maxprofit) {
				maxprofit=arr[i]-minPrice;
			}
		}
		System.out.println("Profit : "+maxprofit);
		
	}

}
