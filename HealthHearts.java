
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class HealthHearts {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Waht is your age ? ");
		int age=sc.nextInt();
		int maxhb= 220 -age ;
		int first = (int)(maxhb/2);
		int second = (int)((maxhb*85)/100);
		System.out.println("your maximum heart beat rate should be "+ maxhb +"beats per minute");
		System.out.println("Your target HR zone is "+first +"-" + second +" beats per minute .");//here my statement returns 85-144 ,not sure if cast is the best option !
		
	}
    
    
}
