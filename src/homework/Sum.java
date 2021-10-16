package homework;
import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        int Sum1 = 0;
        Scanner sn = new Scanner(System.in);
        int[]a= new int[10];
        int i = 0;
        System.out.println("Enter numbers: ");
        while ( i < 10) { //1 various
            a[i]=sn.nextInt();
            Sum1=Sum1+a[i];
            i++;
        }
        System.out.println("Sum1 = "+Sum1);

        int Sum2 = 0; //2 various
        for (int x = 0; x < a.length; x++)
        {
            Sum2 += a[x];
        }
        System.out.println("Sum2 = "+Sum2);

        int Sum3 = 0; //3 various
        int m=0;
        do {
            Sum3 = Sum3 + a[m];
            i++;
        }
        while ( i < 4);
        System.out.println("Sum3 = "+Sum3);
    }
}
