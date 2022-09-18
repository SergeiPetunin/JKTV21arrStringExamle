/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrstringexample;

import java.util.Arrays;

/**
 *
 * @author spetu
 */
public class ArrStringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int index1;
        boolean log = true;
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
        
        String word1 = new String("съешь");
        String text = "Съешь ещё этих французских булок и галет,"
                + "да выпей же чаю с молоком,"
                + "как и я.";
        text = text.toLowerCase();
        String[] words = text.split("[^a-zA-Zа-яА-Я0-9_]");
        System.out.printf("Words in text = %d%n", words.length);
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println("");
        System.out.println("\n-------------------------------");
        System.out.printf("Using equalsIgnoreCase(%s,%s) = %s%n", word1, words[0], word1.equalsIgnoreCase(words[0]));
        System.out.printf("Using compareTo(%s,%s) = %s%n", word1, words[0], word1.compareTo(words[0]));
        
        
        int[] massYes = new int[33];
        for(int i = 0; i < 33; i++){
            index1 = text.indexOf(alphabet.charAt(i));
            if(index1 == -1) {
                log = false;
            }else{
                massYes[i] = 1;
            }
        }
        if(log){
            System.out.println("Данный текст содержит все буквы русского алфавита");
        }else{
            System.out.print("Данный текст не содержит следующие буквы русского алфавита: ");
            for(int i = 0; i < 33; i++){
                if(massYes[i] == 0) {
                    System.out.print(alphabet.charAt(i)+" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        

    }
    
}
