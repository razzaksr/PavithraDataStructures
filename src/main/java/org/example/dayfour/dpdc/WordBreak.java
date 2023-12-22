package org.example.dayfour.dpdc;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static void sumYes(List<String> hi,String phrase, String outcome){
        if(phrase.length()==0){
            System.out.println(outcome);
            return;
        }
        for(int i=1;i<=phrase.length();i++){
            String sub=phrase.substring(0,i);
            if(hi.contains(sub))
                sumYes(hi,phrase.substring(i),outcome+" "+sub);
        }
    }

    public static void main(String[] args) {
        List<String> dictionary= Arrays.asList("this", "th", "is", "famous", "Word", "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem");
        String str="Wordbreakproblem";
        sumYes(dictionary,str,"");
    }
}