
package trininng;
import java.util.Scanner;
public class Calc {

  
  public int puls(int a ,int b)
  {
      return a + b;
  }
   public int min(int a ,int b)
  {
      return a - b;
  }
    public int mul(int a ,int b)
  {
      return a * b;
  }
     public int div(int a ,int b)
  {
      if (a == 0)
          return 0;
      return a / b;
  }
     
     public void des(int value){
         int i = value;
         
         do
         {
             System.out.println(i);
             i--;
         }
         while(i >= 1);
     }
}
