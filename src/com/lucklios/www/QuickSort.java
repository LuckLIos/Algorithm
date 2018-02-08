package com.lucklios.www;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		int a[]= {5,23,4,5,646,32,134,32,4};
		QuickSort quickSort=new QuickSort();
		quickSort.quick(a, 0, a.length-1);
        quickSort.printArray(a);
	}
    public void quick(int a[],int low,int hight) {
    	int i=low;
    	int j=hight;
    	int temp=a[i];
    	while(i<j) {
    		while(i<j&&temp<=a[j]) {
    			--j;
    		}
    		if(i<j) {
    			a[i]=a[j];
    			++i;
    		}
    		while(i<j&&temp>a[i]) {
    			++i;
    		}
    		if(i<j) {
    			a[j]=a[i];
    			--j;
    		}
    	}
    	a[i]=temp;
    	quick(a,low,i-1);
    	quick(a,i+1,hight);
    }
    public void printArray(int a[]) {
    	for(int i=0;i<a.length;++i) {
    		System.out.print(a[i]+" ");
    	}
    }
}
