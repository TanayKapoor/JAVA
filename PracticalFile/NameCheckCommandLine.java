package PracticalFile;

public class NameCheckCommandLine {
    public static void main(String[] args) {

        int vowel = 0, consonant = 0;

        for (int i = 0; i < args.length; i++) {
            if (Character.isDigit(args[i].charAt(0))) {
                System.out.println("Numbers are not allowed and names should consist of only characters!");
            } else if (
                    args[i].charAt(0) == 'A' || args[i].charAt(0) == 'a' ||
                            args[i].charAt(0) == 'E' || args[i].charAt(0) == 'e' ||
                            args[i].charAt(0) == 'I' || args[i].charAt(0) == 'i' ||
                            args[i].charAt(0) == 'O' || args[i].charAt(0) == 'o' ||
                            args[i].charAt(0) == 'U' || args[i].charAt(0) == 'u') {
                vowel += 1;
            } else {
                consonant += 1;
            }
        }

        System.out.println("Number of names starting with consonants are: " + consonant);
        System.out.println("Number of names starting with vowels are: " + vowel);

        System.out.println();
    }
}