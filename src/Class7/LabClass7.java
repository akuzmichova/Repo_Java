package Class7;

public class LabClass7 {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (int i=0; i<= letters.length-1; i++) {
            System.out.println("Letter at index-" + i + ": " + letters[i]);
        }
        System.out.println("\n");
        int k = 0;
        while (k<letters.length) {
            System.out.println("Letter at index-" + k + ": " + letters[k]);
            k++;
        }
        System.out.println("\n");
        int l = 0;
        for (char alphabet : letters) {
            System.out.println("Letter at index-" + l + ": " + alphabet);
            l++;
        }
    }
}
