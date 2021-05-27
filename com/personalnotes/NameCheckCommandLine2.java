package com.personalnotes;

public class NameCheckCommandLine2 {
    public static void main(String[] args) {
        System.out.println("Utkarsh Dogra\n1955991596\n");

        int vowel=0,consonent=0;
        for (int i=0;i<args.length;i++) {
            if(Character.isDigit(args[i].charAt(0))) {
                System.out.println("Numbers not allowed");
            } else if(
                    args[i].charAt(0)=='A' || args[i].charAt(0)=='a' ||
                            args[i].charAt(0)=='E' || args[i].charAt(0)=='e' ||
                            args[i].charAt(0)=='I' || args[i].charAt(0)=='i' ||
                            args[i].charAt(0)=='O' || args[i].charAt(0)=='o' ||
                            args[i].charAt(0)=='U' || args[i].charAt(0)=='u')
            {vowel +=1;
            } else {consonent +=1;
            }
        }

        System.out.println("Names starting with consonents "+consonent);
        System.out.println("Names starting with vowels "+vowel);
        System.out.println();
    }
}
