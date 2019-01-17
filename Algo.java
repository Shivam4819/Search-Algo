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
public class Algo {

    /**
     * @param args the command line arguments
     */
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
      SumClosetToZero sumClose=new SumClosetToZero();
     sumClose.solve();
      
      FirstTwoSmallestNum first=new FirstTwoSmallestNum();
     first.find();
      
      MinAndMax minAndmax=new MinAndMax();
     minAndmax.findMinAndMax();
     
     NumberOfOccurance numberOfOccurance=new NumberOfOccurance();
     numberOfOccurance.findOccurance();
     
     FindMissing find=new FindMissing();
     find.findNum();
     find.method2();
    
    }
    
}
