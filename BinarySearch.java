package com.javaparactice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int k=3; // 4
		int st=0;
		int end=arr.length-1;
		int mid=(st+end)/2;
		
		for(int i=0;i<arr.length;i++) {	
			if(arr[mid]==k) {
				  mid=(st+end)/2;
				break;
			}else if(arr[mid]<k) {
				st=mid;
				mid=(st+end)/2;
			}else {
				end=mid-1;
				mid=(st+end)/2;
			}
			
		
		}
		System.out.println("the index of the value is "+mid);
			
	}

}
