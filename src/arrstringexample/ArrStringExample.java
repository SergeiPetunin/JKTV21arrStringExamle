/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrstringexample;

/**
 *
 * @author spetu
 */
public class ArrStringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word1 = new String("java");
        String text = "Съешь ещё этих французских булок и галет, "
                + "а выпей же чаю с молоком, "
                + "как и я. ";
        String[] words = text.split("\\W+");
        System.out.printf("Words in text = %d%n", words.length);
//        for (String w : words) {
//            System.out.print(w + "; ");
//        }
//        System.out.println("\n-------------------------------");
//        System.out.printf("Using equalsIgnoreCase(%s,%s) = %s%n", word1, words[0], word1.equalsIgnoreCase(words[0]));
//        System.out.printf("Using compareTo(%s,%s) = %s%n", word1, words[0], word1.compareTo(words[0]));
    }
    
}
