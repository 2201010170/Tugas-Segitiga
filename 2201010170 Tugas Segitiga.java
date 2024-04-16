/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2luassegitiga;
import java.util.Scanner;
/**
 * @author I Putu Arya
 * Tanggal 16-April-2024
 */
public class TugasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.println("Menghitung luas");
        System.out.println("==========================");
        
        System.out.print("Masukkan alas = ");
        a = input.nextInt();
        System.out.print("Masukkan Tinggi= ");
        t = input.nextInt();
        
        luas= 0.5*a*t;
        System.out.println("Luas segitiga adalah= " + luas);
        
        
        
        
        
    }
    
}
