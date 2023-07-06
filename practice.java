import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int click=sc.nextInt();
        // System.out.println("Enter a");
        int a=sc.nextInt();
        // System.out.println("Enter b");
        int b=sc.nextInt();

        int result=sc.nextInt();
        switch(click){
            case 1: result=a+b;
            System.out.println("SUm is" +result);
            break;

            default: System.out.println("Invalid");
        }
    }
}
