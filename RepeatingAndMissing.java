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
public class RepeatingAndMissing {
    public void repeatAndMiss(){
        int arr[]={1,1,2,3,4,6};
        int x=arr[0],temp=1,count=0;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
            if(arr[i]==temp){
              temp++;
            }
        }
        System.out.println("count->"+count);
        System.out.println("temp->"+temp);
    }
}
