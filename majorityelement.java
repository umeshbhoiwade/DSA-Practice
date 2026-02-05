package DSA;

public class majorityelement {
	public static void main (String args[]) {
		int[] arr= {1,2,2,1,2}; 
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				ans=arr[i];
			}
		}
		
		System.out.println("Element : "+ans);
	}
}
