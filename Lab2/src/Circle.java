import java.util.Scanner;
import java.text.DecimalFormat;


public class Circle {
    
    public static void main (String[]args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Please enter a value for the radius") ;
        final double PI= 3.12159; 

        int radius1 = scan.nextInt() ; //User input goes here
        double circumference1 = ((radius1 * PI) * 2);
        double area1= PI * radius1 * radius1;
        
        DecimalFormat fmt = new DecimalFormat ("0.###");

            System.out.println ("The area of a circle with radius " + (radius1) +
                " is " + fmt.format(area1));
            System.out.println ();
            System.out.println ("The circumference of a circle with a radius of " + radius1 + " is "
                + fmt.format(circumference1));
            System.out.println ();
        
       int radius2 = radius1*2; //User input is doubled
       double circumference2 = ((radius2 * PI) * 2);
       double area2 = PI * radius2 *radius2; 
        
            System.out.println ("The area of a circle with radius " + radius2 + 
                " is " + fmt.format(area2)) ; 
            System.out.println ();
            System.out.println ("The circumference of a circle with a radius of " + radius2 + " is "
                + fmt.format(circumference2));
            System.out.println ();
            
      double areachange = (area2/area1); 
      double circumferencechange = (circumference2/circumference1) ;
            System.out.println ("The change in area is " + fmt.format((areachange))) ;
            System.out.println ();
            System.out.println ("The change in circumference is " + fmt.format((circumferencechange))); 
            
    }
}
