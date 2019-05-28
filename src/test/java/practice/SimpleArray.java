package practice;

public class SimpleArray {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0]= 1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] arr1= {"Rana","r1","r3"};
		
		
		
		for(int j=0; j<arr1.length;j++) {
			System.out.println(arr1[j]);
		}
		arr1[1]="RanaTwo";
		System.out.println(arr1[1]);
		
		for(int k=0; k<arr1.length;k++) 
			System.out.println(arr1[k]);
		
	}

}
