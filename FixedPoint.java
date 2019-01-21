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
        int arr[]={-10,-5,3,4,7,9};
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
        
    }
}
