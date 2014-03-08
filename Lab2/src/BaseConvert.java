import java.util.Scanner; 

public class BaseConvert { 
        
    public static void main(String[] args)
        {
            int base; // the new base
            int base10Num; // the number in base 10
            int maxNumber; //  the maximum number that will fit in 4 digits in the new base 
            
            int place0; // digit in the 1's (base^0) place
            int place1; // digit in the base^1 place 
            int place2; // digit in the base^2 place 
            int place3; // digit in the base^3 place 
            
            String baseBNum = new String ("");
            Scanner scan = new Scanner(System.in); 
            
         // read in the base 10 number and the base 
            System.out.println(); 
            System.out.println ("Base Conversion Program");
            System.out.println() ; 
            System.out.print ("Please enter a base (2-9): "); 
            base = scan.nextInt();
            
            maxNumber=(base*base*base*base)-1;
            
            System.out.print ("Please enter a base 10 number that is " + maxNumber + " or less to convert: ");
            base10Num = scan.nextInt();
            
            place3 = base10Num%base;
            base10Num = base10Num/base;
            place2 = base10Num%base;
            base10Num = base10Num/base;
            place1 = base10Num%base;
            base10Num = base10Num/base;
            place0 = base10Num%base;        //starts with storing the remainder first, then dividing by two. Repeats until all places are filled
            
            System.out.print(place0);
            System.out.print(place1);
            System.out.print(place2);
            System.out.print(place3);    //results prints out
            
            
                                        
            
        
            
           
        }
    }
