package trininng;
import java.util.Scanner;
public class userAdd {
    public userAdd()
    {
        System.out.println("Welcome to my progaram");
    }
    public void addAndPrint()
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("how many users you want to add: ");
       int countUser = Integer.parseInt(input.nextLine());
       
       String [] names = new String[countUser];
       for(int i = 0; i < names.length; i++)
       {
           System.out.println("user " +(i+1) + " : ");
           names[i] = input.nextLine();
       }
           
       for (int i = 0; i < names.length; i++)
       {
           System.out.print("your user " + (i+1) + " : ");
           System.out.print(names[i] + "\n");
       }
    }
}
