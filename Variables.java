/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Ziqi Wu
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Variables {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {       
        System.out.println("//SAMPLE OUTPUT");
        System.out.println("Welcome to the mass calculator, what is your name?");
        Scanner scan=new Scanner(System.in);
        String x;
        //define x    
       
       x=scan.nextLine();
        //nextLine= input letters.
        System.out.println("Hi "+x+"! How old are you?");
        int y=scan.nextInt();
        System.out.println("My, you're getting younger and younger! You sure are looking good for your age! Would you be so kind as to tell me your weight? (on Earth please!)");
        int z=scan.nextInt();
        System.out.println("Let me do a bit of analysis...");
        System.out.println("");
        System.out.println("All done! Here are the results:");
        System.out.println("");
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        System.out.println("Earth:        "+twoDForm.format(z));
        double a=z*0.16;
        System.out.println("The Moon:      "+twoDForm.format(a));
        double b=z*0.37;
        System.out.println("Mars:          "+twoDForm.format(b));
        double c=z*2.364;
        System.out.println("Jupiter:      "+twoDForm.format(c));
        System.out.println("");
        System.out.println("Phew! That was a work-out! Please come back again sometime!");
        
        
    }
    
}
