/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import java.util.*;

/**
 *2
 * 
 * @author Admin
 */
public class Mavenproject2 {
    public static boolean game (){
        int numties=0;
        int numuser=0;
        int numcomp=0;
        int userchoice =0;
        int computerchoice=0;
        Scanner sc1=new Scanner (System.in );
        //ask user for number of rounds 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose how many rounds you want to play!");
        int numrounds= 0;
        numrounds = Integer.parseInt(sc.nextLine());
        //TEST USER INPUT IF BTW 1-10
        if (numrounds >10 || numrounds<1){
            //exit program 
            System.out.println("End of program!");
            
        }
        
        while (numrounds >0){
            //ask user for choice btw the 3 options R P S
            
            System.out.print("Please enter choice: 1-Rock,2-Paper,3-Scissors");
            userchoice = Integer.parseInt(sc1.nextLine());
            //generate computers choice 
            Random rand=new Random();
            computerchoice= rand.nextInt(3)+1;
            //compare both choices to determine winner 
            //when user picks rock
            if (userchoice== 1){
                if (computerchoice==1){
                    numties++;
                    System.out.println("It's a tie for this round!");
                }
                if (computerchoice==2){
                    numcomp++;
                    System.out.println("You lost to computer this round!");
                    
                }
                if (computerchoice==3){
                    numuser++;
                    System.out.println("You won this round ");
                }
                
            }
            //if user picks paper 
            if (userchoice== 2){
                if (computerchoice==1){
                    numuser++;
                    System.out.println("You won this round");
                }
                if (computerchoice==2){
                    numties++;
                    System.out.println("It's a tie for this round!");
                    
                }
                if (computerchoice==3){
                    numcomp++;
                    System.out.println("You lost to computer this round! ");
                }
                
            }
            //if user picks scissors
            if (userchoice== 3){
                if (computerchoice==1){
                    numcomp++;
                    System.out.println("You lost to computer! ");
                }
                if (computerchoice==3){
                    numties++;
                    System.out.println("It's a tie!");
                    
                }
                if (computerchoice==1){
                    numuser++;
                    System.out.println("You won ! ");
                }
                
            }
            numrounds--;
            
        }
        //Display results and declare winner 
        System.out.println("number of ties is "+ numties);
        System.out.println("number of user wins" + numuser);
        System.out.println("number of computer wins" + numcomp);
        //JUST THIS NEEDS TO BE FIXED IN CASE EQUAL AND HOW TO REPEAT GAME 
        if (numties> numcomp && numties>numuser){
            System.out.println("TIE");
        }
        else if(numcomp>numties && numcomp>numuser){
            System.out.println("COMPUTERRWIN");
        }
        else if (numuser>numties && numuser>numcomp){
            System.out.println("USERWIN");
        }
        else {
            System.out.println("TIE");
            
        }
        System.out.println("Please enter 1 if want t play again,0 otherwise");
        int val= sc.nextInt();
        if (val == 1) {
            System.out.println("Welcome to a new round!");
            return true;
        }
        if (val == 0) {
            System.out.println("Thanks for playing,goodbye!");
            return false;
        }
        return false;
        
        
    }
    


    public static void main(String[] args) {
        boolean var= true;
        do {
            var= game();
        }
        while (var );
        
        
    }//why put it in main when you can put it in a function and call it from main as much as you want 
    //return gets you the hell outta there so its useful 
    //yiu can use the same scanner 
    //
    
}
