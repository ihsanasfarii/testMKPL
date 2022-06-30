/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2_1302194017;

/**
 *
 * @author Komang
 */
import java.util.Scanner;

public class MOD2_Soal1_1302194017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int loop_i, loop_j, a, b;
        int matriks_1302194017[][] = new int[10][10]; 
        int transpose_1302194017[][] = new int[10][10];
        a = 3;
        b = 2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Matriks 3 Baris x 2 Kolom (A= 3 x B= 2) : ");
        System.out.println("Isi Matriks : ");
        
        for(loop_i = 0; loop_i < a; loop_i++){
            for(loop_j = 0; loop_j < b; loop_j++){
                matriks_1302194017[loop_i][loop_j] = scan.nextInt();
            }
        }
        
        for(loop_i = 0; loop_i < a; loop_i++){
            for(loop_j = 0; loop_j < b; loop_j++){
                transpose_1302194017[loop_j][loop_i] = matriks_1302194017[loop_i][loop_j];
            }
        }
        
        System.out.println("Hasil transpose matriks: ");
        for(loop_i = 0; loop_i < b; loop_i++){
            for(loop_j = 0; loop_j < a; loop_j++){
                System.out.print(transpose_1302194017[loop_i][loop_j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
