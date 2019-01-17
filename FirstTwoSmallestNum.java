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
public class FirstTwoSmallestNum {
    
    public void find(){
    int arr[]={12,13,1,10,34,2};
    int first,second,arrlen=arr.length;
    
    first=second=Integer.MAX_VALUE;
        System.out.println("first and second value are->"+first+second);
        
    if(arrlen<2){
        System.out.println("invalid input");
        return;
    }    
    for(int i=0;i<arr.length;i++){
        if(arr[i]<first){
            second=first;
            first=arr[i];
        }
        else{
            second=arr[i];
        }
    }
        System.out.println("first and second->"+first+" "+second);
    
    }
    
}
