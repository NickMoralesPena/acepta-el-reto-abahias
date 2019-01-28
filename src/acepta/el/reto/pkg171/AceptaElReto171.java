/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto.pkg171;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class AceptaElReto171 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int nmontaña = sc.nextInt();
            if (nmontaña == 0) {
                break;
            }
            int altura[] = new int[nmontaña];
            int aba = 0;
            for (int i = 0; i < nmontaña; i++) {
                altura[i] = sc.nextInt();

            }
            for (int j = 0; j < nmontaña; j++) {
                int i = j + 1;
                if (i < nmontaña) {
                    if (altura[j]> altura[i])
                      {
                        aba++;
                    }
                }
            }
            System.out.printf("%d", aba + 1);
        }
    }
}
                  
