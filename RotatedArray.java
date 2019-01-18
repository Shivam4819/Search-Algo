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
public class RotatedArray {
    public void search(){
        int arr[]={3,4,5,1,2};
        int element=4;
        int pivot=arr.length/2;
        System.out.println(arr[pivot]);
        
        if(element>arr[0]){
            for(int i=0;i<pivot;i++){
                if(arr[i]==element){
                    System.out.println("found at index"+i);
                    break;
                }
            }
        }
        else{
            for(int i=pivot;i<arr.length;i++){
                if(arr[i]==element){
                    System.out.println("found at index"+i);
                    break;
                }
            }
        }
    }
    
}
