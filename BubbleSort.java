package com.javaparactice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {4,5,1,2,8}; //1 2 4 5 8
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int n:arr) {
	System.out.print(n+" ");
}
	}

}
