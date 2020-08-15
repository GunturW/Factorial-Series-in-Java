/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Guntur Wicaksono
 */
import java.util.Scanner;
public class Factorial {
    static int factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return(n * factorial(n-1));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin difactorialkan: ");
        int number = reader.nextInt();
        int numfactorial = factorial(number);
        System.out.printf("Hasil factorial dari %d adalah: %d ", number, numfactorial);
    }
    
}
