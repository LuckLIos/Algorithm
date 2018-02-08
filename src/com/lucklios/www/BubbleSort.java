package com.lucklios.www;

public class BubbleSort {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,34,45,5,32,23,323,323,323,34,4};
		BubbleSort hellow =new BubbleSort();
		hellow.bubbleSort(a);
		hellow.printArray(a);
	}
	
	public void bubbleSort(int a[]) {
		int i,j,flag,temp;
		for(i=a.length-1;i>0;--i) {
			flag=0;
			for(j=0;j<i;++j) {
				if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
				}
			}
			if(flag==0) {
				return ;
			}
		}
	}
	public void printArray(int a[]) {
		for(int i=0;i<a.length;++i ) {
			System.out.print(a[i]+" ");
		}
	}
}
