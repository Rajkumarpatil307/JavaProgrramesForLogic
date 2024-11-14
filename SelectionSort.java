package com.javaparactice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,1,2,8}; //1 2 4 5 8
		
		int var=0;
		for(int i=0;i<arr.length;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++ ) {

				if(arr[j]<min) {
					min=arr[j];
					var=j;
				}

			}
			int temp=arr[i];
			arr[i]=arr[var];
			arr[var]=temp;
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}

}
