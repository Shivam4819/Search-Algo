/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author shivam
 */
public class SumClosetToZero {
     public void solve(){
        int sum,min_sum=999999;
         int arr[]={1,60,-10,70,-80,85};
         int n=arr.length;
        int l=0,r=n-1;
        int arr1=arr[l],arr2=arr[r];
        System.out.println("value of l->"+l);
        System.out.println("value of r->"+r);
        if(n<2){
            System.out.println("invalid input");
            return;
        }
        while(l<r){
        sum=arr[l]+arr[r];
            System.out.println("sum->"+sum);
            if(Math.abs(sum)<Math.abs(min_sum)){
                min_sum=sum;
                arr1=arr[l];
                arr2=arr[r];
                System.out.println("min_sum->"+min_sum);
            }
            if(sum<0){
                l++;
            }
            else
                r--;
        }
        System.out.println("final min_sum->"+min_sum);
        System.out.println("value of array->"+arr1+" "+arr2);
    }
}
