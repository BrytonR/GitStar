import java.util.Scanner;
import java.text.DecimalFormat;

public class IdealWeight {
    public static void main(String[]args) {
    
        Scanner scan = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat ("0.##");
        
        System.out.println ("Please enter your height in feet first");
        int Feet = scan.nextInt();
        
        System.out.println ("Now inches");
        int inches = scan.nextInt(); 
        
        int overFiveFeet= (Feet-5); //formula to determine people's weight that are over/under 5 feet
        int changeInHeight = (overFiveFeet*12); //any number not 5 is multiplied by 12 to make up added/subtracted inches  
        
        float idealMaleWeight = (106+(6*(inches+changeInHeight))); //number form changeInHeight is added to inches
        float idealFemaleWeight = (100+(5*(inches+changeInHeight)));
        
        System.out.println ("The ideal weight for your height if you are male is around " + fmt.format(idealMaleWeight*.85) + " to " + fmt.format(idealMaleWeight*1.15));
        System.out.println (); //added 15% by multiplying ideal weight by .85 and 115%
        System.out.println ("The ideal weight for your height if you are female is around " + fmt.format(idealFemaleWeight*.85) + " to " + fmt.format(idealFemaleWeight*1.15));
    }
}
    
