package com.lucklios.www;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,34,56,7,8,93,3,4};
       InsertSort insert=new InsertSort();
       insert.insert(a);
       insert.printArray(a);
	}
  
    public void insert(int a[]) {
    	int i,j,temp;
    	for(i=1;i<a.length;++i) {
    		temp=a[i];
    		j=i-1;
    		while(j>0&&a[j]>temp) {
    			a[j+1]=a[j];
    			--j;
    		}
    		a[j+1]=temp;
    	}
    }
    public void printArray(int a[]) {
    	for(int i=0;i<a.length;++i) {
    		System.out.print(a[i]+" ");
    	}
    }
}
