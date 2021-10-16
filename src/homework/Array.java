package homework;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Enter numbers: ");
            mass[i] = sn.nextInt();
        }
        for (int j = 0; j < mass.length; j++) {
            System.out.println("Array: [" + j + "]=" + mass[j] + "\t");
        }
    }
}
