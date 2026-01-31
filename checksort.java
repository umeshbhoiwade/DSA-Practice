package DSA;

public class checksort {
	
	public static void main(String args[]) {
		boolean asc=true;
		boolean desc=true;
		int[] arr= {98 ,45 ,32,21};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				desc=false;
			}
			if(arr[i]>arr[i+1]) {
				asc=false;
			}
		}
		 
		if(asc) {
			System.out.println("Asending and Sorted ");
		}
		else if (desc){
			System.out.println("Decending and Sorted ");
		}
		else {
			System.out.println("Not Sorted ");
		}
	}
}
