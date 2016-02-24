package main.java.com.springapp.mvc;

/**
 * Created by komal.kochar on 10/28/2015.
 */
public class MinDistance {
    public static void main(String args[]) {
        String sentence = "tum bin jiya jaye kese kese jiya jaye tum bin", word1 = "jaye", word2 = "tum";
        int pos1 = Integer.MAX_VALUE, pos2 = Integer.MAX_VALUE, minPos = Integer.MAX_VALUE;
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(word1.equalsIgnoreCase(words[i]))
                pos1 = i;
            if(word2.equalsIgnoreCase(words[i]))
                pos2 = i;
            if(Math.abs(pos1 - pos2) == 1 ) {
                minPos = 1;
                break;
            }
            if(Math.abs(pos1 - pos2) < minPos){
                minPos = Math.abs(pos1 - pos2);
            }
        }
        System.out.println("Min Difference -- " + minPos);

    }

}
