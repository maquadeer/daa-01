/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author student
 */
public class MergeSort {
    public void merge(int a[], int low,int mid, int high)
    {
        int []b = new int [100];
        int h,i,j,k;
        h=i=low;
        j=mid+1;
        while((h<=mid)&&(j<=high))
        {
            if(a[h]<=a[j])
            {
                b[i] = a[h];
                h =h+1;
            }
            else
            {
                b[i] = a[j];
                j= j+1;
            }
            i=i+1;
        }
        if(h>mid)
            for(k=j; k<=high;k++)
            {
                b[i]=a[k];
                i=i+1;
            }
        else
            for(k=h;k<=mid;k++)
            {
                b[i] =a[k];
                i=i+1;
            }
        for(k =low;k<=high;k++)
            a[k]=b[k];
    }
    
    public void MergeSort(int a[],int low,int high)
    {
        int mid;
        if(low< high)
        {
            mid =(low+high)/2;
            MergeSort(a,low,mid);
            MergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }   
    }
    public void display(int a[], int n)
    {
        int i;
        for(i=0;i<n;i++)
            System.out.print("\n Element["+i+"] = " +a[i]);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a;
        a = new int []{10,4,7,5,2,1,12};
        int i,n=7;
        MergeSort ms = new MergeSort();
        ms.display(a,n);
        ms.MergeSort(a,0,n-1);
        System.out.println("\n " +n+ " Elements after sorting are :");
        ms.display(a, n);
        
        
    }
    
}
