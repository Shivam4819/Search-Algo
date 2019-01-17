/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;
import java.util.Arrays;
/**
 *
 * @author shivam
 */
public class MinAndMax {
 
    public void findMinAndMax(){
        int arr[]={1000,11,445,1,330,3000};
        Arrays.sort(arr);
        int min,max;
        min=arr[0];
        max=arr[arr.length-1];
        System.out.println("value of min and max are->"+min+" "+max);
        System.out.println("length is->"+arr.length);
    }
   
}
