package Class4;

public class Homework4 {
    public static void main(String[] args) {
        String sentence_3 = "hello dear, how are you?";
        int sentenceLength = sentence_3.length();
        boolean result = sentenceLength > 10 ? true : false;
        System.out.println("Length of this sentence: " + '"' + sentence_3 + '"' + " is greater than 10 characters: " + result);

        String sentence_4 = "We all ARe Good ProgRammeR";
        String sentence_4Replace_R_r = sentence_4.replace('R','r');
        String sentence_4Replace_r_f= sentence_4Replace_R_r.replace('r','f');
        System.out.println('"' + sentence_4 + '"' + " sentence after replace 'r' to 'f': " + sentence_4Replace_r_f);

        String fullName= "Aksana Kuzmichova";
        int fullNameLength = fullName.length();
        System.out.println("My full name length with the space is: " + fullNameLength);

        boolean isFullNameStartsWith_K = fullName.startsWith("K");
        boolean isFullNameStartsWith_k = fullName.startsWith("k");
        boolean isFullNameStartsWith_K_k = isFullNameStartsWith_K || isFullNameStartsWith_k;
        System.out.println("Does my full name starts with 'K'?: " + isFullNameStartsWith_K_k);

        boolean isFullNameContains_a = fullName.contains("a");
        boolean isFullNameContains_A = fullName.contains("A");
        boolean isFullNameContains_a_A = isFullNameContains_a || isFullNameContains_A;
        System.out.println("Does my full name contains 'a'?: " + isFullNameContains_a_A);



    }
}
