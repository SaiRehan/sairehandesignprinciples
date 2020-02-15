package t1;

import java.util.Scanner;

public class calcultor{

    public static void main(String[] args) {

       


        Scanner input = new Scanner(System.in);
        double userInput1;
        int userChoice;

        System.out.print("Please Enter The First Number: ");
        userInput1 = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        double userInput2 = input.nextDouble();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = input.nextInt();
       
        switch (userChoice){
        case 1:
            Add ad=new Add();
            ad.opp(userInput1,userInput2);
            
            break;
        case 2:
        	   Sub sub=new Sub();
        	   sub.opp(userInput1,userInput2);
               break;
           case 3:
               Div div=new Div();
               div.opp(userInput1,userInput2);
               break;
           case 4:
               Multi mul=new Multi();
               mul.opp(userInput1,userInput2);
               break;
           }


       }

   }