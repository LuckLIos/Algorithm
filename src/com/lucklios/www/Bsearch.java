package com.lucklios.www;

public class Bsearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,6,7,22,44,55};
		Bsearch bsearch=new Bsearch();
		System.out.println(bsearch.search(a, 0, a.length, 7)); 

	}
	public int search(int a[] ,int low,int high,int k) {
		int mid;
		while(low <=high) {
			mid=(low+high)/2;
			if(a[mid]==k) {
				return mid+1;
			}
			else if(a[mid]>k) {
				high=mid-1;
			}
			else {
				low =mid+1;
			}
		}
	    return -1;
		
	}
}