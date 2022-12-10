
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DogGenetics {
  public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
    System.out.println ("What is your dog's name?");
    String DogName = sc.nextLine();
    Random rand = new Random ();
    int bernard = rand.nextInt(100);
    int chihuaha = rand.nextInt(100-bernard);
    int pug = rand.nextInt(100-chihuaha-bernard);
    int cur = rand. nextInt(100-chihuaha-bernard-pug);
    int Doberman= 100-(cur+pug+chihuaha+bernard);
    System.out.println("Well then, I have this highly reliable report on"+ DogName +"'s prestigious background right here.");
    System.out.println(DogName + "is :");
    System.out.println(bernard + "% St.Bernard");
    System.out.println(chihuaha + "% chihuaha ");
    System.out.println(pug + "% Dramatic RedNosed Asian Pug");
    System.out.println(cur + "% Common Cur");
    System.out.println(Doberman + "% King Doberman");
    System.out.println("Wow, that's QUITE the dog!");
  }
    
    
    
    
    //start by generating random number btw 1-100 ----1
    //gnereate number btw 1-(100-prevnumb)=prev1 ---2
    //generate random number btw 1-(100-prev1) ---3
    //generate random number btw 1-(100-prev2)
    //100- sum of all prev 4 numbers 
    
    
}
