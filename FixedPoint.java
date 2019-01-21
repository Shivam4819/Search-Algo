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
public class FixedPoint {
    public void findFixedPoint(){
        int arr[]={-10,-5,3,4,7,9};
        int flag=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                System.out.println(i);
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("-1");
        }
    }
    public void method2(){
        int arr[]={-10, -1, 0, 3 , 10, 11, 30, 50, 100};
        System.out.println("from 2 ");
        int middle=arr.length/2;
        int flag=1;
       // System.out.println(middle);
        if(middle==arr[middle]){
            System.out.println(middle);
            flag=0;
        }
        else if(middle>arr[middle]){
            for(int i=middle;i<arr.length;i++){
                if(arr[i]==i){
                    System.out.println("from right side");
                   System.out.println(i);
                   flag=0;
                }   
            }
        }
        else if(middle<arr[middle]){
            for(int i=0;i<=middle;i++){
                if(arr[i]==i){
                    System.out.println("from left side"); 
                   System.out.println(i);
                   flag=0;
                }   
            }
        }
        if(flag==1){
            System.out.println("-1");
        }
        int n=arr.length;
        
        System.out.println("from method3->");
        System.out.println(method3(arr, 0, n-1));
    }
    
    public int method3(int arr[],int low,int high){
        if(high>=low){
            int mid=(low+high)/2;

            if(arr[mid]==mid)
                return mid;

            if(arr[mid]>mid){
                return method3(arr, 0, mid-1);
            }
            else{
                return method3(arr, mid+1, high);
            }
        }
        return -1;
    }
}
