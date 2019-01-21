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
public class IncThenDec {
    public void findMax(){
        int arr[]={120, 100, 80, 20, 0};
        int max=arr[0];
        for(int i=1;i<=arr.length;i++){
            if(arr[i-1]>arr[i]){
                System.out.println(arr[i-1]);
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max->"+max);
    }
    public void method2(){
        System.out.println("from method2 ");
        int arr[]={120, 100, 80, 20, 0};
        int middle=arr.length/2;
        int max=0;
        //System.out.println("middle"+middle+" "+arr[middle]);
        
        if(arr[middle]>arr[middle-1]&&arr[middle]>arr[middle+1]){
            System.out.println("from 1st->"+arr[middle]);
            
        }
        else if(arr[0]>arr[1]){
            System.out.println("from 2nd->"+arr[0]);
        }
        
        else if(arr[middle]<arr[middle+1]){
            max=arr[middle];
            for(int i=middle;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("from 4rth->"+max);
        }
        else if(arr[middle]<arr[middle-1]){
            max=arr[0];
            for(int i=0;i<=middle;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("from 5th->"+max);
        }
    }
}
