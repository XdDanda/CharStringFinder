package me.XdDanda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //define console reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //print some messages
        Messaging.hello();
        Messaging.inputSentenceHelp();

        //define a sentence
        final String sentence = reader.readLine().toUpperCase();
        final int sentenceLength = sentence.length();
        Messaging.printSentence(sentence);

        //print some messages again
        Messaging.inputPhraseHelp();

        //define a phrase
        final String phrase = reader.readLine().toUpperCase();
        final int phraseLength = phrase.length();
        Messaging.printPhrase(phrase);

        //algorithm

        char firstChar = phrase.charAt(0);
        int helper = 0;
        boolean checker = false;
        boolean checker2 = true;
        for (char target : sentence.toCharArray()) {
            if (target == firstChar){
                if (sentenceLength - helper >= phraseLength){
                    //no exception - profiltrováno

                    int counter = helper + 1;
                    for (int i = 1; i <= phraseLength - 1; i++){
                        if (phrase.charAt(i) == sentence.charAt(counter)){
                            checker = true;
                        } else {
                            checker = false;
                            break;
                        }
                        counter++;
                    }
                    if (checker) {

                        //spojení se vypisuje s +1, aby výsledek byl intuitivní i pro člověka, kterému programování není vlastní
                        System.out.println("Slovní spojení " + phrase + " začína na: " + (helper + 1) + " (pro programátory: " + helper + ")");
                        checker2 = false;
                    }
                }
            }
            helper++;
        }
        if (checker2){
            System.out.println("Program si je na 100% jistý, že se v textu žádné uřčené slovní spojení nenachází");
        }
    }
}
