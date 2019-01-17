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
public class FindMissing {
  public void findNum(){
      int arr[]={1,2,4,5,6};
      int count=1;
      
      for(int i=0;i<arr.length;i++){
          if(arr[i]==count){
              count++;
          }
          else{
              System.out.println(count);
              break;
          }
      }
  }
  
  public void method2(){
      int arr[]={1,2,4,5,6};
      int total,n=arr.length;
      total= (n+1)*(n+2)/2;
      for (int i = 0; i< n; i++) 
           total -= arr[i]; 
      System.out.println(total);   
  }
}
