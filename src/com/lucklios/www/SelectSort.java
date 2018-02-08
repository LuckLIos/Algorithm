package com.lucklios.www;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,34,35,3,2,34,5,2,6};
       SelectSort selectSort=new SelectSort();
      selectSort.select(a);
      selectSort.printArray(a);
	}
   public void select(int a[]) {
	   int i,j,k,temp;
	   for(i=0;i<a.length;i++) {
		   k=i;
		   for(j=i+1;j<a.length;++j) {
			   if(a[j]<a[k]) {
				   k=j;
			   }
		   }
		   temp=a[i];
		   a[i]=a[k];
		   a[k]=temp;
	   }
   }
   public void printArray(int a[]) {
	   for(int i=0;i<a.length;++i) {
		   System.out.print(a[i]+" ");
	   }
   }
}
