package com.NavdeepKaur;

public class StringInClasss {
    public static void main(java.lang.String[] args){
        java.lang.String str = "hello hello how Are you HELLO are there happy test you";
        System.out.println("String:"+str);
        java.lang.String[] words=str.split(" ");
        int countWord=1;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].toLowerCase().equals(words[j].toLowerCase()))
                {
                    countWord=countWord+1;
                    words[j]="0";
                }
            }
            if(!words[i].equals("0")) {
                System.out.println(words[i].toLowerCase() + "->" + countWord);
            }
            countWord=1;
        }
    }
}

