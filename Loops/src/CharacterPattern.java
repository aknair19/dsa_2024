public class CharacterPattern {
    public static void main(String[] args) {
        int number = 10;
        char ch = 'A';

        for (int i = 1, charCount = 1; i <= number; i++, charCount++) {
            System.out.print(ch);
            ch++;

            if (charCount == i) {
                System.out.println();
                charCount = 0;
            }
        }
    }
}