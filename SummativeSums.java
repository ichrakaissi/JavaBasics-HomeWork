/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SummativeSums {
    public static int somme(int[]tab){
        int sum=0;
        for (int i=0; i<tab.length ; i++){
            sum= sum +tab[i];
        }
        return sum;
        
        
    }
    public static void main (String[] args){
        int[] tab1= { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        System.out.println (somme(tab1));
        int[] tab2 = { 999, -60, -77, 14, 160, 301 };
        System.out.println (somme(tab2));
        int[] tab3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;
        System.out.println (somme(tab3));
        
       
        
    }
    
}
