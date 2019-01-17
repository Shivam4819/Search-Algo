/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;
import java.util.Scanner;
/**
 *
 * @author shivam
 */
public class NumberOfOccurance {
    public void findOccurance(){
        int arr[]={1,1,2,2,2,2,3};
        Scanner scanner=new Scanner(System.in);
        System.out.print("give value of x->");
        int x=scanner.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
            else if(arr[i]>x)
                break;
            System.out.println("value of i="+i);
        }
        if(count>0)
            System.out.println("count->"+count);
        else
            System.out.println("-1");
    }
}
