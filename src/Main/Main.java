/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.*;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in)
          System.out.println("enter a word");
        String inputWord = in.nextLine();

        System.out.print(" ");
        for (int x = 0; x < inputWord.length(); x++) {
            System.out.print(inputWord.charAt(x) + " ");
        }
        System.out.println("* ");

        for (int outside = 0; outside < inputWord.length(); outside++) {
            System.out.print(inputWord.charAt(inputWord.length() - (outside + 1)) + " ");
            for (int inside = 0; inside < inputWord.length(); inside++) {
                System.out.print("* " );
            }
            System.out.println(inputWord.charAt(outside));

        }
        System.out.print("* ");
        for (int x = inputWord.length() - 1; x >= 0; x--) {
            System.out.print(inputWord.charAt(x) + " ");
        }
        System.out.println("* ");
    }

}

