/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanv1_5;

/**
 * @author Jeklah
 */
import java.util.Random;

public class Word {
    String[] words;
    String astAns;
    String ans;
    int wordRand;
   
   
    public Word() {
        this.words = new String[] {
            "unfortunate",
            "casually",
            "yogurt",
            "malicious",
            "magic",
            "reconstruction",
            "saxophone",
            "train",
            "museum"
        };
        Random rand = new Random();
        this.wordRand = rand.nextInt(words.length);
        this.ans = words[wordRand];
        this.astAns = new String();
        for(int i = 0; i < ans.length(); ++i) {
            this.astAns = astAns.concat("*");
        }
    }
    

    public String getAns() {
        return ans;
    }
}
