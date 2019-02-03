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


public final class Game {
    Player player = new Player();
    Word newWord = new Word();
 
    
    public Game(){
        Random rand = new Random();
        int myRand = rand.nextInt(newWord.words.length);
        welcome();
        answer();
        astAnswer();
        splitAnswer(newWord.ans);
    }
    public void welcome(){
        System.out.println("Welcome to Hangman!");
    }

    public void answer(){
        System.out.println("The word you have to guess is: " + newWord.ans);
    }
    
    public void splitAnswer(String splitAns){
        String[] astArr = splitAns.split("");
        for (int i = 0; i < astArr.length; ++i) {
            System.out.print(astArr[i] + ' ');
        }
    }

    public void astAnswer(){
        System.out.println(newWord.astAns);
    }
    
}
