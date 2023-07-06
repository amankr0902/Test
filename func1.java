import java.util.*;


public class func1 {

    public static int calculateProd (int a, int b){
    //int prod = a*b;
    return a*b; 
}

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //int prod = calculateProd(a, b);
        System.out.println("product of 2 no"+calculateProd(a, b));
    }

    
}
