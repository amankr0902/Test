import java.util.*;

public class month {
    
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of your choice to she the month ");
        int choice = sc.nextInt();

        switch (choice){
            case 1 :System.out.println("January");
            break;

            case 2 :System.out.println("febuary");
            break;

            case 3 :System.out.println("March ");
            break;

            case 4 :System.out.println("April");
            break;

            case 5 :System.out.println("May ");
            break;

            case 6 :System.out.println("june ");
            break;

            case 7 :System.out.println("July");
            break;

            case 8 :System.out.println("August");
            break;

            case 9 :System.out.println("September");
            break;

            case 10 :System.out.println("october");
            break;

            case 11 :System.out.println("November");
            break;

            case 12 :System.out.println("December");
            break;

            default : System.out.println("Invalid output ");
        }

    }
}
