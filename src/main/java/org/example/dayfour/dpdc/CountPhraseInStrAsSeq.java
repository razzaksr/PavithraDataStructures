package org.example.dayfour.dpdc;

public class CountPhraseInStrAsSeq {

    public static int count(String alpha, String beta, int sizeAlpha,int sizeBeta){
        if(sizeAlpha==0)
            return 0;
        if(sizeBeta==0)
            return 0;
        if(sizeBeta>sizeAlpha)
            return 0;
        if(sizeAlpha==1&&sizeBeta==1)
            return ((alpha.charAt(0)==beta.charAt(0))?1:0);

        return ((alpha.charAt(sizeAlpha-1)==beta.charAt(sizeBeta-1))?count(alpha,beta,sizeAlpha-1,sizeBeta-1):0) + count(alpha,beta,sizeAlpha-1,sizeBeta);
    }

    public static void main(String[] args) {
        String str="subsequence";
        String phrase="sue";
        System.out.println(count(str,phrase,str.length(),phrase.length()));
        str="subsequence";
        phrase="su";
        System.out.println(count(str,phrase,str.length(),phrase.length()));
    }
}
