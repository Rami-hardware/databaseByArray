package trininng;
import java.util.Arrays;
import java.util.Scanner;
public class userAdd {
    public userAdd()
    {
        System.out.println("Welcome to my progaram");
    }
    public void addAndPrint()
    {
        // calling sacnner 
        Scanner input = new Scanner(System.in);
        // Show in scrieen "Please enter your name: "
        System.out.println("Please enter your name: ");
       
        // creat new array hold value from user and store it 
        String[] names = new String[input.nextLine().length()];
        for(int i = 0; i < names.length; i++)
        {
            names[i] = input.nextLine();
            System.out.println("user added");
              
        }
        // Show the store values 
        for(int i = 0; i < names.length; i++)
        {
            System.out.print("users " + (i+0) + " : ");
            System.out.println(names[i] + "\n");
            
        }
    }
}
